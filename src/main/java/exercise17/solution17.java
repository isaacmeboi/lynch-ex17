/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise17;


import java.util.Scanner;

class BloodAlcohol {
    int a;
    int choice;
    int w;
    int h;
    double bac;
    double r;

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        choice = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        a = sc.nextInt();

        System.out.print("What is your weight, in pounds? ");
        w = sc.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        h = sc.nextInt();
    }

    public void prt() {

        if(choice == 1) {
            r = 0.73;
        }
        else {
            r = 0.66;
        }

        bac = a * 5.14 / w * r - 0.015 * h;

        System.out.println("Your BAC is " + bac);
        if(bac<=0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else {
            System.out.println("It is illegal for you to drive.");
        }
    }
}
public class solution17{
    public static void main(String[] args) {
        BloodAlcohol ca = new BloodAlcohol();
        ca.scn();
        ca.prt();

    }
}
/*
first we import the scanner funciton, then create the class called BloodAlcohol which holds the initailzation
for the ints a, w, h, and choice as well as the doubles bac and r. it also contains the public voids, our
good friends, scn and prt. scan once again reads in the users inputs for sex, height, hours since last drink,
and amount of drinks. the prt void does the math and holds the if else statements for both the BAC of male or
female and the one to determine whether or not it's legal for the user to drive. the main function then calls
these two voids and runs the program.
 */