package org.example;

public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer();
    // 課題。今日実践したものを一通り実装してみてください。
    Greeting greeting = new Greeting();//インスタンス化　Greetingオブジェクトを作成し、greetingという変数に格納。

    String message = greeting.sayHello("tekkun"); //GreetingクラスのsayHelloメソッドを呼び出し、結果をmessageに格納。
    printer.printMessage(message);

    Speaking speaking = new Greeting();    //SpeakingというインターフェースをGreetingクラスに実装させることで、Speaking型の変数にGreetingのインスタンスを代入


    // Greeting と Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください。
    //晴れの場合
    //親クラス(Sunny)のメソッドを呼び出し、
    Sunny sunny = new Sunny();
    String sunnyMessage = sunny.getWeatherMessage("tekkun");
    String sunnyMessage2 = sunny.getWeatherItem("★日傘");

    printer.printMessage(sunnyMessage);
    printer.printMessage(sunnyMessage2);

    //子クラス（VerySunny）のメソッドを呼び出し
    VerySunny verySunny = new VerySunny();
    String verySunnyMessage = verySunny.getWeatherMessage("tekkun");
    String verySunnyMessage2= verySunny.getWeatherItem("※サングラス");

    printer.printMessage(verySunnyMessage);
    printer.printMessage(verySunnyMessage2);

    //曇りの場合
    Cloudy cloudy = new Cloudy();
    String cloudyMessage = cloudy.getWeatherMessage("tekkun");
    String cloudyMessage2 = cloudy.getWeatherItem("★上着");
    printer.printMessage(cloudyMessage);
    printer.printMessage(cloudyMessage2);

    //雨の場合
    Rainy rainy = new Rainy();
    String rainyMessage = rainy.getWeatherMessage("tekkun");
    String rainyMessage2 = rainy.getWeatherItem("★雨傘");
    printer.printMessage(rainyMessage);
    printer.printMessage(rainyMessage2);

    //雪の場合;
    Snow snow = new Snow();
    String snowMessage = snow.getWeatherMessage("tekkun");
    String snowMessage2 = snow.getWeatherItem("★手袋");
    printer.printMessage(snowMessage);
    printer.printMessage(snowMessage2);
  }
}


      // 課題。今日実践したものを一通り実装してみてください。
      // Greeting と Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください。
      // 継承を使ってみてください。extends 上記で作った二つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください
      // メソッド呼び出しは親子のどちらとも呼び出してみてください。


