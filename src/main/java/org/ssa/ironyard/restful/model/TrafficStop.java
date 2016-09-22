package org.ssa.ironyard.restful.model;

import java.util.Calendar;

public class TrafficStop
{
    private Calendar dateAndTimeOfStop = Calendar.getInstance();
//    private String date_of_stop;
//    private String time_of_stop;
    private Double latitude;
    private Double longitude;
    private String location;
    private String vehicle_type;
    private String make;
    private String model;
    private String year;
    private String color;
    
    public String getDate_of_stop()
    {      
        return String.format("%1$tY-%1$tm-%1$td", dateAndTimeOfStop);
    }
    public void setDate_of_stop(String date_of_stop)
    {
        String[] niceDate;
        
        niceDate = date_of_stop.split("T")[0].split("-");
        
        dateAndTimeOfStop.set(Integer.parseInt(niceDate[0]), Integer.parseInt(niceDate[1]) - 1, Integer.parseInt(niceDate[2]));
    }
    public String getTime_of_stop()
    {
        return String.format("%1$tH:%1$tM:%1$tS", dateAndTimeOfStop);
    }
    public void setTime_of_stop(String time_of_stop)
    {
        String[] niceTime;
        
        niceTime = time_of_stop.split(":");
        
        dateAndTimeOfStop.set(Calendar.HOUR_OF_DAY, Integer.parseInt(niceTime[0]));
        dateAndTimeOfStop.set(Calendar.MINUTE, Integer.parseInt(niceTime[1]));
        dateAndTimeOfStop.set(Calendar.SECOND, Integer.parseInt(niceTime[2]));
    }
    public Double getLatitude()
    {
        return latitude;
    }
    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }
    public Double getLongitude()
    {
        return longitude;
    }
    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getVehicle_type()
    {
        return vehicle_type;
    }
    public void setVehicle_type(String vehicle_type)
    {
        this.vehicle_type = vehicle_type;
    }
    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getYear()
    {
        return year;
    }
    public void setYear(String year)
    {
        this.year = year;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    

}
