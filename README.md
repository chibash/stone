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
