import java.util.Scanner;

public class Exercise6 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//    Test Data:
//    Input first number: 125
//    Input second number: 24
//    Expected Output :
//            125 + 24 = 149
//            125 - 24 = 101
//            125 x 24 = 3000
//            125 / 24 = 5
//            125 mod 24 = 5

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Write numbers");
        int FirstNumber = keyboard.nextInt();
        int SecondNumber = keyboard.nextInt();

        System.out.println(FirstNumber + SecondNumber);
        System.out.println(FirstNumber - SecondNumber);
        System.out.println(FirstNumber * SecondNumber);
        System.out.println(FirstNumber / SecondNumber);
        System.out.println(FirstNumber % SecondNumber);

    }




}
