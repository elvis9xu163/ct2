package com.xjd.ct.utl;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.xjd.ct.utl.context.AppContext;

public abstract class JsonUtil {

	protected static final String FILTER_PWD = "FilterPwd";
	protected static TheadLocalDateFormat dateFormat = new TheadLocalDateFormat();
	protected static ObjectMapper objectMapper = new ObjectMapper();
	protected static ObjectMapper objectMapperIncludeIgnoredProperties = new ObjectMapper();

	static {
		SimpleFilterProvider filterProvider = new SimpleFilterProvider();
		filterProvider.addFilter(FILTER_PWD, new FilterPwdBeanPropertyFilter());
		objectMapper.setDateFormat(dateFormat);
		objectMapper.setAnnotationIntrospector(new FilterPwdJacksonAnnotationIntrospector());
		objectMapper.setFilters(filterProvider);
		objectMapperIncludeIgnoredProperties.setDateFormat(dateFormat);
		objectMapperIncludeIgnoredProperties.setAnnotationIntrospector(new NoIgnoreJacksonAnnotationIntrospector());
		objectMapperIncludeIgnoredProperties.setFilters(filterProvider);
	}

	public static String toString(Object obj) {
		return toString(obj, null);
	}

	public static String toString(Object obj, String datePattern) {
		dateFormat.set(datePattern);
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String toStringIncludeIgnoredProperties(Object obj) {
		return toStringIncludeIgnoredProperties(obj, null);
	}

	public static String toStringIncludeIgnoredProperties(Object obj, String datePattern) {
		dateFormat.set(datePattern);
		try {
			return objectMapperIncludeIgnoredProperties.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static class TheadLocalDateFormat extends SimpleDateFormat {
		private static final long serialVersionUID = -659481710224224430L;
		protected String defaultPattern = DateUtil.PATTERN_YEAR2SECOND;
		protected ThreadLocal<String> patternThreadLocal = new ThreadLocal<String>();

		public void reset() {
			patternThreadLocal.set(null);
		}

		public void set(String pattern) {
			patternThreadLocal.set(pattern);
		}

		public String get() {
			String p = patternThreadLocal.get();
			if (p == null) {
				return defaultPattern;
			} else {
				return p;
			}
		}

		@Override
		public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
			return DateUtil.getFormat(get()).format(date, toAppendTo, fieldPosition);
		}

		@Override
		public Date parse(String source) throws ParseException {
			return DateUtil.getFormat(get()).parse(source);
		}

	}

	public static class FilterPwdJacksonAnnotationIntrospector extends JacksonAnnotationIntrospector {

		@Override
		public Object findFilterId(AnnotatedClass ac) {
			Object rt = super.findFilterId(ac);
			if (rt == null) {
				return FILTER_PWD;
			}
			return rt;
		}

	}

	public static class NoIgnoreJacksonAnnotationIntrospector extends FilterPwdJacksonAnnotationIntrospector {
		@Override
		protected boolean _isIgnorable(Annotated a) {
			return false;
		}

		@Override
		public String[] findPropertiesToIgnore(Annotated ac) {
			return null;
		}

		@Override
		public Boolean findIgnoreUnknownProperties(AnnotatedClass ac) {
			return null;
		}
	}

	public static class FilterPwdBeanPropertyFilter extends SimpleBeanPropertyFilter {
		@Override
		protected boolean include(BeanPropertyWriter writer) {
			return true;
		}

		@Override
		public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov, BeanPropertyWriter writer) throws Exception {
			if (include(writer)) {
				String name = writer.getName();
				if (AppContext.isPwdField(name)) {
					FilterPwdBeanPropertyWriter filterPwdBeanPropertyWriter = new FilterPwdBeanPropertyWriter(writer);
					filterPwdBeanPropertyWriter.serializeAsField(bean, jgen, prov);
				} else {
					writer.serializeAsField(bean, jgen, prov);
				}
			}
		}
	}

	public static class FilterPwdBeanPropertyWriter extends BeanPropertyWriter {

		public FilterPwdBeanPropertyWriter(BeanPropertyWriter base) {
			super(base);
		}

		@Override
		public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception {
			Object value = AppContext.getPwdMask(); // 密码
			// Null handling is bit different, check that first
			if (value == null) {
				if (_nullSerializer != null) {
					jgen.writeFieldName(_name);
					_nullSerializer.serialize(null, jgen, prov);
				}
				return;
			}
			// then find serializer to use
			JsonSerializer<Object> ser = _serializer;
			if (ser == null) {
				Class<?> cls = value.getClass();
				PropertySerializerMap map = _dynamicSerializers;
				ser = map.serializerFor(cls);
				if (ser == null) {
					ser = _findAndAddDynamic(map, cls, prov);
				}
			}
			// and then see if we must suppress certain values (default, empty)
			if (_suppressableValue != null) {
				if (MARKER_FOR_EMPTY == _suppressableValue) {
					if (ser.isEmpty(value)) {
						return;
					}
				} else if (_suppressableValue.equals(value)) {
					return;
				}
			}
			// For non-nulls: simple check for direct cycles
			if (value == bean) {
				_handleSelfReference(bean, ser);
			}
			jgen.writeFieldName(_name);
			if (_typeSerializer == null) {
				ser.serialize(value, jgen, prov);
			} else {
				ser.serializeWithType(value, jgen, prov, _typeSerializer);
			}
		}

	}
}
