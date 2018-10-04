package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component

    public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);

    @Scheduled(cron = "${scheduling.job.cron}")

    public void cronJobSch() {//run after every 5 seconds
        LOGGER.info("Krishna");
    }

    @Scheduled(fixedRateString = "${myRate}")

    public void fixedRateSch() {//takes 3 sec delay to come in action

        LOGGER.info("It is printed when fixedRateSch method is invoked");

    }

    @Scheduled(fixedDelayString = "${scheduling.job.fixedDelay}" , initialDelayString = "${scheduling.job.initialDelay}")
    public void fixedDelaySch() { //takes 5 sec delay to come in action with an initial delay of 5 sec

        LOGGER.info("It is printed when fixedDelayString method is invoked");

    }
}

