/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;
public class ProblemSet2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*
    * Exercise 1.
    *
    * Prompt the user to enter the following information (in order): first name, last
    * name, grade, age, and hometown.
    */
    System.out.print("\nEnter your first name: ");
    String firstName = in.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = in.nextLine();
    System.out.print("Enter your grade: ");
    String grade = in.nextLine();
    System.out.print("Enter your age: ");
    String age = in.nextLine();
    System.out.print("Enter your hometown: ");
    String hometown = in.nextLine();

    System.out.println("\nNAME     : " + firstName + " " + lastName);
    System.out.println("GRADE    : " + grade);
    System.out.println("AGE      : " + age);
    System.out.println("HOMETOWN : " + hometown);


    /*
    * Exercise 2.
    *
    * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
    * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
    */
    int singleValue = 100;
    int quarterValue = 25;
    int dimeValue = 10;
    int nickelValue = 5;
    int pennyValue = 1;

    System.out.print("\nEnter a dollar amount: ");
    double dollarAmount1 = in.nextDouble();

    int pennyAmount1 = (int) (dollarAmount1 * 100);

    int numSingles1 = pennyAmount1 / singleValue;
    pennyAmount1 = pennyAmount1 % singleValue;

    int numQuarters1 = pennyAmount1 / quarterValue;
    pennyAmount1 = pennyAmount1 % quarterValue;

    int numDimes1 = pennyAmount1 / dimeValue;
    pennyAmount1 = pennyAmount1 % dimeValue;

    int numNickels1 = pennyAmount1 / nickelValue;
    pennyAmount1 = pennyAmount1 % nickelValue;

    int numPennies1 = pennyAmount1 / pennyValue;
    pennyAmount1 = pennyAmount1 % pennyValue;

    System.out.println("\nDOLLARS  : " + numSingles1);
    System.out.println("QUARTERS : " + numQuarters1);
    System.out.println("DIMES    : " + numDimes1);
    System.out.println("NICKELS  : " + numNickels1);
    System.out.println("PENNIES  : " + numPennies1);


    /*
    * Exercise 3.
    *
    * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
    * bills and coins needed to produce this amount.
    */
    int twentyValue = 2000;
    int tenValue = 1000;
    int fiveValue = 500;

    System.out.print("\nEnter a dollar amount: ");
    double dollarAmount2 = in.nextDouble();

    int pennyAmount2 = (int) (dollarAmount2 * 100);

    int numTwenties2 = pennyAmount2 / twentyValue;
    pennyAmount2 = pennyAmount2 % twentyValue;

    int numTens2 = pennyAmount2 / tenValue;
    pennyAmount2 = pennyAmount2 % tenValue;

    int numFives2 = pennyAmount2 / fiveValue;
    pennyAmount2 = pennyAmount2 % fiveValue;

    int numSingles2 = pennyAmount2 / singleValue;
    pennyAmount2 = pennyAmount2 % singleValue;

    int numQuarters2 = pennyAmount2 / quarterValue;
    pennyAmount2 = pennyAmount2 % quarterValue;

    int numDimes2 = pennyAmount2 / dimeValue;
    pennyAmount2 = pennyAmount2 % dimeValue;

    int numNickels2 = pennyAmount2 / nickelValue;
    pennyAmount2 = pennyAmount2 % nickelValue;

    int numPennies2 = (int) (pennyAmount2 / pennyValue);
    pennyAmount2 = pennyAmount2 % pennyValue;

    int numBills = numTwenties2 + numTens2 + numFives2 + numSingles2;
    int numCoins = numQuarters2 + numDimes2 + numNickels2 + numPennies2;

    System.out.println("\nBILLS  : " + numBills);
    System.out.println("COINS  : " + numCoins);

    /*
    * Exercise 4.
    *
    * Given a number of inches, print the equivalent number of miles, yards, feet,
    * and inches.
    */



    /*
    * Exercise 5.
    *
    * Given a number of centimeters, print the equivalent number of kilometers,
    * meters, and centimeters.
    */



    /*
    * Exercise 6.
    *
    * Given a diameter, print the area and circumference of the corresponding circle.
    */



    /*
    * Exercise 7.
    *
    * Given a length and width, print the area, perimeter, and diagonal of the
    * corresponding rectangle.
    */



    /*
    * Exercise 8.
    *
    * Given a side length, print the area and perimeter of the corresponding hexagon.
    */



    /*
    * Exercise 9.
    *
    * Given a string, reverse and print the first and second halves of that string.
    */



    /*
    * Exercise 10.
    *
    * Given a first, middle, and last name, print the corresponding initials.
    */

    in.close();
  }
}
