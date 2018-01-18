package com.projects.springproject;

import com.projects.springproject.annotation.StringedInstrument;
import com.projects.springproject.interfaces.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

//@Qualifier("stringed")
//@StringedInstrument
//@Component
public class Saxophone implements Instrument {
    public Saxophone() {
    }
    public void play()throws Exception {
        System.out.println("TOOT TOOT TOOT");
    }
}
