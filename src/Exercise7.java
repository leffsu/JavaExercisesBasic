import java.util.Scanner;

public class Exercise7 {

//    7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//    Test Data:
//    Input a number: 8
//    Expected Output :
//            8 x 1 = 8
//            8 x 2 = 16
//            8 x 3 = 24
//            ...
//            8 x 10 = 80

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Write number");
        int Number = keyboard.nextInt();

        for (int i = 1; i <= 10; i++ ) {

            System.out.println(Number + " x " + i + " = " + Number * i);
        }
    }
}
