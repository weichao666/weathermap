package com.service.forecast.entity.original;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class ForecastData
{

    @JsonProperty("city")
    private City city;

    @JsonProperty("cnt")
    private int cnt;

    @JsonProperty("cod")
    private String cod;

    @JsonProperty("message")
    private double message;

    @JsonProperty("list")
    private List<ListItem> list;

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public int getCnt()
    {
        return cnt;
    }

    public void setCnt(int cnt)
    {
        this.cnt = cnt;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public double getMessage()
    {
        return message;
    }

    public void setMessage(double message)
    {
        this.message = message;
    }

    public List<ListItem> getList()
    {
        return list;
    }

    public void setList(List<ListItem> list)
    {
        this.list = list;
    }

    public static ForecastData defaultForecastData(String city) {
        ForecastData forecastData = new ForecastData();
        forecastData.setCod("200");
        forecastData.setMessage(0.0055);
        forecastData.setCnt(37);
        City c = new City();
        c.setId(1795565);
        c.setName(city);
        Coord coord = new Coord();
        coord.setLat(22.5446);
        coord.setLon(114.0545);
        c.setCoord(coord);
        c.setCountry("CN");
        forecastData.setCity(c);
        List<ListItem> list = new ArrayList<>();

        //item1
        ListItem item1 = new ListItem();
        item1.setDt((long) 1540890000);
        item1.setMain(new Main(26.98, 25.64,  26.98,1022.24,1028.38, 1022.24, (double)43,1.35));
        WeatherItem i = new WeatherItem();
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01d");
        List<WeatherItem> weather1 = new ArrayList<>();
        weather1.add(i);
        item1.setWeather(weather1);
        Clouds cloud1 = new Clouds();
        cloud1.setAll((double) 0);
        item1.setClouds(cloud1);
        Wind wind1 = new Wind();
        wind1.setSpeed(5.41);
        wind1.setDeg(26.0007);
        item1.setWind(wind1);
        Sys sys1 = new Sys();
        sys1.setPod("d");
        item1.setSys(sys1);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String currentDateString = format.format(new Date());
        item1.setDtTxt(currentDateString + " 09:00:00");
        list.add(item1);

        //item2
        ListItem item2 = new ListItem();
        item2.setDt((long) 1540900800);
        item2.setMain(new Main(23.15, 22.14, 23.15, 1023.94, 1030.19, 1023.94, (double)51, 1.01));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01n");
        List<WeatherItem> weather2 = new ArrayList<>();
        weather2.add(i);
        item2.setWeather(weather2);
        Clouds cloud2 = new Clouds();
        cloud2.setAll((double) 0);
        item2.setClouds(cloud2);
        Wind wind2 = new Wind();
        wind2.setSpeed(5.41);
        wind2.setDeg(26.5083);
        item2.setWind(wind2);
        Sys sys2 = new Sys();
        sys2.setPod("n");
        item2.setSys(sys2);
        item2.setDtTxt(currentDateString + " 12:00:00");
        list.add(item2);

        //item3
        ListItem item3 = new ListItem();
        item3.setDt((long) 1540911600);
        item3.setMain(new Main(21.09, 20.41, 21.09, 1024.37, 1030.64, 1024.37, (double)55, 0.67));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01n");
        List<WeatherItem> weather3 = new ArrayList<>();
        weather3.add(i);
        item3.setWeather(weather3);
        Clouds cloud3 = new Clouds();
        cloud3.setAll((double) 0);
        item3.setClouds(cloud3);
        Wind wind3 = new Wind();
        wind3.setSpeed(5.57);
        wind3.setDeg(23.0007);
        item3.setWind(wind3);
        Sys sys3 = new Sys();
        sys3.setPod("n");
        item3.setSys(sys3);
        item3.setDtTxt(currentDateString + " 15:00:00");
        list.add(item3);

        //item4
        ListItem item4 = new ListItem();
        item4.setDt((long) 1540922400);
        item4.setMain(new Main(19.61, 19.27, 19.61, 1023.78, 1029.97, 1023.78, (double)57, 0.34));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01n");
        List<WeatherItem> weather4 = new ArrayList<>();
        weather4.add(i);
        item4.setWeather(weather4);
        Clouds cloud4 = new Clouds();
        cloud4.setAll((double) 0);
        item4.setClouds(cloud4);
        Wind wind4 = new Wind();
        wind4.setSpeed(5.83);
        wind4.setDeg(31.5009);
        item4.setWind(wind4);
        Sys sys4 = new Sys();
        sys4.setPod("n");
        item4.setSys(sys4);
        item4.setDtTxt(currentDateString + " 18:00:00");
        list.add(item4);

        //item5
        ListItem item5 = new ListItem();
        item5.setDt((long) 1540933200);
        item5.setMain(new Main(18.21, 18.21, 18.21, 1023.24, 1029.51, 1023.24, (double)58, (double)0));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01n");
        List<WeatherItem> weather5 = new ArrayList<>();
        weather5.add(i);
        item5.setWeather(weather5);
        Clouds cloud5 = new Clouds();
        cloud5.setAll((double) 0);
        item5.setClouds(cloud5);
        Wind wind5 = new Wind();
        wind5.setSpeed(5.43);
        wind5.setDeg(31.5006);
        item5.setWind(wind5);
        Sys sys5 = new Sys();
        sys5.setPod("n");
        item5.setSys(sys5);
        item5.setDtTxt(currentDateString + " 21:00:00");
        list.add(item5);

        //item6
        ListItem item6 = new ListItem();
        item6.setDt((long) 1540944000);
        item6.setMain(new Main(19.29, 19.29, 19.29, 1024.14, 1030.48, 1024.14, (double)57, (double)0));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01d");
        List<WeatherItem> weather6 = new ArrayList<>();
        weather6.add(i);
        item6.setWeather(weather6);
        Clouds cloud6 = new Clouds();
        cloud6.setAll((double) 0);
        item6.setClouds(cloud6);
        Wind wind6 = new Wind();
        wind6.setSpeed(5.97);
        wind6.setDeg(28.5011);
        item6.setWind(wind6);
        Sys sys6 = new Sys();
        sys6.setPod("d");
        item6.setSys(sys6);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String tomorrowDateString = format.format(calendar.getTime());
        item6.setDtTxt(tomorrowDateString + " 00:00:00");
        list.add(item6);

        //item7
        ListItem item7 = new ListItem();
        item7.setDt((long) 1540954800);
        item7.setMain(new Main(24.38, 24.38, 24.38, 1023.56, 1029.72, 1023.56, (double)49, (double)0));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01d");
        List<WeatherItem> weather7 = new ArrayList<>();
        weather7.add(i);
        item7.setWeather(weather7);
        Clouds cloud7 = new Clouds();
        cloud7.setAll((double) 0);
        item7.setClouds(cloud7);
        Wind wind7 = new Wind();
        wind7.setSpeed(7.17);
        wind7.setDeg(31.5017);
        item7.setWind(wind7);
        Sys sys7 = new Sys();
        sys7.setPod("d");
        item7.setSys(sys7);
        item7.setDtTxt(tomorrowDateString + " 03:00:00");
        list.add(item7);

        //item8
        ListItem item8 = new ListItem();
        item8.setDt((long) 1540965600);
        item8.setMain(new Main(26.89, 26.89, 26.89, 1021.5, 1027.67, 1021.5, (double)42, (double)0));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01d");
        List<WeatherItem> weather8 = new ArrayList<>();
        weather8.add(i);
        item8.setWeather(weather8);
        Clouds cloud8 = new Clouds();
        cloud8.setAll((double) 0);
        item8.setClouds(cloud8);
        Wind wind8 = new Wind();
        wind8.setSpeed(7.31);
        wind8.setDeg(34.5037);
        item8.setWind(wind8);
        Sys sys8 = new Sys();
        sys8.setPod("d");
        item8.setSys(sys8);
        item8.setDtTxt(tomorrowDateString + " 06:00:00");
        list.add(item8);

        //item9
        ListItem item9 = new ListItem();
        item9.setDt((long) 1540976400);
        item9.setMain(new Main(25.74, 25.74, 25.74, 1021.19, 1027.36, 1021.19, (double)42, (double)0));
        i.setId(800);
        i.setMain("Clear");
        i.setDescription("clear sky");
        i.setIcon("01d");
        List<WeatherItem> weather9 = new ArrayList<>();
        weather9.add(i);
        item9.setWeather(weather9);
        Clouds cloud9 = new Clouds();
        cloud9.setAll((double) 0);
        item9.setClouds(cloud9);
        Wind wind9 = new Wind();
        wind9.setSpeed(6.31);
        wind9.setDeg(34.0012);
        item9.setWind(wind9);
        Sys sys9 = new Sys();
        sys9.setPod("d");
        item9.setSys(sys9);
        item9.setDtTxt(tomorrowDateString + " 09:00:00");
        list.add(item9);

        //item10
        ListItem item10 = new ListItem();
        item10.setDt((long) 1540987200);
        item10.setMain(new Main(22.84, 22.84, 22.84, 1022.53, 1028.82, 1022.53, (double)47, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03n");
        List<WeatherItem> weather10 = new ArrayList<>();
        weather10.add(i);
        item10.setWeather(weather10);
        Clouds cloud10 = new Clouds();
        cloud10.setAll((double) 36);
        item10.setClouds(cloud10);
        Wind wind10 = new Wind();
        wind10.setSpeed(5.97);
        wind10.setDeg(32.5036);
        item10.setWind(wind10);
        Sys sys10 = new Sys();
        sys10.setPod("n");
        item10.setSys(sys10);
        item10.setDtTxt(tomorrowDateString + " 12:00:00");
        list.add(item10);

        //item11
        ListItem item11 = new ListItem();
        item11.setDt((long) 1540998000);
        item11.setMain(new Main(21.74, 21.74, 21.74, 1023.39, 1029.57, 1023.39, (double)49, (double)0));
        i.setId(803);
        i.setMain("Clouds");
        i.setDescription("broken clouds");
        i.setIcon("04n");
        List<WeatherItem> weather11 = new ArrayList<>();
        weather11.add(i);
        item11.setWeather(weather11);
        Clouds cloud11 = new Clouds();
        cloud11.setAll((double) 56);
        item11.setClouds(cloud11);
        Wind wind11 = new Wind();
        wind11.setSpeed(5.71);
        wind11.setDeg(29.5045);
        item11.setWind(wind11);
        Sys sys11 = new Sys();
        sys11.setPod("n");
        item11.setSys(sys11);
        item11.setDtTxt(tomorrowDateString + " 15:00:00");
        list.add(item11);

        //item12
        ListItem item12 = new ListItem();
        item12.setDt((long) 1541008800);
        item12.setMain(new Main(21.53, 21.53, 21.53, 1023.01, 1029.19, 1023.01, (double)51, (double)0));
        i.setId(804);
        i.setMain("Clouds");
        i.setDescription("overcast clouds");
        i.setIcon("04n");
        List<WeatherItem> weather12 = new ArrayList<>();
        weather12.add(i);
        item12.setWeather(weather12);
        Clouds cloud12 = new Clouds();
        cloud12.setAll((double) 92);
        item12.setClouds(cloud12);
        Wind wind12 = new Wind();
        wind12.setSpeed(5.41);
        wind12.setDeg(37.0002);
        item12.setWind(wind12);
        Sys sys12 = new Sys();
        sys12.setPod("n");
        item12.setSys(sys12);
        item12.setDtTxt(tomorrowDateString + " 18:00:00");
        list.add(item12);

        //item13
        ListItem item13 = new ListItem();
        item13.setDt((long) 1541019600);
        item13.setMain(new Main(21.21, 21.21, 21.21, 1022.22, 1028.59, 1022.22, (double)55, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03n");
        List<WeatherItem> weather13 = new ArrayList<>();
        weather13.add(i);
        item13.setWeather(weather13);
        Clouds cloud13 = new Clouds();
        cloud13.setAll((double) 44);
        item13.setClouds(cloud13);
        Wind wind13 = new Wind();
        wind13.setSpeed(6.02);
        wind13.setDeg(36.5006);
        item13.setWind(wind13);
        Sys sys13 = new Sys();
        sys13.setPod("n");
        item13.setSys(sys13);
        item13.setDtTxt(tomorrowDateString + " 21:00:00");
        list.add(item13);

        //item14
        ListItem item14 = new ListItem();
        item14.setDt((long) 1541030400);
        item14.setMain(new Main(21.67, 21.67, 21.67, 1023.34, 1029.56, 1023.34, (double)56, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03d");
        List<WeatherItem> weather14 = new ArrayList<>();
        weather14.add(i);
        item14.setWeather(weather14);
        Clouds cloud14 = new Clouds();
        cloud14.setAll((double) 44);
        item14.setClouds(cloud14);
        Wind wind14 = new Wind();
        wind14.setSpeed(7.01);
        wind14.setDeg(40.0004);
        item14.setWind(wind14);
        Sys sys14 = new Sys();
        sys14.setPod("d");
        item14.setSys(sys14);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String theDayAfterTomorrowDateString = format.format(calendar.getTime());
        item14.setDtTxt(theDayAfterTomorrowDateString + " 00:00:00");
        list.add(item14);

        //item15
        ListItem item15 = new ListItem();
        item15.setDt((long) 1541041200);
        item15.setMain(new Main(24.74, 24.74, 24.74, 1023.14, 1029.45, 1023.14, (double)52, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03d");
        List<WeatherItem> weather15 = new ArrayList<>();
        weather15.add(i);
        item15.setWeather(weather15);
        Clouds cloud15 = new Clouds();
        cloud15.setAll((double) 36);
        item15.setClouds(cloud15);
        Wind wind15 = new Wind();
        wind15.setSpeed(7.67);
        wind15.setDeg(37.5001);
        item15.setWind(wind15);
        Sys sys15 = new Sys();
        sys15.setPod("d");
        item15.setSys(sys15);
        item15.setDtTxt(theDayAfterTomorrowDateString + " 03:00:00");
        list.add(item15);

        //item16
        ListItem item16 = new ListItem();
        item16.setDt((long) 1541052000);
        item16.setMain(new Main(26.77, 26.77, 26.77, 1021.32, 1027.64, 1021.32, (double)49, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03d");
        List<WeatherItem> weather16 = new ArrayList<>();
        weather16.add(i);
        item16.setWeather(weather16);
        Clouds cloud16 = new Clouds();
        cloud16.setAll((double) 36);
        item16.setClouds(cloud16);
        Wind wind16 = new Wind();
        wind16.setSpeed(7.06);
        wind16.setDeg(38.5008);
        item16.setWind(wind16);
        Sys sys16 = new Sys();
        sys16.setPod("d");
        item16.setSys(sys16);
        item16.setDtTxt(theDayAfterTomorrowDateString + " 06:00:00");
        list.add(item16);

        //item17
        ListItem item17 = new ListItem();
        item17.setDt((long) 1541062800);
        item17.setMain(new Main(26.07, 26.07, 26.07, 1021.43, 1027.65, 1021.43, (double)51, (double)0));
        i.setId(803);
        i.setMain("Clouds");
        i.setDescription("broken clouds");
        i.setIcon("04d");
        List<WeatherItem> weather17 = new ArrayList<>();
        weather17.add(i);
        item17.setWeather(weather17);
        Clouds cloud17 = new Clouds();
        cloud17.setAll((double) 68);
        item17.setClouds(cloud17);
        Wind wind17 = new Wind();
        wind17.setSpeed(6.81);
        wind17.setDeg(44.5089);
        item17.setWind(wind17);
        Sys sys17 = new Sys();
        sys17.setPod("d");
        item17.setSys(sys17);
        item17.setDtTxt(theDayAfterTomorrowDateString + " 09:00:00");
        list.add(item17);

        //item18
        ListItem item18 = new ListItem();
        item18.setDt((long) 1541073600);
        item18.setMain(new Main(24.24, 24.24, 24.24, 1022.33, 1028.67, 1022.33, (double)58, (double)0));
        i.setId(803);
        i.setMain("Clouds");
        i.setDescription("broken clouds");
        i.setIcon("04n");
        List<WeatherItem> weather18 = new ArrayList<>();
        weather18.add(i);
        item18.setWeather(weather18);
        Clouds cloud18 = new Clouds();
        cloud18.setAll((double) 64);
        item18.setClouds(cloud18);
        Wind wind18 = new Wind();
        wind18.setSpeed(6.61);
        wind18.setDeg(39.5009);
        item18.setWind(wind18);
        Sys sys18 = new Sys();
        sys18.setPod("n");
        item18.setSys(sys18);
        item18.setDtTxt(theDayAfterTomorrowDateString + " 12:00:00");
        list.add(item18);

        //item19
        ListItem item19 = new ListItem();
        item19.setDt((long) 1541084400);
        item19.setMain(new Main(22.24, 22.24, 22.24, 1023.28, 1029.49, 1023.28, (double)70, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather19 = new ArrayList<>();
        weather19.add(i);
        item19.setWeather(weather19);
        Clouds cloud19 = new Clouds();
        cloud19.setAll((double) 68);
        item19.setClouds(cloud19);
        Wind wind19 = new Wind();
        wind19.setSpeed(6.92);
        wind19.setDeg(40.5043);
        item19.setWind(wind19);
        Rain rain19 = new Rain();
        rain19.setJsonMember3h((double) 0.08);
        item19.setRain(rain19);
        Sys sys19 = new Sys();
        sys19.setPod("n");
        item19.setSys(sys19);
        item19.setDtTxt(theDayAfterTomorrowDateString + " 15:00:00");
        list.add(item19);

        //item20
        ListItem item20 = new ListItem();
        item20.setDt((long) 1541095200);
        item20.setMain(new Main(21.6, 21.6, 21.6, 1022.9, 1029.13, 1022.9, (double)72, (double)0));
        i.setId(802);
        i.setMain("Clouds");
        i.setDescription("scattered clouds");
        i.setIcon("03n");
        List<WeatherItem> weather20 = new ArrayList<>();
        weather20.add(i);
        item20.setWeather(weather20);
        Clouds cloud20 = new Clouds();
        cloud20.setAll((double) 36);
        item20.setClouds(cloud20);
        Wind wind20 = new Wind();
        wind20.setSpeed(6.37);
        wind20.setDeg(42.5022);
        item20.setWind(wind20);
        Rain rain20 = new Rain();
        item20.setRain(rain20);
        Sys sys20 = new Sys();
        sys20.setPod("n");
        item20.setSys(sys20);
        item20.setDtTxt(theDayAfterTomorrowDateString + " 18:00:00");
        list.add(item20);

        //item21
        ListItem item21 = new ListItem();
        item21.setDt((long) 1541106000);
        item21.setMain(new Main(21.48, 21.48, 21.48, 1022.29, 1028.44, 1022.29, (double)71, (double)0));
        i.setId(803);
        i.setMain("Clouds");
        i.setDescription("broken clouds");
        i.setIcon("04n");
        List<WeatherItem> weather21 = new ArrayList<>();
        weather21.add(i);
        item21.setWeather(weather21);
        Clouds cloud21 = new Clouds();
        cloud21.setAll((double) 80);
        item21.setClouds(cloud21);
        Wind wind21 = new Wind();
        wind21.setSpeed(6.21);
        wind21.setDeg(39.5009);
        item21.setWind(wind21);
        Rain rain21 = new Rain();
        item21.setRain(rain21);
        Sys sys21 = new Sys();
        sys21.setPod("n");
        item21.setSys(sys21);
        item21.setDtTxt(theDayAfterTomorrowDateString + " 21:00:00");
        list.add(item21);

        //item22
        ListItem item22 = new ListItem();
        item22.setDt((long) 1541116800);
        item22.setMain(new Main(22.04, 22.04, 22.04, 1023.69, 1029.95, 1023.69, (double)69, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather22 = new ArrayList<>();
        weather22.add(i);
        item22.setWeather(weather22);
        Clouds cloud22 = new Clouds();
        cloud22.setAll((double) 88);
        item22.setClouds(cloud22);
        Wind wind22 = new Wind();
        wind22.setSpeed(6.97);
        wind22.setDeg(47.0013);
        item22.setWind(wind22);
        Rain rain22 = new Rain();
        rain22.setJsonMember3h((double) 0.06);
        item22.setRain(rain22);
        Sys sys22 = new Sys();
        sys22.setPod("d");
        item22.setSys(sys22);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String threeDaysLaterDateString = format.format(calendar.getTime());
        item22.setDtTxt(threeDaysLaterDateString + " 00:00:00");
        list.add(item22);

        //item23
        ListItem item23 = new ListItem();
        item23.setDt((long) 1541127600);
        item23.setMain(new Main(19.78, 19.78, 19.78, 1024.97, 1031.25, 1024.97, (double)90, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather23 = new ArrayList<>();
        weather23.add(i);
        item23.setWeather(weather23);
        Clouds cloud23 = new Clouds();
        cloud23.setAll((double) 92);
        item23.setClouds(cloud23);
        Wind wind23 = new Wind();
        wind23.setSpeed(6.96);
        wind23.setDeg(44.5);
        item23.setWind(wind23);
        Rain rain23 = new Rain();
        rain23.setJsonMember3h((double) 0.79);
        item23.setRain(rain23);
        Sys sys23 = new Sys();
        sys23.setPod("d");
        item23.setSys(sys23);
        item23.setDtTxt(threeDaysLaterDateString + " 03:00:00");
        list.add(item23);

        //item24
        ListItem item24 = new ListItem();
        item24.setDt((long) 1541138400);
        item24.setMain(new Main(20.19, 20.19, 20.19, 1023.49, 1029.76, 1023.49, (double)88, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather24 = new ArrayList<>();
        weather24.add(i);
        item24.setWeather(weather24);
        Clouds cloud24 = new Clouds();
        cloud24.setAll((double) 92);
        item24.setClouds(cloud24);
        Wind wind24 = new Wind();
        wind24.setSpeed(6.71);
        wind24.setDeg(40.5002);
        item24.setWind(wind24);
        Rain rain24 = new Rain();
        rain24.setJsonMember3h((double) 0.4);
        item24.setRain(rain24);
        Sys sys24 = new Sys();
        sys24.setPod("d");
        item24.setSys(sys24);
        item24.setDtTxt(threeDaysLaterDateString + " 06:00:00");
        list.add(item24);

        //item25
        ListItem item25 = new ListItem();
        item25.setDt((long) 1541149200);
        item25.setMain(new Main(20.19, 20.19, 20.19, 1023.14, 1029.41, 1023.14, (double)87, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather25 = new ArrayList<>();
        weather25.add(i);
        item25.setWeather(weather25);
        Clouds cloud25 = new Clouds();
        cloud25.setAll((double) 92);
        item25.setClouds(cloud25);
        Wind wind25 = new Wind();
        wind25.setSpeed(6.62);
        wind25.setDeg(45.5005);
        item25.setWind(wind25);
        Rain rain25 = new Rain();
        rain25.setJsonMember3h((double) 0.26);
        item25.setRain(rain25);
        Sys sys25 = new Sys();
        sys25.setPod("d");
        item25.setSys(sys25);
        item25.setDtTxt(threeDaysLaterDateString + " 09:00:00");
        list.add(item25);

        //item26
        ListItem item26 = new ListItem();
        item26.setDt((long) 1541160000);
        item26.setMain(new Main(19.33, 19.33, 19.33, 1024.17, 1030.35, 1024.17, (double)91, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather26 = new ArrayList<>();
        weather26.add(i);
        item26.setWeather(weather26);
        Clouds cloud26 = new Clouds();
        cloud26.setAll((double) 92);
        item26.setClouds(cloud26);
        Wind wind26 = new Wind();
        wind26.setSpeed(6.62);
        wind26.setDeg(45.0073);
        item26.setWind(wind26);
        Rain rain26 = new Rain();
        rain26.setJsonMember3h((double) 0.15);
        item26.setRain(rain26);
        Sys sys26 = new Sys();
        sys26.setPod("n");
        item26.setSys(sys26);
        item26.setDtTxt(threeDaysLaterDateString + " 12:00:00");
        list.add(item26);

        //item27
        ListItem item27 = new ListItem();
        item27.setDt((long) 1541170800);
        item27.setMain(new Main(19, 19, 19, 1024.45, 1030.71, 1024.45, (double)94, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather27 = new ArrayList<>();
        weather27.add(i);
        item27.setWeather(weather27);
        Clouds cloud27 = new Clouds();
        cloud27.setAll((double) 92);
        item27.setClouds(cloud27);
        Wind wind27 = new Wind();
        wind27.setSpeed(5.69);
        wind27.setDeg(46.5028);
        item27.setWind(wind27);
        Rain rain27 = new Rain();
        rain27.setJsonMember3h((double) 0.21);
        item27.setRain(rain27);
        Sys sys27 = new Sys();
        sys27.setPod("n");
        item27.setSys(sys27);
        item27.setDtTxt(threeDaysLaterDateString + " 15:00:00");
        list.add(item27);

        //item28
        ListItem item28 = new ListItem();
        item28.setDt((long) 1541181600);
        item28.setMain(new Main(18.84, 18.84, 18.84, 1022.99, 1029.22, 1022.99, (double)99, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather28 = new ArrayList<>();
        weather28.add(i);
        item28.setWeather(weather28);
        Clouds cloud28 = new Clouds();
        cloud28.setAll((double) 100);
        item28.setClouds(cloud28);
        Wind wind28 = new Wind();
        wind28.setSpeed(5.16);
        wind28.setDeg(46.505);
        item28.setWind(wind28);
        Rain rain28 = new Rain();
        rain28.setJsonMember3h((double) 0.45);
        item28.setRain(rain28);
        Sys sys28 = new Sys();
        sys28.setPod("n");
        item28.setSys(sys28);
        item28.setDtTxt(threeDaysLaterDateString + " 18:00:00");
        list.add(item28);

        //item29
        ListItem item29 = new ListItem();
        item29.setDt((long) 1541192400);
        item29.setMain(new Main(18.46, 18.46, 18.46, 1022.28, 1028.47, 1022.28, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather29 = new ArrayList<>();
        weather29.add(i);
        item29.setWeather(weather29);
        Clouds cloud29 = new Clouds();
        cloud29.setAll((double) 92);
        item29.setClouds(cloud29);
        Wind wind29 = new Wind();
        wind29.setSpeed(4.56);
        wind29.setDeg(49.5028);
        item29.setWind(wind29);
        Rain rain29 = new Rain();
        rain29.setJsonMember3h((double) 1.78);
        item29.setRain(rain29);
        Sys sys29 = new Sys();
        sys29.setPod("n");
        item29.setSys(sys29);
        item29.setDtTxt(threeDaysLaterDateString + " 21:00:00");
        list.add(item29);

        //item30
        ListItem item30 = new ListItem();
        item30.setDt((long) 1541203200);
        item30.setMain(new Main(18.87, 18.87, 18.87, 1023.64, 1029.9, 1023.64, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather30 = new ArrayList<>();
        weather30.add(i);
        item30.setWeather(weather30);
        Clouds cloud30 = new Clouds();
        cloud30.setAll((double) 88);
        item30.setClouds(cloud30);
        Wind wind30 = new Wind();
        wind30.setSpeed(4.11);
        wind30.setDeg(39.5085);
        item30.setWind(wind30);
        Rain rain30 = new Rain();
        rain30.setJsonMember3h((double) 1.08);
        item30.setRain(rain30);
        Sys sys30 = new Sys();
        sys30.setPod("d");
        item30.setSys(sys30);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String fourDaysLaterDateString = format.format(calendar.getTime());
        item30.setDtTxt(fourDaysLaterDateString + " 00:00:00");
        list.add(item30);

        //item31
        ListItem item31 = new ListItem();
        item31.setDt((long) 1541214000);
        item31.setMain(new Main(20.24, 20.24, 20.24, 1023.9, 1030.2, 1023.9, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather31 = new ArrayList<>();
        weather31.add(i);
        item31.setWeather(weather31);
        Clouds cloud31 = new Clouds();
        cloud31.setAll((double) 92);
        item31.setClouds(cloud31);
        Wind wind31 = new Wind();
        wind31.setSpeed(4.56);
        wind31.setDeg(51.0015);
        item31.setWind(wind31);
        Rain rain31 = new Rain();
        rain31.setJsonMember3h((double) 1.26);
        item31.setRain(rain31);
        Sys sys31 = new Sys();
        sys31.setPod("d");
        item31.setSys(sys31);
        item31.setDtTxt(fourDaysLaterDateString + " 03:00:00");
        list.add(item31);

        //item32
        ListItem item32 = new ListItem();
        item32.setDt((long) 1541224800);
        item32.setMain(new Main(21.36, 21.36, 21.36, 1021.85, 1028.03, 1021.85, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather32 = new ArrayList<>();
        weather32.add(i);
        item32.setWeather(weather32);
        Clouds cloud32 = new Clouds();
        cloud32.setAll((double) 92);
        item32.setClouds(cloud32);
        Wind wind32 = new Wind();
        wind32.setSpeed(4.38);
        wind32.setDeg(51.002);
        item32.setWind(wind32);
        Rain rain32 = new Rain();
        rain32.setJsonMember3h((double) 0.73);
        item32.setRain(rain32);
        Sys sys32 = new Sys();
        sys32.setPod("d");
        item32.setSys(sys32);
        item32.setDtTxt(fourDaysLaterDateString + " 06:00:00");
        list.add(item32);

        //item33
        ListItem item33 = new ListItem();
        item33.setDt((long) 1541235600);
        item33.setMain(new Main(21.63, 21.63, 21.63, 1021.13, 1027.35, 1021.13, (double)98, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10d");
        List<WeatherItem> weather33 = new ArrayList<>();
        weather33.add(i);
        item33.setWeather(weather33);
        Clouds cloud33 = new Clouds();
        cloud33.setAll((double) 92);
        item33.setClouds(cloud33);
        Wind wind33 = new Wind();
        wind33.setSpeed(4.15);
        wind33.setDeg(61.5005);
        item33.setWind(wind33);
        Rain rain33 = new Rain();
        rain33.setJsonMember3h((double) 0.65);
        item33.setRain(rain33);
        Sys sys33 = new Sys();
        sys33.setPod("d");
        item33.setSys(sys33);
        item33.setDtTxt(fourDaysLaterDateString + " 09:00:00");
        list.add(item33);

        //item34
        ListItem item34 = new ListItem();
        item34.setDt((long) 1541246400);
        item34.setMain(new Main(21.27, 21.27, 21.27, 1021.89, 1028.15, 1021.89, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather34 = new ArrayList<>();
        weather34.add(i);
        item34.setWeather(weather34);
        Clouds cloud34 = new Clouds();
        cloud34.setAll((double) 92);
        item34.setClouds(cloud34);
        Wind wind34 = new Wind();
        wind34.setSpeed(4.49);
        wind34.setDeg(60.0008);
        item34.setWind(wind34);
        Rain rain34 = new Rain();
        rain34.setJsonMember3h((double) 0.66);
        item34.setRain(rain34);
        Sys sys34 = new Sys();
        sys34.setPod("n");
        item34.setSys(sys34);
        item34.setDtTxt(fourDaysLaterDateString + " 12:00:00");
        list.add(item34);

        //item35
        ListItem item35 = new ListItem();
        item35.setDt((long) 1541257200);
        item35.setMain(new Main(21.16, 21.16, 21.16, 1022.62, 1028.89, 1022.62, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather35 = new ArrayList<>();
        weather35.add(i);
        item35.setWeather(weather35);
        Clouds cloud35 = new Clouds();
        cloud35.setAll((double) 92);
        item35.setClouds(cloud35);
        Wind wind35 = new Wind();
        wind35.setSpeed(4.27);
        wind35.setDeg(70.5002);
        item35.setWind(wind35);
        Rain rain35 = new Rain();
        rain35.setJsonMember3h((double) 0.31);
        item35.setRain(rain35);
        Sys sys35 = new Sys();
        sys35.setPod("n");
        item35.setSys(sys35);
        item35.setDtTxt(fourDaysLaterDateString + " 15:00:00");
        list.add(item35);

        //item36
        ListItem item36 = new ListItem();
        item36.setDt((long) 1541268000);
        item36.setMain(new Main(21.11, 21.11, 21.11, 1021.36, 1027.54, 1021.36, (double)100, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather36 = new ArrayList<>();
        weather36.add(i);
        item36.setWeather(weather36);
        Clouds cloud36 = new Clouds();
        cloud36.setAll((double) 92);
        item36.setClouds(cloud36);
        Wind wind36 = new Wind();
        wind36.setSpeed(4.71);
        wind36.setDeg(75.5004);
        item36.setWind(wind36);
        Rain rain36 = new Rain();
        rain36.setJsonMember3h((double) 0.13);
        item36.setRain(rain36);
        Sys sys36 = new Sys();
        sys36.setPod("n");
        item36.setSys(sys36);
        item36.setDtTxt(fourDaysLaterDateString + " 18:00:00");
        list.add(item36);

        //item37
        ListItem item37 = new ListItem();
        item37.setDt((long) 1541278800);
        item37.setMain(new Main(21.32, 21.32, 21.32, 1020.37, 1026.69, 1020.37, (double)98, (double)0));
        i.setId(500);
        i.setMain("Rain");
        i.setDescription("light rain");
        i.setIcon("10n");
        List<WeatherItem> weather37 = new ArrayList<>();
        weather37.add(i);
        item37.setWeather(weather37);
        Clouds cloud37 = new Clouds();
        cloud37.setAll((double) 92);
        item37.setClouds(cloud37);
        Wind wind37 = new Wind();
        wind37.setSpeed(5);
        wind37.setDeg(77.5071);
        item37.setWind(wind37);
        Rain rain37 = new Rain();
        rain37.setJsonMember3h((double) 0.11);
        item37.setRain(rain37);
        Sys sys37 = new Sys();
        sys37.setPod("n");
        item37.setSys(sys37);
        item37.setDtTxt(fourDaysLaterDateString + " 21:00:00");
        list.add(item37);

        forecastData.setList(list);

        return forecastData;
    }
}