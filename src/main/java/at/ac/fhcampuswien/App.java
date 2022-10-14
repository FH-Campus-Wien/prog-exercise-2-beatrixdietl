package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scan = new Scanner(System.in);
        double number = 0;
        int count = 1;
        double largest = 0;


        do {
            System.out.print("Number " + count + ": ");
            number = scan.nextDouble();
            count++;
            if (number > largest) {
                largest = number;
            }
        } while (number > 0);
        if (number <= 0 && count == 2) {
            System.out.println("No number entered.");

        } else {
            double roundnumber = Math.round(number*100.0)/100.0; // https://www.delftstack.com/de/howto/java/how-to-round-a-double-to-two-decimal-places-in-java/#:~:text=Die%20Methode%20Math.,double*100.0)%2F100.0%20beinhalten.
            System.out.println("The largest number is " + String.format("%.2f",largest));
        }
    }

//                if (number > 0 && number > largest) {
//                    largest = number;
//                }
//            } while (number > 0);
//            if (number <= 0 && count == 2){
//                System.out.println("No number entered.");
//            } else {
//            System.out.println("The largest number is " + largest);
//         }  if (number <= 0 && count != 1);{
//        if (number <= 0 && count != 1);{



    //todo Task 2
    public void stairs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int rows = scan.nextInt();
        int zahl = 1;

        if (rows <= 0){
            System.out.println("Invalid number!");
        }

        for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(zahl + " ");
                    zahl++;
                    }
                System.out.println();
                }

         }


    //todo Task 3
    public void printPyramid(){
        // 3 Schleifen (Zeilen, Spalten, Abstand zum Rand)
        // rows minus i für die Leerzeichen
        // Zusammen Sterne Zeilen  Sterne = 2 mal Zeilennummer minus 1
        int rows = 6;

        for (int i = 0; i < rows; i++) {
                for (int j = 1; j < rows-i ; j++) {
                    System.out.print(" ");
                }
                    for (int k = 0; k < i*2+1; k++) {
                        System.out.print("*");
                    }
            System.out.println();
                }
        }


    //todo Task 4
    public void printRhombus(){
        // Scanner scan = new Scanner(System.in);
        // char c;
        // c = 'H';
        // scan.next().charAt(0);
        // c --;// von H zu G
        // System.out.println((int) c);
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        //while (){
            //scan.nextInt;

        }
        // negative mark ist die Anzahl der Fünfer


    //todo Task 6
    public void happyNumbers(){
        // Abbruch wenn Zahl 4 oder 1 ist :-)
        // zwei geschachtelte Schleifen

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();

       // for (int n = 1; digits < 10; n++){

        //   int digits = number % 10;

        }




        }



    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}