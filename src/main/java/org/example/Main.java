package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  //ファイルを作成、書き込む
  // public static void main(String[] args) throws IOException {
//    Path path = Path.of("JavaCourse.txt");
//      Files.writeString(path, "Javaコース楽しい！！");
//  }
//}

//入出力処理を実際に実装して、作ったファイルに文章を追加する。
//  public static void main(String[] args) throws IOException {
//    Path path = Path.of("JavaCourse.txt");
//    Files.writeString(path,"Javaコース楽しすぎる！！", StandardOpenOption.APPEND);
//  }
//  }

  // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして例外処理を行う
  public static void main(String[] args) throws IOException {
      Path path = Path.of("JavaCourse.txt");
    try{
      Files.writeString(path,"Javaコース楽しすぎる！！", StandardOpenOption.APPEND);
    } catch (IOException e) {
      System.out.println("例外が発生!");
    }
  }
}

