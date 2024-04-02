package com.example.springboot.demo.sprint6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("staging")
@Service("staging")
public class SimpleDatasourceStagingImpl implements SimpleDatasource {
    @Override
    public String getDatasource() {
        return "jdbc:staging";
    }
}
