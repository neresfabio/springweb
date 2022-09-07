package com.springreact.dsmeta.services;

import com.springreact.dsmeta.entities.Sale;
import com.springreact.dsmeta.repositories.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private ISaleRepository saleRepository;

    public List<Sale> findSales(){
        return saleRepository.findAll();
    }
}
