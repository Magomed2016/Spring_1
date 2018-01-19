package com.projects.springproject;

import com.projects.springproject.interfaces.Contestant;



public class GraciousContestant implements Contestant {

    private String string;

    public void receiveAward() {
        System.out.println(string+" гит: you are looser");
    }
}
