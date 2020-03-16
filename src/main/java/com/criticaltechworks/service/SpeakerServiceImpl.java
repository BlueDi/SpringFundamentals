package com.criticaltechworks.service;

import com.criticaltechworks.model.Speaker;
import com.criticaltechworks.repository.HibernateSpeakerRepositoryImpl;
import com.criticaltechworks.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
