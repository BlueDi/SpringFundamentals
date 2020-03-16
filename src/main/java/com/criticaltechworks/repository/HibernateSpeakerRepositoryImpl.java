package com.criticaltechworks.repository;

import com.criticaltechworks.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Diogo");
        speaker.setLastName("Cruz");

        speakers.add(speaker);

        return speakers;
    }
}
