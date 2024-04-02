package com.example.springboot.demo.sprint6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("qa")
public class SimpleDatasourceQAImpl implements SimpleDatasource {
    @Override
    public String getDatasource() {
        return "jdbc:qa";
    }
}
