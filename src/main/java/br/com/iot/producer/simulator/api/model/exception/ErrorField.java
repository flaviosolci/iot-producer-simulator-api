package br.com.iot.producer.simulator.api.model.exception;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ErrorFields {

    private String field;
    private String description;


}
