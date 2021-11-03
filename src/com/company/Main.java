package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> pizzas = new ArrayList<>();
        pizzas.add("s");
        pizzas.add("m");
        pizzas.add("l");
        int end = 0;
        double total = 0.0;


        while (end == 0){
            System.out.println("what size pizza do you want? (0=s 1=m 2=l)");
            String size = input.next();

            if (size.equals("0")){
                total = total + 7.99;
            }

            if (size.equals("1"){
                total = total + 10.99;
            }

            if (size.equals("2")){
                total = total + 13.99;
            }

            else{
                System.out.println("Invalid input");
            }

            System.out.println("Do you want extra toppings?");
            String eToppings = input.next();

            if (eToppings.equals("y")){
                System.out.println("How many extra toppings do you want?");
                int EToppings = input.nextInt();
                total = total +
            }


        }



    }
}
