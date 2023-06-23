package com.driver;

public class Main {
  
   public static void main(String[] args) {
        B b=new B();
     b.meth();
      // System.out.println(b.meth());
    }
    
}
static class A{
    public String meth(){
        
        return "Invoking method from class A";
    }
    
}
static class B extends A{
    
    public String meth(){
        A a=new A();
        a.meth();
        return "Method is overridden in Extendend class B";
    }
}
