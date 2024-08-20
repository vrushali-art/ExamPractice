package com.nidhibank.exceptions;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class CustomContextRuntimeException extends RuntimeException {

	private final Map<String, Object> context = new HashMap<>();

    public CustomContextRuntimeException(String message, Throwable exception) {
        super(message, exception);
    }

    public CustomContextRuntimeException addContextValue(String key, Object value) {
        context.put(key, value);
        return this;
    }

    public Map<String, Object> getContext() {
        return context;
    }
}
