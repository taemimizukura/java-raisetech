package org.example;

public class Main {

  public static void main(String[] args) {
    // Trueになるパターン
    String firstName1 = "妙美";
    String lastName1 = "水倉";

    if (lastName1.length() >= 2 && firstName1.length() >= 2) {
      System.out.println("Trueパターン: " + firstName1);
    } else {
      System.out.println("Trueパターン: 条件に一致しませんでした。");
    }

    // Falseになるパターン
    String firstName2 = "妙";
    String lastName2 = "水倉";

    if (lastName2.length() >= 2 && firstName2.length() >= 2) {
      System.out.println("Falseパターン: " + firstName2);
    } else {
      System.out.println("Falseパターン: 条件に一致しませんでした。");
    }
  }
}
