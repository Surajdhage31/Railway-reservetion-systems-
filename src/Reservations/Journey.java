package Reservations;
import java.util.Scanner;
public class Journey {
	public int city () {
		
		System.out.println(" 1.pune_to_mumbai");
	    System.out.println("2.mumbai_to_pune");
		  Scanner a = new Scanner(System.in);
		  int bus =  a.nextInt();
			 if( bus ==1)
			  {
				  System.out.println("pune_to_mumbai");
				 System.out.println(" Time  12:30 pm");
				  
			  }
			  else
			  {
				  System.out.println("mumbai_to_pune");
				  System.out.println("Time 3:20 pm");
			  }
			  System.out.println("1.Ac \n 2.Sleeper \n 3. Genral");
			  int red = a.nextInt();
			  switch (red)
			  {
			  case 1 :
			  {    System.out.println("Avalible Seats : 180");
				  System.out.println("\nplease Paid ticket price/fee Rs:1500");
				  int money= a.nextInt();
				  if (money == 1500)
				  {
				  System.out.println("paid :" +money);
				  System.out.println("your seat number is:1101");
				  System.out.println("\nTicket booked ");
				  }
				  else
				  {
					  System.out.println("not enough fund");
				  }
                 break ;
				  }
			  case 2 :
			  {   System.out.println("Avalible Seats : 200");
				  System.out.println("\nplease Paid ticket price/fee Rs:1000 ");
				  int money= a.nextInt();
				  
				  if (money == 1000)
				  {
				  System.out.println("paid :" +money);
				  System.out.println("\nyour seat number is:1201");
					System.out.println("\nTicket booked ");

				  }
				  else
				  {
					  System.out.println("not enough fund");
				  }
				  break ;
			  }
			  case 3:
			  {  System.out.println("Avalible Seats : 250");
				  System.out.println("\nplease Paid ticket price/fee Rs:210 ");
				  int money= a.nextInt();
				  
				  if (money == 210)
				  {
				  System.out.println("paid :" +money);
				  System.out.println("your seat number is:1301");
					System.out.println("Ticket booked ");

				  }
				  else
				  {
					  System.out.println("not enough fund");
				  }
				  System.out.println("paid :" +money);
					System.out.println("Ticket booked ");

				  
			  }
			  }
				 
			
			return 0;
		}
		
		}
	
