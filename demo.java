package org.example;
import java.util.*;
public class demo {
    public static void main (String args[]){
        List l =new ArrayList();
        int a=34;
        l.add(20);
        l.add("sofiya");
        l.add("rabiya");
        l.add(24);
        l.add(a);
        //used for removing using index
        l.remove(2);
        l.remove(2);
        l.remove(l.size()-1);
        //replacement
        l.set(1,"rabiya");
        l.add(a);
        l.add("banu");
        l.add("basha");
        String s= new String("sofiya");
        String s1="farisha";
        l.add(s);
        l.add(s1);
        l.remove(0);
        l.remove(2);


        System.out.println(l);
        // getting the value using index number and the value will be displayed
        System.out.println(l.get(0));
        System.out.println(l.size());
        //System.out.println(l.IndexOf(20));
        System.out.println(l.get(0));
        l.remove(1);
        l.add(1,"junith");
        for(Object ob:l){
            String data=(String)ob;
            System.out.println(data);

        }
        //for(int i=0;i<l.size();i++)
    }
}
