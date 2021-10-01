package com.ttn;

public class App {
    public String something()
    {
        return "hello world";
    }
    public static void main(String[] args) {
       App p=new App ();
       String s=p.something ();
        System.out.println (s);
    }
}
