package com.projects.springproject;


import com.projects.springproject.interfaces.Contestant;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {
    @DeclareParents( // Внедрение интерфейса Contestant
            value = "com.projects.springproject.interfaces.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;

}
