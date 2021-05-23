package com.SpringTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkBalanceController {

    @GetMapping("/check-balance")
    public double checkBalance(){
        return 10000.00;

    }

    @GetMapping("/check-balance/{user}")
    public double checkBalanceForUser(@PathVariable String user)
    {
        if (user.equalsIgnoreCase("Neha")) {
            return 1000.00;
        }
         else if (user.equalsIgnoreCase("Raj")) {
            return 100.00;
        }
        else if (user.equalsIgnoreCase("Sumit")) {
            return 10000.00;
        }
        return 1000000.00;

    }
}
