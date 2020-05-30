package com.specialtimes.server.services;

import com.specialtimes.server.models.Potato;
import com.specialtimes.server.repositories.PotatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotatoService {

    private final PotatoRepository potatoRepository;

    @Autowired
    public PotatoService(PotatoRepository potatoRepository) {
        this.potatoRepository = potatoRepository;
    }

    public ResponseEntity<List<Potato>> getAllPotatoes() {
        ResponseEntity<List<Potato>> listOfPotatoesResponseEntity;
        List<Potato> potatoList = potatoRepository.findAll();
        listOfPotatoesResponseEntity = new ResponseEntity<>(potatoList, HttpStatus.OK);
        return listOfPotatoesResponseEntity;
    }
}
