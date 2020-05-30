package com.specialtimes.server.command_line_runners;

import com.specialtimes.server.models.Farm;
import com.specialtimes.server.models.Potato;
import com.specialtimes.server.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddSampleFarmCommandLineRunner implements CommandLineRunner {

    private final FarmRepository farmRepository;

    @Autowired
    public AddSampleFarmCommandLineRunner(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Farm farm = new Farm();

        List<Potato> potatoList = new ArrayList<>();
        potatoList.add(new Potato());

        farm.setPotatoList(potatoList);

        this.farmRepository.save(farm);
    }
}
