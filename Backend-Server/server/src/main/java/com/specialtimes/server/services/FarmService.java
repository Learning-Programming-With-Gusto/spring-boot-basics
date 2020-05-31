package com.specialtimes.server.services;

import com.specialtimes.server.models.Farm;
import com.specialtimes.server.models.Potato;
import com.specialtimes.server.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FarmService {

    private final FarmRepository farmRepository;

    @Autowired
    public FarmService(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    public ResponseEntity<List<Farm>> getFarms() {
        ResponseEntity<List<Farm>> farmListResponseEntity;
        List<Farm> farmList = this.farmRepository.findAll();

        farmListResponseEntity = new ResponseEntity<>(farmList, HttpStatus.OK);
        return farmListResponseEntity;
    }

    public ResponseEntity<Farm> addNewFarm() {
        Random random = new Random();
        ResponseEntity<Farm> farmResponseEntity;
        Farm farm = new Farm();

        List<Potato> potatoList = new ArrayList<>();
        Potato potato = new Potato();
        potato.setSize(random.nextInt(50));
        potato.setCost(random.nextInt(5));
        potatoList.add(potato);

        farm.setPotatoList(potatoList);
        farm = this.farmRepository.save(farm);


        farmResponseEntity = new ResponseEntity<Farm>(farm, HttpStatus.OK);
        return farmResponseEntity;
    }
}
