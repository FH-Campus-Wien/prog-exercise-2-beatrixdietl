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
            System.out.println("The largest number is " + String.format("%.2f",largest));
            // https://www.edureka.co/community/5865/display-output-float-data-with-decimal-places-java-please-help
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int rows = scan.nextInt();
        int number = 1; //fortzählende Nummer

        if (rows <= 0){
            System.out.println("Invalid number!");
        }

        for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                    }
                System.out.println();
                }

         }


    //todo Task 3
    public void printPyramid(){
        // 3 Schleifen (Zeilen, Spalten, Abstand zum Rand)
        // rows minus i für die Leerzeichen
        // Sterne = 2 mal Zeilennummer minus 1

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
    public void marks() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        int mark;
        int negativemark = 0;

        do {
                System.out.print("Mark " + count + ": ");
                mark = scan.nextInt();

                if (mark < 6 && mark != 0) {
                    sum += mark;

                    if (mark == 5) {
                        negativemark++;
                    }
                    count++;

                } else if (mark > 5) {
                        System.out.println("Invalid mark!");
                    }

                else {
                    count--;
                }


        } while (mark != 0);

        if (count != 0) {

            double average = (double) sum / (double) count;


            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Negative marks: " + negativemark);
            // https://www.edureka.co/community/5865/display-output-float-data-with-decimal-places-java-please-help

            }
        else {
            System.out.println("Average: 0.00");
            System.out.println("Negative marks: " + negativemark);
        }
        }


    //todo Task 6
    public void happyNumbers(){
        // Abbruch wenn Zahl 4 oder 1 ist :-)
        // zwei geschachtelte Schleifen

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();

        double n = 0;

        //if (number != 1 && number != 4) {
            do {
                while (number != 0) {
                    n = n + Math.pow((number % 10), 2);
                    number = number / 10;
                }
                number = (int) n;
                n = 0;

            } while (number != 1 && number != 4);

            if (number == 1){
                System.out.println("Happy number!");
            } else {
                System.out.println("Sad number!");
            }

        //}


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