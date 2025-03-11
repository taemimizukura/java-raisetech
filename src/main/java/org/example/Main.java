package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    List<String> randomlist = List.of(
        "おはよう", "こんにちは", "おやすみ", "1234", "5678", "ABC", "DEF", "abc", "def", "and",
        "end", "99999", "0000", "A4", "B4", "C1", "オハヨウ", "コンバンハ", "挨拶", "今晩は",
        "お早う", "Hello", "100", "カタカナ", "ひらがな", "漢字", "Good", "Best", "Better", "END"
    );

    System.out.println("元のリスト"+ randomlist );

    List<String> numbers = new ArrayList<>();
    for (String random : randomlist) {
      if (Pattern.matches("^\\d+$", random)) {
        numbers.add(random);
      }
    }
    System.out.println("数字だけのリスト: " + numbers);

    List<String> words = new ArrayList<>();
    for (String random : randomlist) {
      if (Pattern.matches("^[^\\d]+$", random)) {
        words.add(random);
      }
    }
    System.out.println("文字だけ(数字以外)のリスト: " + words);

    List<String> upperCase = new ArrayList<>();
    for (String random : randomlist) {
      if (Pattern.matches("^[A-Z0-9]+$", random)) {
        upperCase.add(random);
      }
    }
    System.out.println("英数字の大文字のリスト: " + upperCase);

    List<String> japaneseWords = new ArrayList<>();
    for (String random : randomlist) {
      if (Pattern.matches("^[\\p{IsHiragana}\\p{IsKatakana}\\p{IsHan}]+$", random)) {
        japaneseWords.add(random);
      }
    }
    System.out.println("日本語のリスト: " + japaneseWords);

    List<String> nonAlphanumericWords = new ArrayList<>();
    for (String random : randomlist) {
      if (Pattern.matches("[^A-Za-z0-9]+", random)) {
        nonAlphanumericWords.add(random);
      }
    }
    System.out.println("英数字以外のリスト: " + nonAlphanumericWords);
  }
}






//    Map<String,String> addressMap = new HashMap<>();
//    addressMap.put("井上","hoge@gmail.com");
//    addressMap.put("佐藤","fuga@gmail.com");
//    addressMap.put("田中","aaabbbccc@yahoo.co.jp");
//    addressMap.put("江波","raise-tech.net");
//
//    List<String> addressList = new ArrayList<>();
//    for (Entry<String,String> address : addressMap.entrySet()){
//      if(address.getValue().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
//        addressList.add(address.getValue());
//
//      List<String> addressList = addressMap.values().stream()
//          .filter(s ->s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
//          .collect(Collectors.toList());
//
//    System.out.println(addressList);


// 課題は正規表現をたくさん使う。
// Listにランダムな文字列（色々自分で入れてもいいし、ChatGPTにお願いしてもいい）を30個ほど入れて下さい。
// その文字列のリストに対して「数字だけを抜き出す正規表現」と「文字だけを抜き出す正規表現」を試してみてください。
// 実際に合ってるか確認してください。

// 更にそれができたら文字を抜き出すときに英数字の大文字だけ抜き出してください。
// 更に更にそれができたら、漢字とひらがな、カタカナなどの日本語にマッチする正規表現を書いて抜き出してください。
// 更に更に更にそれができたら、英数字以外の文字を抜き出すという正規表現をチャレンジしてみてください。