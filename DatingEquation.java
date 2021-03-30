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

    public int age(){
        return age;
    }
    public void setAge(){
        this.age = readInt.nextInt();
    }
    public String toString(){
        return "Your lower bound for the socially acceptable age of a potential" 
        + "dating partner is: " + age() / 2 + 7;
    }
    public void showAcceptableDate(){
        System.out.println("=============Dating Equation=============");
        System.out.println("Enter your age (an whole number)");
        setAge();
        toString();
    }
}