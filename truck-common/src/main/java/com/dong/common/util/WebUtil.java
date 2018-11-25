package com.dong.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cheguangai
 * @date 2018/11/26 0026
 */
public class WebUtil {
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if (requestAttributes == null) {
			return null;
		}
		return requestAttributes.getRequest();
	}

	public static ApplicationContext getRootApplicationContext(){
		return (ApplicationContext) getRequest().getServletContext().getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
	}

	public static ApplicationContext getServletApplicationContext(){
		return (ApplicationContext) getRequest().getServletContext().getAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatchServlet");
	}
}
