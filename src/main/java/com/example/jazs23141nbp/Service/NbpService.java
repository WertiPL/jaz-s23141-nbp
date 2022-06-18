package com.example.jazs23141nbp.Service;

import com.example.jazs23141nbp.Controller.GlobalControllerAdvice;
import com.example.jazs23141nbp.Model.Currency;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {
    public NbpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    private final RestTemplate restTemplate;
    public Currency getForCurrency(String currency,String startdate,String stopdate){
       String url= "http://api.nbp.pl/api/exchangerates/rates/a/"+currency+"/"+startdate+"/"+stopdate+"/";

        ResponseEntity<Currency> CurrencyEntity = restTemplate.exchange(url, HttpMethod.GET,null, Currency.class);
        if(CurrencyEntity.getStatusCode().is2xxSuccessful())
        {
            return CurrencyEntity.getBody();
        }
        else {
            throw  null;
        }
    }
}
