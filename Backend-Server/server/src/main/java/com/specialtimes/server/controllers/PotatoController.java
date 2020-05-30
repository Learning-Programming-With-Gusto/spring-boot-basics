package com.specialtimes.server.controllers;

import com.specialtimes.server.models.Potato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PotatoController {

    @RequestMapping("/potatoes")
    public ResponseEntity<List<Potato>> getAllPotatoes() {
        return getAllPotatoes();
    }
}
