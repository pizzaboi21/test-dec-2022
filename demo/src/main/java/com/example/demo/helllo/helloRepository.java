package com.example.demo.helllo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface helloRepository extends JpaRepository <testTable,Long>  {
}
