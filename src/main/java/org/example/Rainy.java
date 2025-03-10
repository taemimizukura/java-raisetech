package org.example;

public class Rainy implements Weather, WeatherItem {

  @Override
  public String getWeatherMessage(String name) {
    return name + "さん、今日は雨です。湿度が高いです！";
  }

  @Override
  public String getWeatherItem(String item) {
    return item + "を忘れずに！";
  }
}