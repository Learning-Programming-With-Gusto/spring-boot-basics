package com.specialtimes.server.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinTable(name = "Farm_To_Potato")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Potato> potatoList;

    public List<Potato> getPotatoList() {
        return potatoList;
    }

    public void setPotatoList(List<Potato> potatoList) {
        this.potatoList = potatoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
