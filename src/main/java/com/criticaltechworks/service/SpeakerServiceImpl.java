package com.criticaltechworks.service;

import com.criticaltechworks.model.Speaker;
import com.criticaltechworks.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl no args constructor");
        repository = speakerRepository;
    }

    @PostConstruct
    private void init() {
        System.out.println("We are called after the constructors");
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
