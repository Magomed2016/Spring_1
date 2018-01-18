package com.projects.springproject;

import com.projects.springproject.annotation.StringedInstrument;
import com.projects.springproject.interfaces.Instrument;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

//@StringedInstrument
//@Component
public class Zurna implements Instrument {
    public void play()throws Exception {
        System.out.println("tirim-tirim");
    }
}
