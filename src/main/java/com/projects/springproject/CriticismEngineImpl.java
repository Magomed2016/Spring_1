package com.projects.springproject;

public class CriticismEngineImpl {

    public CriticismEngineImpl() {}

    public  String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }


    private String[] criticismPool;
    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
