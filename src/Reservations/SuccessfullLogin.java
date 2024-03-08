package Reservations;
import java.util.Scanner;
public class SuccessfullLogin {
	
	static void Book () {
	System.out.println("login Successfull");
	System.out.println("\n Enter you'r choice");
	
	System.out.println(" 1. Book Ticket");
	System.out.println("2. cancal Book Ticket");
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
		System.out.println("book ticket canceled");
	}
}
	}
 

}