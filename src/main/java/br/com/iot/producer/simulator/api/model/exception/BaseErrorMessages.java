package br.com.iot.producer.simulator.api.model.exception;

import java.text.MessageFormat;
import java.util.ResourceBundle;


public class BaseErrorMessages {

    public static BaseErrorMessages GENERIC_ERROR = new BaseErrorMessages("generic");
    public static BaseErrorMessages GENERIC_INVALID_PARAMETERS = new BaseErrorMessages("generic.invalid.parameters");

    private final String key;
    private String[] params;

    public BaseErrorMessages(String key) {
        this.key = key;
    }

    public BaseErrorMessages withParams(String[] params) {
        this.params = params;
        return this;
    }

    public String getMessage() {
        String message = ResourceBundle.getBundle("messages.ErrorResource").getString(key);
        if (params != null) {
            final MessageFormat fmt = new MessageFormat(message);
            message = fmt.format(params);
        }
        return message;
    }
}
