package com.projects.springproject;

import com.projects.springproject.annotation.StringedInstrument;
import com.projects.springproject.interfaces.Instrument;
import com.projects.springproject.interfaces.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

//@Component("kenny")
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }
    public void perform() throws Exception  {
        System.out.print("Playing " + song + " : ");

            instrument.play();
//            throw new Exception();

    }
    @Value("the thing of skkrrrrra pa pa pa ka ka skidiki pa pa")
    private String song;
    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }

    /*@Autowired(required = false)
    @StringedInstrument
    @Qualifier("stringed")*/
    @Inject
    @Named("zurna")
    private Instrument instrument;


    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}
