package com.corejava.designpatterns;



public class Browser {

        //private static instance of the class
        private static Browser browser;

        //private constructor of the class
        private Browser(){}

        //public static getInstance method to provide access to the instance of the class
        public synchronized static Browser getInstance(){
           if(browser == null){
               browser = new Browser();
           }
       return browser;
        }

        //public method
        public  void  display()
        {
        System.out.println("browser info");
        }

}
