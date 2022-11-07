package collection_list;

import java.util.*;
class TestSort1{
public static void main(String args[]){

ArrayList al=new ArrayList();
/*
al.add(new Person2(8));
al.add(new Person2(3));
al.add(new Person2(1));
al.add(new Person2(9));
*/
al.add("Saurav");
al.add("Mukesh");
al.add("Tahir");
System.out.println("Array list..."+al);


Collections.sort(al); //Object doest not sorted without iterator
System.out.println("\nSorted list..."+al);

 }
}
