package br.com.iot.producer.simulator.api.config.converter;

import br.com.iot.producer.simulator.api.model.EventType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * It transforms a String received via parameter/body into the correct Enum.
 * We need that with webflux, because otherwise it throws an messaging only informing that the some  field is unparsable.
 * With this, if the value cannot be parsed with return null and in the field
 * we must mark with @{@link javax.validation.constraints.NotNull} and set the correct message
 */
@Slf4j
@Component

public class StringToEnumConverter {
    public static class EventTypeConverter implements Converter<String, EventType> {
        @Override
        public EventType convert(String source) {
            try {
                return EventType.valueOf(source);
            } catch (IllegalArgumentException exception) {
                LOG.error("==== Could not convert the string {} to EventType ====", source);
                return null;
            }
        }
    }
}
