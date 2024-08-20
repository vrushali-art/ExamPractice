package com.nidhibank;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	private static final String TRACKING_ID = "trackingId";

	@Before("execution(* com.vlup.vlnidhibank..*(..))")
	public void logBefore(JoinPoint joinPoint) {
		String trackingId = MDC.get(TRACKING_ID);
		logger.info("TRACEID={} | Entering method: {} with arguments: {}", trackingId,
				joinPoint.getSignature().getName(), joinPoint.getArgs());
	}

	@AfterReturning(pointcut = "execution(* com.vlup.vlnidhibank..*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		String trackingId = MDC.get(TRACKING_ID);
		logger.info("TRACEID={} | Exiting method: {} with result: {}", trackingId, joinPoint.getSignature().getName(),
				result);
	}
}
