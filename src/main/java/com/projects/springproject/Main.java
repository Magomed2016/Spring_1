package com.projects.springproject;

import com.projects.springproject.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config-springIdol.xml");

        Performer performer = (Performer)ctx.getBean("kenny");
        performer.perform();
    }
}
