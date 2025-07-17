package com.engine.query_engine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.engine.query_engine.entities.IndexedEntry;
import com.engine.query_engine.repositories.IndexedEntryRepository;

@Service
public class IndexedEntryService {

    private final IndexedEntryRepository indexedEntryRepository;

    public IndexedEntryService(IndexedEntryRepository indexedEntryRepository) {
        this.indexedEntryRepository = indexedEntryRepository;
    }

    public List<IndexedEntry> getEntriesByWord(String word) {
        return indexedEntryRepository.findByword(word);
    }

    public List<IndexedEntry> getAllEntries(){
        return indexedEntryRepository.findAll();
    }
}
