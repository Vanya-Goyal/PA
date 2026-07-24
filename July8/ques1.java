package ques1;
import java.util.*;

public class ques1{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Mango");
        System.out.println(fruits);
        System.out.println(fruits.size());
        Collections.reverse(fruits);
        Collections.sort(fruits); 
        Collections.max(fruits);
        
    }
}