# 概要

## compile
- .javaファイルは.classファイルにコンパイルされる
- .classファイルをjvmが実行する
![picture 1](../images/80abe4e31c15ace1a00e9d375e58240b0cea96363ef87996479f16adb0cdf36c.png)  

## java platform
- platformとは
  - ハードウェア
  - ソフトウェアの環境
- 他platformと以下の点で異なる
  - software-only
  - ハードウェア上で動くプラットフォーム上で動く
- 構成要素
  - jvm
  - api

![picture 2](../images/0a934461bdc55efdb34dafb88632fc52fcf2d1a145c1141611e4af8c6ddee1d5.png)  

## comments
- ３種類コメントがある
```java
// text

/* text */

/** document */
```

## main method
- java appはmainメソッドを含まなければならない

```java
public static void main(String[] args)
```

- mainメソッドがentrypoint
- argsでコマンドライン引数を受け取れる

```
$ java MyApp arg1 arg2
```

- フラグ引数は無視するので注意

```
$ java MyApp -arg1 -arg2
```

# class

## def

```java
class Name {
}
```

## inheritence

```java
class Foo extends Bar {}
```

## interface

- methodのグループ
  
```java
interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
```

- interfaceを満たすためには
  - implementsを使う
  - 必要なメソッドを定義
  - メソッドをpublicにする

```java
class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

