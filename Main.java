package com.company;
import java.util.Scanner;

public class Main {
    public static String Name(){
        String name = "Alvaro Balboa";
        return name;
    }
    public static void main(String[] args) {
        /*Scanner kb = new Scanner(System.in);
        String name;
        System.out.printf("Please type in your name?");
        name = kb.nextLine();

        if(name == "Slim Shady"){
            System.out.printf("My name is what");
        }
        else
            System.out.printf("My name is %s",name);
        */
        //System.out.printf("Alvaro Balboa");
        System.out.println(Name());
        //Main test = new Main();
        //test.Name();
    }
}