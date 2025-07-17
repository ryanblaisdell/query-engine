package com.engine.query_engine.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.engine.query_engine.entities.IndexedEntry;
import com.engine.query_engine.services.IndexedEntryService;

/**
 * - need to implement a GET controller that can be called to return a processed list of the indexed data based on the user's query
 * 
 * basic architecture:
 *  - controller layer
 *  - service layer
 *  - repository layer
 *  - DTOs
 *  - model layer
 *  - validation
 **/

@RestController
public class IndexedDataController {

    private final IndexedEntryService indexedEntryService;

    public IndexedDataController(IndexedEntryService indexedEntryService) {
        this.indexedEntryService = indexedEntryService;
    }

    @GetMapping("/search/{word}")
    public List<IndexedEntry> searchByWord(@PathVariable String word) {
        return indexedEntryService.getEntriesByWord(word);
    }

    @GetMapping("/")
    public List<IndexedEntry> getAllWords() {
        return indexedEntryService.getAllEntries();
    }
    
}