package DatingEquation;

import java.util.Scanner;

/**
 * @author: Bit Jet Kit
 * Title: DatingEquation
 * Date: March 30, 2021
 * Purpose: Calculate the socially acceptable age of a potential dating partner.
 */
public class DatingEquation{
    Scanner readInt = new Scanner(System.in);
    private int age;

    public void setAge(){
        this.age = readInt.nextInt();
    }
    public void showDateBound(){
        age = age / 2 + 7;
        System.out.println("Your lower bound for the socially acceptable age of a potential" 
        + "dating partner is: " + age);
    }
    public void proveDate(){
        System.out.println("=============Dating Equation=============");
        System.out.println("Enter your age (a whole number):");
        setAge();
    }
}
