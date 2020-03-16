package com.criticaltechworks.repository;

import com.criticaltechworks.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
