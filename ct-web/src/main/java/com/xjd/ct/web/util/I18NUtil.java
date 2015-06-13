package com.xjd.ct.web.util;

import com.xjd.ct.utl.respcode.RespCodeAccessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class I18NUtil {

    public static String getMsg(String code) {
        return getMsg(code, null, null);
    }

    public static String getMsg(String code, Object[] args) {
        return getMsg(code, args, null);
    }

    public static String getMsg(String code, String defaultMsg) {
        return getMsg(code, null, defaultMsg);
    }

    public static String getMsg(String code, Object[] args, String defaultMsg) {
        return getMessage(code, args, defaultMsg, Locale.getDefault());
    }

    public static String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        String msg = RespCodeAccessor.getMessage(code);
        msg = StringUtils.isBlank(msg) ? defaultMessage : msg;
        String s = instance.messageSource.getMessage(code, args, msg, locale);
        if (s == null) {
            s = DEFAULT_MESSAGE;
        }
        return s;
    }

    public static final String DEFAULT_MESSAGE = "Unknown Code";
    protected static I18NUtil instance;

    @Autowired
    MessageSource messageSource;

    public I18NUtil() {
        instance = this;
    }
}
