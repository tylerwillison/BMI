package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//BMI = kg/m*m
    //m = inch *(0.0254meters/1inch
    //inch = m*(1inch/0.0254meter)

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        Double inch;
        Double pound;
        int imp;

        System.out.println("Welcome to the BMI calculator.");
        System.out.println("We need you to answer a few questions before we can get your BMI.");

        System.out.println("What is your height in inches");
            inch = keyboard.nextDouble();
        System.out.println("What is your weight in pounds?");
            pound = keyboard.nextDouble();
        System.out.println("BMI Calculating.");
            imp = 703;

        System.out.println(" ");
        System.out.print("Your BMI is ");
        System.out.print(imp*pound/(inch*inch));

        System.out.println(" ");
        System.out.println("The average adult BMI is 20-24.");
        System.out.println("18.5-24.9");
        System.out.println("Less than 18.5 for women is underweight");
        System.out.println("Less than 20 for men is underweight");
        System.out.println("25-29 is overweight");
        System.out.println("greater than 30 is obese");




















    }
}
