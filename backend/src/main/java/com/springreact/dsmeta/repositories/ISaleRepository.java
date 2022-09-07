package com.springreact.dsmeta.repositories;

import com.springreact.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
