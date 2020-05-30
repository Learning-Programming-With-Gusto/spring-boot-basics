package com.specialtimes.server.controllers;

import com.specialtimes.server.models.Potato;
import com.specialtimes.server.services.PotatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/potatoes")
public class PotatoController {

    private final PotatoService potatoService;

    @Autowired
    public PotatoController(PotatoService potatoService) {
        this.potatoService = potatoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Potato>> getAllPotatoes() {
        return potatoService.getAllPotatoes();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List<Potato>> addPotato(@RequestBody Potato potato) {
        return potatoService.getAllPotatoes();
    }
}
