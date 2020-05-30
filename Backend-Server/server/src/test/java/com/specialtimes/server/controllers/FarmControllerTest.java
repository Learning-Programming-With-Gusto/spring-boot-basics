package com.specialtimes.server.controllers;

import com.specialtimes.server.services.FarmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FarmControllerTest {

    @Autowired
    private FarmService farmService;

    @Test
    public void testGetFarms() {

    }
}