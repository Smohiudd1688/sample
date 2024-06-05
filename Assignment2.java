// Assignment #: 2
// Name: Sana Mohiuddin
// StudentID: 1210685616
// Lecture: T Th (4:30 - 5:45)
// Time spent to complete assignment: 1 hour
// Description: Use a loop to receive integers from a user and calculate different attributes of the list

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args)
	{
	    int number = 0;
	    int largest = 0;
	    int even = 0;
	    int smallOdd = 0;
	    int negativeSum = 0;
		Scanner scan = new Scanner(System.in);
		//declares variables and create scanner
	    
	    do
	    {
	    	number = scan.nextInt();
	    	//prompts user and scan integer entered by user
	    	
	    	if (number > largest)
	    	{
	    		largest = number;
	    	}
	    	//determines which number is the largest
	    	
	    	if (number % 2 == 0)
	    	{
	    		even++;
	    	}
	    	//keeps track of how many even numbers have been inputed
	    	
	    	if (number % 2 != 0 && number < smallOdd)
	    	{
	    		smallOdd = number;
	    	}
	    	//determines which number is the smallest odd number
	    	
	    	if (number < 0)
	    	{
	    		negativeSum = negativeSum + number;
	    	}
	    	//calculates the total sum of negative number inputed
	    	
	    } while (number != 0);
	    
	    System.out.println("The maximum integer is this " + largest);
	    System.out.println("The count of even integers in the sequence is " + even);
	    System.out.println("The smallest odd integer in the sequence is " + smallOdd);
	    System.out.println("The sum of negative integers is " + negativeSum);
	    //prints out all the information calculated by the do-while loop
	}
}
