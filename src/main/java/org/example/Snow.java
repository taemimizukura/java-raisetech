package org.example;

public class Snow implements Weather, WeatherItem {

  @Override
  public String getWeatherMessage(String name) {
    return name + "さん、今日は雪です。時間に余裕をもって出かけましょう！";
  }
    @Override
    public String getWeatherItem (String item){
      return item + "を忘れずに！";
  }
}
