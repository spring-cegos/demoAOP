package fr.cegos.demoaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
/**
 * Je vais définir dans cette classe l'aspect qui correspond
 * à la fonctionnalité transverse de "logguer" les appels aux controlleurs de mon application
 */
public class LoggingAdvice {
    // je crée une fois le logger (plsu besoind e le faire dans les controlleurs)
    private static final Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    /**
     * execution(* fr.cegos.demoaop.controller.*.*(..))
     * tous les appels des méthodes des classes du package fr.cegos.demoaop.controller
     * déclencheront l'execution du code de cette méthode
     */
    @Around("execution(* fr.cegos.demoaop.controller.*.*(..))")
    public Object logAppelMethode(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Appel à la méthode {} du controller {}", joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName());
        // joinPoint.proceed() : permet à l'appel de continuer son cours normal
        return joinPoint.proceed();
    }
}