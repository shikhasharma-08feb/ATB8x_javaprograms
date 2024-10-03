package SEPT.Ex_27092024;

import java.util.Scanner;

public class Lab060_Triangle_Task {
    public static void main(String[] args) {
        //✅ Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side1");
        double side1=sc.nextDouble();

        System.out.println("Enter Side2");
        double side2=sc.nextDouble();

        System.out.println("Enter Side3");
        double side3=sc.nextDouble();

        if (side1>0 && side2>0 && side3>0)
        {
        if(side1==side2 && side1==side3 && side2==side3)
        {
            System.out.println("Equilateral Traingle");
        }
        else if (side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Isosceles Traingle");
        }
        else
        {
            System.out.println("scalene- No sides are equal");
        }}
        else {
            System.out.println("Side should be greater than zero");
        }
    }
}
