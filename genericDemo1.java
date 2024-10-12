package org.example;
import java.util.*;
public class genericDemo1 <t>{
    public static void main(String args[]){
        List <String> l=new ArrayList<>();
        l.add("sofiya");
        l.add("rabiya");
       l.add("banu");
        l.add(String.valueOf(30));
        System.out.println(l);
        for(int i=0;i< l.size();i++){
            String uppercase=l.get(i).toUpperCase();
            System.out.println(uppercase);
        }
    }
}
