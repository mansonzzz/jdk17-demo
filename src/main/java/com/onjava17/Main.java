package com.onjava17;

/**
 * @author zhangtian1
 */
public class Main {
    public static void main(String[] args) {
        var name = returnString();
        switch (name) {
            case "a" -> System.out.println("this is a");
            case "b" -> System.out.println("this is b");
            default -> System.out.println("this is default");
        }

    }

    public static String returnString() {
        return "a";
    }
}