package org.example;

//挨拶するClass
public class Greeting implements Speaking{
  public String sayHello(String name){
    return "Hello, " + name + "!";
  }

  public String sayHelloJapanese(String name) {
    return "こんにちは," + name + "!";
  }
  @Override
  public String say(String message) {
    return null;
  }
}
