package com.specialtimes.server.repositories;

import com.specialtimes.server.models.Potato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PotatoRepository extends JpaRepository<Potato, Long>, JpaSpecificationExecutor<Potato> {

    Potato findBySize(int size);
}
