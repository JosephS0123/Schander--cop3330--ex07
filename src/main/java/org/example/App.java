/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        double Constant = 0.09290304;
        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is the length of the room in feet?" );
        int Length = uInput.nextInt();
        System.out.println( "What is the width of the room in feet?" );
        int Width = uInput.nextInt();
        System.out.println("You entered dimensions of "+ Length +" feet by " + Width+ " feet.\n The area is " +(Length*Width)+"square feet.\n"+(Constant*(Length*Width))+" square meters.");
    }
}
