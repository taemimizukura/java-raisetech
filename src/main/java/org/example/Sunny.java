package org.example;

public class Sunny implements Weather, WeatherItem {

  @Override
  public String getWeatherMessage(String name) {
    return name + "さん、今日は晴れです。洗濯日和です！";
  }
  @Override
  public String getWeatherItem (String item){
    return item + "を忘れずに！";

  }
}
