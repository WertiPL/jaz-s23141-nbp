package com.example.jazs23141nbp.Controller;
import com.example.jazs23141nbp.Model.Currency;
import com.example.jazs23141nbp.Service.NbpService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nbp")
public class NBPController {

private final NbpService nbpService;

public NBPController(NbpService nbpService){this.nbpService = nbpService;}
    @ApiOperation(value = "Find Currency avg by date", notes = "provide information about Currency avg By date ")
@GetMapping("/currency/{currency}/date/{startdate}/date/{stopdate}")
    public ResponseEntity<Currency> getForCurrency(@PathVariable String currency, @PathVariable String startdate,@PathVariable String stopdate){
    return ResponseEntity.ok(nbpService.getForCurrency(currency,startdate,stopdate));
}

}
