package com.xjd.ct.utl.context;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 应用上下文
 * 
 * @author elvis.xu
 * @since 2015-02-15
 */
@Component
public class AppContext {
	private static Logger log = LoggerFactory.getLogger(AppContext.class);

	public static final String KEY_ENV = "app.env";
	public static final String VAL_ENV_PRODUCT = "product";
	public static final String KEY_SIGN_DISABLED = "app.sign.disabled";
	public static final String VAL_SIGN_DISABLED_YES = "1";

	protected static AppContext instance;

	protected ApplicationContext springContext;
	protected Properties properties;
	protected boolean isEnvProduct;
	protected boolean isSignDisabled;

	@Autowired
	public AppContext(ApplicationContext springContext, @Qualifier("properties") Properties properties) {
		if (instance == null) {
			this.springContext = springContext;
			this.properties = properties;
			if (this.properties != null) {
				isEnvProduct = VAL_ENV_PRODUCT.equalsIgnoreCase(this.properties.getProperty(KEY_ENV));
				isSignDisabled = VAL_SIGN_DISABLED_YES.equalsIgnoreCase(this.properties.getProperty(KEY_SIGN_DISABLED));
			}
			log.info(
					"AppContext inited: isEnvProduct=[{}], isSignDisabled=[{}], properties.size=[{}], springContext=[{}]",
					isEnvProduct, isSignDisabled, this.properties.size(), this.springContext);
			if (log.isDebugEnabled()) {
				StringWriter writer = new StringWriter(properties.size() * 30);
				properties.list(new PrintWriter(writer));
				log.debug("AppContext properties as follow:\r\n" + writer.toString());
			}
			instance = this;
		} else {
			log.warn("AppContext has been inited!");
		}
	}

	/**
	 * 判断当前对象是否初始化了
	 */
	protected static void assertInited() {
		if (instance == null) {
			log.warn("AppContext does not init!");
		}
	}

	/**
	 * 获取Spring的上下文
	 * 
	 * @return
	 */
	public static ApplicationContext getSpringContext() {
		assertInited();
		return instance == null ? null : instance.springContext;
	}

	/**
	 * 判断当前是否为生产环境 用于环境不同的处理，如：生产环境不能打印密码等敏感信息
	 *
	 * @return
	 */
	public static boolean isEnvProduct() {
		assertInited();
		return instance == null ? false : instance.isEnvProduct;
	}

	/**
	 * 判断当前环境是否需要取消校验签名sign
	 *
	 * @return
	 */
	public static boolean isSignDisabled() {
		assertInited();
		return instance == null ? false : instance.isSignDisabled;
	}

	/**
	 * 获取所有配置信息
	 *
	 * @return
	 */
	public static Properties getProperties() {
		assertInited();
		return instance == null ? null : instance.properties;
	}

	/**
	 * 获取配置信息
	 *
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		Properties props = getProperties();
		if (props != null) {
			return props.getProperty(key);
		}
		return null;
	}

	/**
	 * 获取配置信息以长整型返回
	 *
	 * @param key
	 * @return
	 */
	public static long getPropertyLong(String key) {
		String prop = StringUtils.trim(getProperty(key));
		if (StringUtils.isEmpty(prop)) {
			throw new RuntimeException("The value of the property '" + key + "' does not set.");
		}
		try {
			return Long.valueOf(prop);
		} catch (NumberFormatException e) {
			throw new RuntimeException("The value of the property '" + key + "' must be Long: " + prop);
		}
	}

	/**
	 * 是否为密码项
	 *
	 * @param name
	 * @return
	 */
	public static boolean isPwdField(String name) {
		if (!isEnvProduct()) { // 非生产环境打印密码
			return false;
		}

		name = StringUtils.trimToNull(name);

		if (name != null
				&& (name.endsWith("pwd") || name.endsWith("Pwd") || name.endsWith("password") || name
						.endsWith("Password"))) {
			return true;
		}
		return false;
	}

	/**
	 * 密码项的Mask
	 *
	 * @return
	 */
	public static String getPwdMask() {
		return "[******]";
	}

}
