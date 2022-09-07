package com.springreact.dsmeta.controllers;

import com.springreact.dsmeta.entities.Sale;
import com.springreact.dsmeta.services.SaleService;
import com.springreact.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    private SmsService smsService;

    @GetMapping
    public Page<Sale> findSales(
               @RequestParam(value = "minDate", defaultValue = "") String minDate,
               @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                Pageable pageable
    ){
        return saleService.findSales(minDate,maxDate,pageable);
    }
    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}
