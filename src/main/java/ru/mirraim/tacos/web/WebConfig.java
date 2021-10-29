package ru.mirraim.tacos.web;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * controller that does nothing but forward the request to a view
 */
public class WebConfig implements WebMvcConfigurer {

    /**
     * addViewControllers() method is given a ViewControllerRegistry that you can use to
     * register one or more view controllers. Here, you call addViewController() on the registry,
     * passing in “/”, which is the path for which your view controller will handle GET requests. That
     * method returns a ViewControllerRegistration object, on which you immediately call
     * setViewName() to specify home as the view that a request for “/” should be forwarded to
     * @param registry ViewControllerRegistry object
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
