package com.engine.query_engine.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("indexed_data")
public class IndexedEntry {
    
    @Id
    public String id;

    public String word;

    public String url;

    public float weight;

    public IndexedEntry(String word, String url, float weight){
        this.word = word;
        this.url = url;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return String.format(
        "Customer[id=%s, Word='%s', Url='%s', Weight='%s']",
        id, word, url, weight);
    }
}
