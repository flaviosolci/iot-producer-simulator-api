package br.com.iot.producer.simulator.api.exception;

import br.com.iot.producer.simulator.api.model.exception.BaseErrorMessages;

public class UnauthenticatedException extends BaseException {

    public UnauthenticatedException(Throwable cause) {
        super(BaseErrorMessages.GENERIC_UNAUTHENTICATED_EXCEPTION, cause);
    }
}
