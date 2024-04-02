package com.example.springboot.demo.sprint6di.controllers;

import com.example.springboot.demo.sprint6di.services.SimpleDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;


@Controller
public class FauxController {

    private SimpleDatasource simpleDatasource;

    @Autowired
    public void setSimpleDatasource(SimpleDatasource simpleDatasource) {
        this.simpleDatasource = simpleDatasource;
    }

    public String getDatasource() {
        return simpleDatasource.getDatasource();
    }
}
