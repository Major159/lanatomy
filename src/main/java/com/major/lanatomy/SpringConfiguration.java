package com.major.lanatomy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
public class SpringConfiguration {

    @Bean
    @ConfigurationProperties("lanatomy")
    @Validated
    public LanatomyProperties getProperties() {
        return new LanatomyProperties();
    }

    @Bean
    public SteamController getSteamController(final LanatomyProperties properties) {
        return new SteamController(properties.getSteamApiKey());
    }
}
