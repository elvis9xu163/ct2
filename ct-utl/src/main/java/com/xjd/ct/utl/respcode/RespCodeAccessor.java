package com.xjd.ct.utl.respcode;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 返回码对应消息访问
 * 
 * @author elvis.xu
 * @since 2015-02-15
 */
@Component
public class RespCodeAccessor {
	private static Logger log = LoggerFactory.getLogger(RespCodeAccessor.class);

	protected static RespCodeAccessor instance;

	protected Properties respCodeProperties;

	@Autowired
	public RespCodeAccessor(@Qualifier("respCodeProperties") Properties properties) {
		if (instance == null) {
			this.respCodeProperties = properties;
			log.info("RespCode Message loaded: {}", properties.size());
			if (log.isDebugEnabled()) {
				StringWriter writer = new StringWriter(properties.size() * 30);
				properties.list(new PrintWriter(writer));
				log.debug("RespCode Message as follow:\r\n" + writer.toString());
			}
			instance = this;
		} else {
			log.warn("RespCode Message has bean loaded!");
		}
	}

	public static Properties getProperties() {
		if (instance == null) {
			log.warn("RespCode Message does not load!");
			return null;
		}
		return instance.respCodeProperties;
	}

	public static String getMessage(String key) {
		Properties props = getProperties();
		if (props != null) {
			return props.getProperty(key);
		}
		return null;
	}

}
