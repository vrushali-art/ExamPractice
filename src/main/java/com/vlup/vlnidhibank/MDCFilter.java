package com.vlup.vlnidhibank;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

@Component
public class MDCFilter implements Filter {

    private static final String CORRELATION_ID_HEADER_NAME = "X-Correlation-Id";
    private static final String TRACKING_ID = "trackingId";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String correlationId = httpServletRequest.getHeader(CORRELATION_ID_HEADER_NAME);

       if (correlationId == null) {
            correlationId = UUID.randomUUID().toString();
        }

        MDC.put(TRACKING_ID, correlationId);

        try {
            chain.doFilter(request, response);
        } finally {
            MDC.remove(TRACKING_ID);
        }
    }

    @Override
    public void destroy() {
        // Cleanup if needed
    }
}
