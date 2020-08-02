package br.com.iot.producer.simulator.api.config;

import br.com.iot.producer.simulator.api.config.converter.StringToEnumConverter;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.nio.charset.StandardCharsets;

@Component
public class WebFluxConfig implements WebFluxConfigurer {

    @Override
    public Validator getValidator() {
        return localValidatorFactoryBean();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(StringToEnumConverter.eventTypeConverter());
    }

    private MessageSource messageSource() {
        final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages/ErrorResource");
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.displayName());
        return messageSource;
    }

    private LocalValidatorFactoryBean localValidatorFactoryBean() {
        final LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
        factoryBean.setValidationMessageSource(messageSource());
        return factoryBean;
    }
}
