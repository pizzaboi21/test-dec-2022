package com.example.testcontainers;


import com.example.demo.DemoApplication;
import com.example.demo.helllo.helloRepository;
import com.example.demo.helllo.testTable;
import com.example.testcontainers.config.ContainersEnvironment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class helloRepositoryTest extends ContainersEnvironment {

    @Autowired
    private helloRepository helloRepository;
// This test will pass if the list size is zero. (Which is currently not true.
    // We can pass this test by removing the "first" and "second" instances from the list of helloRepository.saveALl method present in the helloConfig.java class.
    @Test
    public void When_hello_Expect_EmptyList(){
        List<testTable> list = helloRepository.findAll();
        assertEquals(0,list.size());

    }

}
