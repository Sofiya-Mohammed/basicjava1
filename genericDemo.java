package org.example;
import java.util.*;
public class genericDemo <t>{
    public t object;
    public t getObject( t object){
        this.object=object;

        return object;
    }
    public static void main (String args[]){
        genericDemo <String >d=new genericDemo<>();
       String s=  d.getObject("sofiya");
       System.out.println(s);
       genericDemo<Integer> d1=new genericDemo<>();
       int a= d1.getObject(34);
       System.out.println(a);



    }


}
