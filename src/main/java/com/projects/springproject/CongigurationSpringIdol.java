package com.projects.springproject;

import com.projects.springproject.interfaces.Instrument;
import com.projects.springproject.interfaces.Performer;
import com.projects.springproject.interfaces.Poem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CongigurationSpringIdol {

    @Bean
    public Performer duke(){
        return new PoeticJuggler(sonnet29());
    }
    @Bean
    public Performer kenny(){
         return new Instrumentalist();
    }

    @Bean
    public Instrument zurna(){
        return new Zurna();
    }

    @Bean
    public Instrument saxophone(){
        return new Saxophone();
    }

    @Bean
    public Poem sonnet29(){
        return  new Sonnet29();
    }



}
