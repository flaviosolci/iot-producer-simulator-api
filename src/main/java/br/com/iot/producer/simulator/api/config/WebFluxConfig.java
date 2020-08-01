package br.com.iot.producer.simulator.api.config;

import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Component
public class WebFluxConfig implements WebFluxConfigurer {

    private final LocalValidatorFactoryBean validatorFactoryBean;

    public WebFluxConfig(LocalValidatorFactoryBean validatorFactoryBean) {
        this.validatorFactoryBean = validatorFactoryBean;
    }

    @Override
    public Validator getValidator() {
        return validatorFactoryBean;
    }
}
