package com.corejava.dsa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibonacci {
    public static void main(String[] args) {
        //fibonacci series
          int n=11;
          if(n == 0){
              System.out.println(0);
        }
          else{
              int[] fib = new int[n+1];
              fib[0]=0;
              fib[1]=1;
              for(int i=2;i<=n;i++){
                  fib[i]=fib[i-1] + fib[i-2] ;
              }
              System.out.println("the fibonacci series till nth term");
              for(int i=0;i<=n;i++){
                  System.out.print(fib[i]+" ");
              }
        }
    }
}