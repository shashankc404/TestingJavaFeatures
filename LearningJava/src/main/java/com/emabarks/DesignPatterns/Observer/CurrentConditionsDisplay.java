package com.emabarks.DesignPatterns.Observer;

public class CurrentConditionsDisplay implements Observer,Display{
    float temperature;
    float humidity;
    float pressure;

    WeatherDataSub weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
      this.weatherData=weatherData;
      weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        display();

    }
    @Override
    public void display(){
        System.out.println("Temp:"+this.temperature);
        System.out.println("Humidity: "+this.humidity);
        System.out.println("Pressure: "+this.pressure);
    }
}
