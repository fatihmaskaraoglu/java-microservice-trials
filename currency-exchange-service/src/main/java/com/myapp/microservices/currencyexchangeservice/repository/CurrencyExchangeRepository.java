package com.myapp.microservices.currencyexchangeservice.repository;

import com.myapp.microservices.currencyexchangeservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

       CurrencyExchange findByFromAndTo(String from, String to);
}
