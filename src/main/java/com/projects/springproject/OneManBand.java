package com.projects.springproject;

import com.projects.springproject.interfaces.Instrument;
import com.projects.springproject.interfaces.Performer;

import java.util.Collection;

public class OneManBand implements Performer {
    public OneManBand() {
    }
    public void perform()throws Exception {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }

}
