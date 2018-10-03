package com.example.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
    public class Scheduler {
        @Scheduled(cron = "*/5 * * * * * ")
        public void cronJobSch() {
            System.out.println("Java cron job expression:: " + new Date());
            System.out.println("#######Mai##########Chal########Gyi######Hu####");
        }
    @Scheduled(fixedRate = 1000)
    public void fixedRateSch() {

        System.out.println("Fixed Rate scheduler:: " + new Date() + "Hello");
        System.out.println("#######Mai##########Chal########Gyi######Hu####");

    }

    @Scheduled(fixedDelay = 1000, initialDelay = 3000)
    public void fixedDelaySch() {
        System.out.println("Fixed Delay scheduler:: " + new Date() + "hello ");
        System.out.println("#######Mai##########Chal########Gyi######Hu####");

    }
    }
