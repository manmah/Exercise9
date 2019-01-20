package com.maher;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleJob {

    @Scheduled(fixedRate = 5000)
    void excute(){
        System.out.println(new Date() + " - I am Scheduled job");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
