package anudip.MobilePurchaseSystem.client;

import java.util.Scanner;

import anudip.MobilePurchaseSystem.entity.Mobiles;
import anudip.MobilePurchaseSystem.service.Serviceimpl;


public class Mpsmain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//obj of Serviceimpl class
		Serviceimpl service=new Serviceimpl();
		int y;
		
		//taking iput from user until he exits
		do 
		{
			System.out.println("1.insert purchase details");
			System.out.println("2.insert mobile data");
			System.out.println("3.view details of all the mobiles");
			System.out.println("4.delete a mobile details based on id");
			System.out.println("5.search for any mobile using range of price");
			System.out.println("enter your choice:");
			int x=sc.nextInt();
			switch(x)
			{
			
			//insert purchase details
			case 1:System.out.println("enter mobile id to purchase"); 
					int id1=sc.nextInt(); 
					service.insertpurchasedetails();
					//update purchase details
					service.update(id1);
					break;
					
			//insert mobile data
			case 2:	service.insertmobile();
					break;
					
			//view details of all the mobiles
			case 3:	System.out.println(service.display());
					break;
					
			//delete a mobile details based on id
			case 4:	System.out.println("enter id to delete the record:"); 
					int id=sc.nextInt(); 
					service.delete(id);
					break;
					
			//search for any mobile using range of price
			case 5: service.search();
					break;
			default:System.out.println("enter valid choice:");
			}
			
			System.out.println("enter 1 to continue 0 to exit:");
			y=sc.nextInt();
			
		}while(y==1);
		sc.close();
	}

}
