package ex.spring.framework.common.util;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;

public class MessageUtil {
	
	private static MessageSourceAccessor msAcc = null;

	public void setMessageSourceAccessor(MessageSourceAccessor msAcc) {
		MessageUtil.msAcc = msAcc;
	}
	
	public static String getMessage(String code) {
		return msAcc.getMessage(code, Locale.getDefault());
	}
	
	public static String getMessage(String code, Object...objs) {
		return msAcc.getMessage(code, objs, Locale.getDefault());
	}
	
	public static String getMessage(Locale locale, String code, Object...objs) {
		return msAcc.getMessage(code, objs, locale);
	}
	
}