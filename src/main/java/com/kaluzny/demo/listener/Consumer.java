package com.kaluzny.demo.listener;

import com.kaluzny.demo.domain.Automobile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Consumer {

    @JmsListener(destination = "AutoTopic", containerFactory = "automobileJmsContFactory")
    public void getAutomobileListener1(Automobile automobile) {
        log.info("\u001B[32m" + "Automobile Consumer 1: " + automobile + "\u001B[0m");
    }

    @JmsListener(destination = "AutoTopic", containerFactory = "automobileJmsContFactory")
    public void getAutomobileListener2(Automobile automobile) {
        log.info("\u001B[33m" + "Automobile Consumer 2: " + automobile + "\u001B[0m");
    }

    @JmsListener(destination = "AutoTopic", containerFactory = "automobileJmsContFactory")
    public void getAutomobileListener3(Automobile automobile) {
        log.info("\u001B[34m" + "Automobile Consumer 3: " + automobile + "\u001B[0m");
    }

    @JmsListener(destination = "AutoTopicByColor", containerFactory = "automobileJmsContFactory")
    public void getAutomobileListener4(List<Automobile> automobiles) {
        log.info("\u001B[34m" + "Automobile Consumer 4: " + automobiles.size() + "\u001B[0m");
    }

    @JmsListener(destination = "AutoTopicByColor", containerFactory = "automobileJmsContFactory")
    public void getAutomobileListener5(List<Automobile> automobiles) {
        log.info("\u001B[34m" + "Automobile Consumer 5: " + automobiles.size() + "\u001B[0m");
    }

}
