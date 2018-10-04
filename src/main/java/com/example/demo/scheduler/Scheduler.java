package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component

    public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);

    @Scheduled(cron = "${scheduling.job.cron}")

    public void cronJobSch() {  //


        LOGGER.info("Krishna");

           /* System.out.println("Java cron job expression:: " + new Date());
            System.out.println("#######Mai##########Chal########Gyi######Hu####");
        */
    }

    @Scheduled(fixedRateString = "${myRate}")
    //@Scheduled(fixedRateString ="${console.myRate}", initialDelay=5000)

    public void fixedRateSch() {

        LOGGER.info("It is printed when fixedRateSch method is invoked");

        /*System.out.println("Fixed Rate scheduler:: " + new Date() + "Hello");
        System.out.println("#######Mai##########Chal########Gyi######Hu####");
    */}

    @Scheduled(fixedDelayString = "${scheduling.job.fixedDelay}" , initialDelayString = "${scheduling.job.initialDelay}")
    public void fixedDelaySch() {

        LOGGER.info("It is printed when fixedDelayString method is invoked");

        /*System.out.println("Fixed Delay scheduler:: " + new Date() + "hello ");
        System.out.println("#######Mai##########Chal########Gyi######Hu####");

    */
    }
}

