package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value="classpath:com/nt/cfgs/applicationContext.xml")
public class AppConfig {

}
