package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    //文字列のリスト
    List<String> fruitsList = List.of("りんご","桃","バナナ","もも","洋梨", "梨", "メロン","すいか","柿","レモン");
    System.out.println("元のリスト" + fruitsList);
    System.out.println("2文字以上を抽出 " + fruitsList.stream()
        .filter(fruit -> fruit.length() >= 2)
        .collect(Collectors.joining(",")));

    // 数値のリスト
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 7, 6, 7, 8, 9, 10);

    //奇数のものだけを抽出して、平均値を出す

    System.out.println(numberList.stream()
        .filter(num -> num % 2 == 1)
        .mapToInt(Integer::intValue)
        .average());
  }
}
