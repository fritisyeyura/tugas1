package id.ac.prisma.payment.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController {
    @RequestMapping(value = "/submit-payment", method = RequestMethod.POST, produces = "application/json")
    public Map submitPayment(@RequestBody Map requestBody){
        Map response = new HashMap();
        response.put("message", "pembayaran sedang diproses");
        return response;
    }
}
