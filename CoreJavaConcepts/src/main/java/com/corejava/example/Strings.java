package com.corejava.example;

public class Strings {

     public static void main(String[] args) {
          //ways to initialise string
          String str = "GeeksforGeeks";
          String demoString = new String("GeeksforGeeks");//No // String str = "GeeksforGeeks"; //Yes
          String s = new String("Welcome");
          s.concat("kl");
          StringBuffer sts = new StringBuffer("Well");
          sts.append("k");//mutable thread safe
          sts.append("gds");
          StringBuilder bds = new StringBuilder(0);//mutable//not thread safe
          bds.append("GFG");
          bds.append("GFC");
          System.out.println(str + " " + demoString + " " + s);
          System.out.println(sts);
          System.out.println(bds);


          //string pool in heap vs new allocation in heap
          if (str == demoString){
               System.out.println("yes");
          }
          else System.out.println("No");
     }
}
