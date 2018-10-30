package com.service.weather.entity.original;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.text.SimpleDateFormat;
import java.util.Date;

@Generated("com.robohorse.robopojogenerator")
public class UltravioletIndex
{

    @JsonProperty("date")
    private int date;

    @JsonProperty("date_iso")
    private String dateIso;

    @JsonProperty("lon")
    private double lon;

    @JsonProperty("value")
    private double value;

    @JsonProperty("lat")
    private double lat;

    public void setDate(int date)
    {
        this.date = date;
    }

    public int getDate()
    {
        return date;
    }

    public void setDateIso(String dateIso)
    {
        this.dateIso = dateIso;
    }

    public String getDateIso()
    {
        return dateIso;
    }

    public void setLon(double lon)
    {
        this.lon = lon;
    }

    public double getLon()
    {
        return lon;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

    public void setLat(double lat)
    {
        this.lat = lat;
    }

    public double getLat()
    {
        return lat;
    }

    public static UltravioletIndex defaultUltravioletIndex(double lat, double lon) {
        UltravioletIndex index = new UltravioletIndex();
        index.setLat(22.54);
        index.setLon(114.05);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String currentDateString = format.format(new Date());
        index.setDateIso(currentDateString + "T12:00:00Z");
        index.setDate(1540900800);
        index.setValue((double) 8.46);
        return index;
    }
}