package com.example.demo.helllo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class helloService {

    private final helloRepository helloRepository;

    @Autowired
    public helloService(helloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public List<testTable> hello() {

        return helloRepository.findAll();
    }
}
