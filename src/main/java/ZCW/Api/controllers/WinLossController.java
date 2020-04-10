package ZCW.Api.controllers;

import ZCW.Api.models.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;

@RestController
public class WinLossController {

    public WinLossController() { }

    @GetMapping("/winloss/{account_id}")
    public static WinLoss getWinLoss(@PathVariable int account_id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.opendota.com/api/players/" + account_id + "/wl",  WinLoss.class);
    }

}
