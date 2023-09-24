package com.company;
import java.util.Scanner;

public class Bmi {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
double bmi,height,weight;
System.out.println("Enter the Height in Meters");
height = sc.nextDouble();
System.out.println("Enter the Weight in Kg");
weight = sc.nextDouble();

bmi = weight/(height*height);
System.out.println("Your Body Mass Index is"+bmi);

if (bmi<=18.5){
    System.out.println("You are in Under-weight :().");
}
else if (bmi>18.5 && bmi<=24.9) {
    System.out.println("Awesome! You are healthy :).");
}
else if (bmi>25 && bmi<=29.9){
    System.out.println("You are Over-weight:(.)");
}
else{
    System.out.println("You are obese.");
}    
}
    
}

