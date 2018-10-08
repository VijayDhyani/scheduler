package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);

    @Scheduled(cron = "${scheduling.job.cron}")
    public void cronJobSch() {
        LOGGER.info("Krishna");
    }

    public String printHello() {
        LOGGER.debug("vijay");
        return "This is an debug message";
    }

    public String printError() {
        LOGGER.error("this is an error");
        return "this is an error message";
    }

    @Scheduled(fixedRateString = "${myRate}")
    public void fixedRateSch() {

        LOGGER.warn("It is printed when fixedRateSch method is invoked");
    }

    @Scheduled(fixedDelayString = "${scheduling.job.fixedDelay}", initialDelayString = "${scheduling.job.initialDelay}")
    public void fixedDelaySch() {

        LOGGER.error("It is printed when fixedDelayString method is invoked");
    }
}

