package org.example;

//Sunny(親クラス)を継承
public class VerySunny extends Sunny{

  @Override
  public String getWeatherMessage(String name) {

    String parentMessage = super.getWeatherMessage(name);
    return parentMessage + " ※紫外線が強いので注意してください！";
  }
}

