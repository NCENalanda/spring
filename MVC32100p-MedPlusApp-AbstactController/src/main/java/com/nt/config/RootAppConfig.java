package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={PersistenceAppConfig.class,ServiceAppConfig.class,AopAppConfig.class })
public class RootAppConfig {

}
