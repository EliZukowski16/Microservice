package org.ssa.ironyard.restful.controller;

import java.util.Calendar;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.ssa.ironyard.restful.model.TrafficStop;
import org.ssa.ironyard.restful.service.APIRestService;

@RestController
@RequestMapping("/microservice")
public class APIRestController
{
    static Logger LOGGER = LogManager.getLogger(APIRestController.class);

    @Autowired
    APIRestService service;

    @RequestMapping("/stops/{year}/{month}/{day}")
    @ResponseBody
    ResponseEntity<List<TrafficStop>> getAllStops(@PathVariable String year, @PathVariable String month,
            @PathVariable String day)
    {
        Calendar date = Calendar.getInstance();
        
        date.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        
        return ResponseEntity.ok(service.getStopsForDay(date));
    }

}
