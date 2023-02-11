package LockedMe.com;

import java.util.Scanner;

public class LockerMain {

	public static void main(String[] args) {
		
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
         //Displaying Welcome Screen, Company Name, Application Name and Developer Name. 
		System.out.println("\t**********************\n");
		System.out.println("\t Welcome to LOCKEDME! ");
		System.out.println("\n    Company Name: By, Locker Pvt. Ltd. \n");
		System.out.println("\t**********************");
		System.out.println("      Application Name: LockedMe \n      Developer Name: Nilesh Pandey");
		System.out.println(" ");
		
		while(true)
		{
			System.out.println("Please choose one of the following options :");
			System.out.println("1. Retrieving the file names in an ascending order (List Current Files).");
			System.out.println("2. Business-level Operations.");
			System.out.println("3. Close The Application.");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1: //List function feature to list all files in ascending order.
				BusinessOperations.listFiles();
				break;
				
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. Add a File.");
					System.out.println("2. Delete a File.");
					System.out.println("3. Search for a File.");
					System.out.println("4. Return to the main context.");
			
				
					try{    
						 choice = sc.nextInt();
					}
					
				
				
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
						//Creation of a file takes place
						
						System.out.println("Input the name of a file to be created: ");
						String fileCreate = sc.next();
						
						// Calling the function to create the file
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of a file takes place
						System.out.print("Input the name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						// Calling the function to delete the file
						BusinessOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Input the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						BusinessOperations.searchFile(fileSearch);
						break;
						
					case 4:
						System.out.println("Current execution context Closed Succesfully......\n");
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("\n Opps! Invalid Input,Re-do the process\n");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\n Thankyou for using 'LOCKEDME' Application");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println("\n\n Invalid Input, Select within the range of 1-3\n");
				break;
			
			}
		}
		
	}

}
