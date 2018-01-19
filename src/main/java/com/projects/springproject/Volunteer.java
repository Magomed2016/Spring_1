package com.projects.springproject;

import com.projects.springproject.interfaces.Thinker;

public class Volunteer implements Thinker {

    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }
    public String getThoughts() {
        return thoughts;
    }
}
