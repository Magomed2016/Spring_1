package com.projects.springproject;

import com.projects.springproject.interfaces.MineReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magican implements MineReader {
    private String thoughts;

    @Pointcut("execution(* com.projects.springproject.interfaces.Thinker.thinkOfSomething(String))&& args(thoughts)")
    public void think(String thoughts){}

    @Before("think(thoughts)")
    public void interceptThoughts(String thoughts) {
        this.thoughts = thoughts;
        System.out.println("Intercepting volunteer’s thoughts: "+thoughts);

    }
    public String getThoughts() {
        return thoughts;
    }

}
