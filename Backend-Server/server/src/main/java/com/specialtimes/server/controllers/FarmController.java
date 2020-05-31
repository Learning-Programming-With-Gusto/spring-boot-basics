package com.specialtimes.server.controllers;

import com.specialtimes.server.models.Farm;
import com.specialtimes.server.services.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("farms")
public class FarmController {

    private final FarmService farmService;

    @Autowired
    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Farm>> getAllFarms() {
        return this.farmService.getFarms();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Farm> addRandomFarm() {
        return this.farmService.addNewFarm();
    }
}
