package org.ssa.ironyard.restful.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.ssa.ironyard.restful.model.TrafficStop;



@Service
public class APIRestService
{
    public List<TrafficStop> getStopsForDay(Calendar date)
    {
        String requestDate = "";
        
        Integer year = date.get(Calendar.YEAR);
        Integer month = date.get(Calendar.MONTH) + 1;
        Integer day = date.get(Calendar.DAY_OF_MONTH);
        
        requestDate = year + "-" + month + "-" + day + "T00:00:00.000";
        
        final String uri = "https://data.montgomerycountymd.gov/resource/ms8i-8ux3.json?date_of_stop=" + requestDate;
        RestTemplate stopsRestTemplate = new RestTemplate();
        
        ResponseEntity<List<TrafficStop>> stops = stopsRestTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<TrafficStop>>() {
        
        });
                
        return stops.getBody();
        
    }

}
