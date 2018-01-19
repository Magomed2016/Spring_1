package com.projects.springproject;

import com.projects.springproject.interfaces.CriticismEngine;
import javafx.application.Application;
import javafx.stage.Stage;

public aspect JudgeAspect {

    public JudgeAspect() {}
    pointcut performance() : execution(* perform(..));
    after() returning() : performance() {
        System.out.println(criticismEngine);
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
