package com.specialtimes.server.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Potato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int size;

    private int cost;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
