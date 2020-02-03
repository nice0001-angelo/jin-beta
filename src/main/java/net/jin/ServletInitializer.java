/*
 * This is a Jin-beta Project
 * File name : ServletInitializer.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : ServletInitializer
 */
package net.jin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JinBetaApplication.class);
	}

}
