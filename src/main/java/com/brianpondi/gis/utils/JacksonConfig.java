package com.brianpondi.gis.utils;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    @Bean
    public JtsModule jtsModule() {
        return new JtsModule();
    }

}

