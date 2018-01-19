package com.projects.springproject;

import com.projects.springproject.interfaces.Contestant;
import com.projects.springproject.interfaces.Performer;
import com.projects.springproject.interfaces.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config-springIdol.xml");

        Performer performer = (Performer)ctx.getBean("kenny");
        performer.perform();

       /* Thinker thinker = (Thinker)ctx.getBean("volunteer");
        thinker.thinkOfSomething("kuku");*/

       /* Contestant contestant = (Contestant)ctx.getBean("kenny");
        contestant.receiveAward();*/
    }
}
