package Reservations;
import java.util.Scanner;
public class SuccessfullLogin {
	
	static void Book () {
	System.out.println("login Successfull");
	
	System.out.println("\n Enter you'r choice");
	System.out.println(" 1. Book Ticket");
	System.out.println(" 2.Book meals for train journey");
	System.out.println(" 3. cancal Book Ticket");
	Scanner d = new Scanner (System.in);
	int book = d.nextInt();
	switch(book) {
	case 1:
	{
		Journey f = new Journey ();
		f.city();
		break ;
	}
	case 2 :
	{
		CenterPoint hotel = new CenterPoint ();
		hotel.Hotels();
	}
	case 3 :
	{
		System.out.println("book ticket canceled");
	}
}
	}
 

}