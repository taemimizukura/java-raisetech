package org.example;

import java.util.List;

public class Main {

  private static List<String> studentList;

  public static void main(String[] args) {
    System.out.println(createStudentList());

    int number1 = 3;
    int number2 = 5;
    int x = number1 + number2;
    System.out.println(x);

    Greeting greeting = new Greeting();
    greeting.sayHello("tekkun")
    Greeting greeting2 = new Greeting();
  }

  private static List<String> createStudentList() {
    return List.of("S_江並", "S_井上", "S_佐藤");
  }
}

// Intellij IDEAのショートカットキー
// https://pleiades.io/help/idea/mastering-keyboard-shortcuts.html
// 行の上下移動　Alt + Shift + 矢印キー
// 現在行の削除　Shift + Delete
// マルチカーソル機能　Alt + マウスで選択 同時に編集できる
// コードの画面が広くなる　Alt + 1
// 複数ファイル内検索 Ctrl + Shift + F
// コピー履歴から貼り付け　Ctrl + Shift + V
// Alt + Enter クイックフィックス　便利機能の呼び出し
// コードの整形 Ctrl + Alt + L
// 変数の抽出 Ctrl + Alt + V 式などを選択してから
// 宣言のジャンプ Ctrl + B
// 実装クラスにジャンプ　Ctrl + Alt + B
// 選択箇所の処理を戻す　Ctrl + Alt + N　　
// 変数やクラスが使われている箇所にジャンプ　Ctrl + Alt + F7
// メソッド Ctrl + Alt + M
// フィールドを抽出 Ctrl + Alt +
// 型の階層の表示、継承関係 Ctrl + H
// 呼び出し先が見れる Alt + Ctrl + H
// シグネチャーの変更　Ctrl + F6 　右クリック→リファクタリングでも出る
