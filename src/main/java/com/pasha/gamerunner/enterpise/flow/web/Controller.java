package com.pasha.gamerunner.enterpise.flow.web;


import com.pasha.gamerunner.enterpise.flow.business.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BussinessService bussinessService;

    @GetMapping("/sum")
    public long displaySum(){
        return bussinessService.calculateSum();
    }
}



