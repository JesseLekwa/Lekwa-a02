/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 jesse lekwa
 */



import java.util.Scanner;

public class solution15 {

    private void passCheck(String pass){

        if(pass.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }

    public static final Scanner scan = new Scanner(System.in);
    public static final String password = "qrisjx@fr";

    public static void main(String[] args){

        solution15 sol = new solution15();

        System.out.print("What is the password? ");
        String pass = scan.nextLine();
        sol.passCheck(pass);
    }
}