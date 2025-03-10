package org.example;

public class Cloudy implements Weather, WeatherItem {

  @Override
  public String getWeatherMessage(String name) {
    return name + "さん、今日は曇りです。少し肌寒いです。";
  }
  @Override
  public String getWeatherItem (String item) {
    return item + "を忘れずに！";
  }
}


