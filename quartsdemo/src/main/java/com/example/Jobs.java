package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Wang Chong
 * @description
 * @date 2017/3/10
 */
@Component
public class Jobs {
    public final static long ONE_Minute =  1000;

    @Scheduled(cron="0 */28 * * * ?")
    public void cronJob() {
        System.out.println(new Date()+" >>cron执行....");
    }

    @Scheduled(cron="0 0 * * * ?")
    public void cronJob2() {
        System.out.println(new Date()+" >>cron执行2....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println(new Date()+" >>fixedRate执行....");
    }
}
