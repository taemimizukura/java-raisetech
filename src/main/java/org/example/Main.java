package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) {
// 生徒名みたいな文字列を作って下さい。リストの数は数は10個以上。
// リストに入っている文字数が3文字以上のものを表示する。このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。
    List<String> studentNameList = List.of("伊藤", "佐々木", "青木", "黒木", "布留川", "宇佐美",
        "田中",
        "木村", "加藤", "佐藤");
    for (String name : studentNameList) {
      if (name.length() >= 3) {
        System.out.println("3文字以上の名字です:" + name);
      }
    }

// Mapを作ってください。生徒名と番号の組み合わせ。Mapの要素は10個以上。Mapの中の番号が偶数のものをMapから削除する。
// 上記の処理を行う繰り返し処理を実装してください。削除した状態のものを出力して表示してください。
    Map<Integer, String> studentNameMap = new HashMap<>(Map.of(
        1, "伊藤", 2, "佐々木", 3, "青木", 4, "黒木", 5, "布留川", 6, "宇佐美",
        7, "田中", 8, "木村", 9, "加藤", 10, "佐藤"));

    System.out.println("削除前のリスト：" + studentNameMap);

    //Listを使って削除
    List<Integer> RemoveKey = new ArrayList<>();
    for (Map.Entry<Integer, String> entry : studentNameMap.entrySet()) {
      if (entry.getKey() % 2 == 0) {
        RemoveKey.add(entry.getKey());
      }
    }
    for (Integer key : RemoveKey) {
      studentNameMap.remove(key);
    }
    System.out.println("Listを使って偶数番号を削除後のリスト：" + studentNameMap);

    //Iteratorを使って削除
    studentNameMap = new HashMap<>(Map.of(
        1, "伊藤", 2, "佐々木", 3, "青木", 4, "黒木", 5, "布留川", 6, "宇佐美",
        7, "田中", 8, "木村", 9, "加藤", 10, "佐藤"));
    //Map.Entry<Integer, String>で、（キー,値）をまとめて取得できる

    for (Iterator<Entry<Integer, String>> iterator = studentNameMap.entrySet().iterator();
        iterator.hasNext(); ) {
      Map.Entry<Integer, String> entry = iterator.next();
      if (entry.getKey() % 2 == 0) {
        iterator.remove();

      }
    }
    System.out.println("Iteratorを使って偶数番号を削除後のリスト: " + studentNameMap);
  }
}










