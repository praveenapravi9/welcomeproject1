/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg10;

import java.util.Scanner;

/**
 *
 * @author user
 */
/*
class CheckEvenOdd 
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
       if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
*/
/*
public class Prime
{
   public static void main(String...args)
   {
       int i,m=0,flag=0;
       {
           int n = 7;
           m=n/2;
           for(i=2;i<=m;i++)
           {
               if(n%i==0)
               {
                   System.out.println("num is prime");
                   flag=1;
                   break;
               }
           }
                       if (flag==0)
                       {
                           System.out.println("num is not prime");
                        
                       }
       }
   }
}
*/
/*
public class Factorial 
{
    public static void main(String...args)
    {
        int i,fact=1;
        int number=6;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number is="+fact);
    }
}
*/
/*
public class Palindrome {

    public static void main(String args[])
    {
        
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
        
        if(isPalindrome(palindrome))
        {
            System.out.println("Number : " + palindrome + " is a palindrome");
        }
        else
        {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }       
        
    }
  
    public static boolean isPalindrome(int number)
    {
        int palindrome = number; 
        int reverse = 0;

        while (palindrome != 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse)
        {
            return true;
        }
        return false;
    }

}
*/

public class Revarse 
{
    public static void main(String args[])
    {
              System.out.println("Please enter number  ");
        int number = new Scanner(System.in).nextInt();
              int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));   
        }
      public static int reverse(int number)
      {
        int reverse = 0;
        int remainder = 0;
        do
        {
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
                  }
        while(number > 0);
              return reverse;
    }
}





