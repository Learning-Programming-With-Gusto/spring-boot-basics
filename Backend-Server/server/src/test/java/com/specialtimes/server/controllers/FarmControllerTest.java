package com.specialtimes.server.controllers;

import com.specialtimes.server.models.Farm;
import com.specialtimes.server.repositories.FarmRepository;
import com.specialtimes.server.services.FarmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FarmControllerTest {

    @Autowired
    private FarmController farmController;

    @Autowired
    private FarmService farmService;

    @Test
    public void testGetFarms() {
        farmService.addNewFarm();
        farmService.addNewFarm();
        farmService.addNewFarm();

        ResponseEntity<List<Farm>> farmListResponseEntity = farmController.getAllFarms();
        List<Farm> farmList = farmListResponseEntity.getBody();

        assertEquals(HttpStatus.OK, farmListResponseEntity.getStatusCode());
        assertEquals(3, Objects.requireNonNull(farmListResponseEntity.getBody()).size());
    }
}