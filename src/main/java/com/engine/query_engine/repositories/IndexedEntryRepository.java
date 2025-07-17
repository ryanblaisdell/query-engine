package com.engine.query_engine.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.engine.query_engine.entities.IndexedEntry;

public interface IndexedEntryRepository extends MongoRepository<IndexedEntry, String> {
    
    public List<IndexedEntry> findByword(String word);

    public List<IndexedEntry> findAll();
}
