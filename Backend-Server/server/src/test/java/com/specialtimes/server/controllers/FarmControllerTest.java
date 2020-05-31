package com.specialtimes.server.controllers;

import com.specialtimes.server.models.Farm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FarmControllerTest {

    @Autowired
    private FarmController farmController;

    @Test
    public void testGetFarms() {
        ResponseEntity<List<Farm>> farmListResponseEntity = farmController.getAllFarms();
        List<Farm> farmList = farmListResponseEntity.getBody();

        assertEquals(HttpStatus.OK, farmListResponseEntity.getStatusCode());
    }
}