package com.joymenu.testapiversion.config;

import com.joymenu.testapiversion.CustomRequestMappingHandlerMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author buxg
 * @version 1.0
 * @description WebMvcConfig
 * @date 2023/9/20 16:27
 */
@Slf4j
@SpringBootConfiguration
public class WebMvcConfig implements WebMvcRegistrations {

    //注册ApiVersionHandlerMapping组件
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new CustomRequestMappingHandlerMapping();
    }
}
