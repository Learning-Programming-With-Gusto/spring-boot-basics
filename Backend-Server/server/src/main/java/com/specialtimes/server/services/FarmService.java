package com.specialtimes.server.services;

import com.specialtimes.server.models.Farm;
import com.specialtimes.server.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
