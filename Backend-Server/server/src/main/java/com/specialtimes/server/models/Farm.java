package com.specialtimes.server.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Farm {

    @JoinTable(name = "Farm_To_Potato")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Potato> potatoList;

    public List<Potato> getPotatoList() {
        return potatoList;
    }

    public void setPotatoList(List<Potato> potatoList) {
        this.potatoList = potatoList;
    }
}
