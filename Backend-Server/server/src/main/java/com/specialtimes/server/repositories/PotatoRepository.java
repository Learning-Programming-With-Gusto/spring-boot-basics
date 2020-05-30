package com.specialtimes.server.repositories;

import com.specialtimes.server.models.Potato;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotatoRepository extends JpaRepository<Potato, Long> {

    Page<Potato> findBySize(int size, Pageable pageable);
}
