# stone
A simple programming language written for book "A new scripting language in two weeks" (千葉　滋、「２週間でできる！スクリプト言語の作り方」技術評論社、2012, ISBN 978-4-7741-4974-5).

The source of gluonj.jar is available from https://github.com/chibash/gluonj

To compile,

```
javac -d ./bin -sourcepath ./src -cp gluonj.jar src/*/*.java
```

and to run, for example,

```
java -cp ./bin:gluonj.jar chap6/Runner
```


# 動作しないとき
## 実行できない
発生：2023/04/28　状況：解決
src/chapX/*.java　を右クリックで実行．しかしエラーが出る．

「a jni error has occurred～」というエラーが出た時の対処法

https://qiita.com/Masashi9410/items/768223611b9286847f58

プロジェクト「stone」を右クリック右クリック→プロパティー→
左側のJavaコンパイラーを選択→コンパイラー準拠レベル：を選択
JREのレベルに合わせる(1.8)