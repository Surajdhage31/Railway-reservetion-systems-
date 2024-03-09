//package collegeLoginPackages;
package Reservations;
import java.util.Scanner;
 
public class Page  {
	SuccessfullLogin success;
	
	
	public void login ()
	{
		  try (Scanner scan = new Scanner(System.in)) {
			  System.out.println("Welcome To Indian Railway Ticket Booking");
			  System.out.println("// Online Payments througth UPI //");
			  System.out.println("*Free Cancellation of Train Tickets*");
			  System.out.println("#Instant Refund on Indian Railway Reservation Cancellation#");
			  System.out.println("||24*7 Support for IRCTC Train Ticket Booking||");
			  System.out.println(" pleses login your account");
			System.out.println("Enter your username");
			String  userName = scan.next();
			System.out.println("Enter your password");
			//Scanner b = new Scanner(System.in);
			int password = scan.nextInt();
			String user = "suraj" ;
			int pass = 1234;
			if ( (userName.equalsIgnoreCase(user)) && (pass == password ))
			{
				
				success.Book();
				//time ,paid ,sleeper ,normal,bus 
			}
			else
			{
				System.out.println(" Incorrect credential");
				
			}
			
			

			}
		  
			}
					}

		



