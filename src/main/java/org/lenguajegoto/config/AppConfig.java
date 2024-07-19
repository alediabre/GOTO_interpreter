package org.lenguajegoto.config;

import org.lenguajegoto.dto.GotoResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@ComponentScan("org.lenguajegoto")
public class AppConfig {

    @Bean
    public GotoResponse initialResponse(){
        return new GotoResponse(true, new ArrayList<>(), 0,null);
    }
}
