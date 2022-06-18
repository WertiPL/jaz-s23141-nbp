package com.example.jazs23141nbp.Repository;

import com.example.jazs23141nbp.Model.Currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NbpRepository extends JpaRepository<Currency, Integer > {

    }
