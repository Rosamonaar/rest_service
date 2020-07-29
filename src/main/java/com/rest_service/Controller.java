package com.rest_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/")
    public String getResponse(@RequestParam("month") String monthNum) {
        return MonthSelector.getMonth(monthNum);
    }

    @PostMapping("/")
    public String[] postResponse(@RequestBody String [] request) {
        ArrayHandler.process(request);
        return request;
    }
}
