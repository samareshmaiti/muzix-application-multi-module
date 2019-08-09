package com.stackroute.microservice;

import com.stackroute.microservice.filters.ErrorFilter;
import com.stackroute.microservice.filters.PostFilter;
import com.stackroute.microservice.filters.PreFilter;
import com.stackroute.microservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.context.support.UiApplicationContextUtils;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceDemoApplication {
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

}
