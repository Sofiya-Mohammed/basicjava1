package org.example;
import java.util.*;
public class IteratorInterfaceDemo {

    public static void main(String agr[]){
        LinkedList list= new LinkedList();
        list.add("sofiya");
        list.add(30);
        list.add(67);
        list.add("rabiya");

        Iterator i= list.iterator();
        while(i.hasNext()){
            Object ob= i.next();
            System.out.println(ob);
        }
        LinkedList<Integer> l=new LinkedList<>();
        l.add(45);
        l.add(12);
        l.add(4);
        l.add(67);
        l.add(90);
        l.add(5);
        Iterator<Integer> i1= l.iterator();
        while(i1.hasNext()){
            Integer a=i1.next();
            if(a<10){
                i1.remove();
            }
            System.out.println("these values are printed when the a is printed:");
            System.out.println(a);
        }
        System.out.println("printing the value when list is printed");
        System.out.println(l);


    }



}
