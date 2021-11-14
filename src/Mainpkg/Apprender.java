package Mainpkg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import java.util.Iterator;

import asimpleclass.AccountDetails;



public class Apprender {

	
	
	
	
	
	
	
	

		   public static void main(String[] args) {
		      
			   
		      List<AccountDetails> c = new ArrayList<AccountDetails>();
		      
		      Scanner s = new Scanner(System.in);
		      Scanner s1 = new Scanner(System.in);
	
		      int ch;
		      do{
		    	  
		         System.out.println("1.CREATE Password");
		         System.out.println("2.DISPLAY");
		         System.out.println("3.List Password and Account");
		         System.out.println("4.DELETE Account");
		         System.out.println("5.UPDATE Account ");
		         System.out.print("Enter Your Choice : ");
		         ch = s.nextInt();

		         switch(ch){
		            case 1:
		               System.out.print("Enter Account_Number : ");
		               int Account_Number = s.nextInt(); //e
		               System.out.print("Enter Url : " + "\r\n");
		               String Url = s1.nextLine();//enMe
		               System.out.print("Enter Password :  " + "\r\n");
		               String Password = s1.nextLine();//salary
		               System.out.print("Enter Group : ");
		               String Group = s1.nextLine();

		               c.add(new AccountDetails(Account_Number,Url,Password,Group));
		            break;
		            case 2:
		               System.out.println("----------------------------");
		               Iterator<AccountDetails> i = c.iterator();
		               while(i.hasNext()){
		            	   AccountDetails e = i.next(); 
		                  System.out.println(e);
		               }
		               System.out.println("----------------------------");
		            break;
		            case 3:
		               boolean found = false;
		               System.out.print("Enter Account to Search :");
		               Account_Number = s.nextInt();
		               System.out.println("----------------------------");
		               i = c.iterator();
		               while(i.hasNext()){
		            	   AccountDetails e = i.next();
		                  if(e.getAccount_Number() == Account_Number)  {
		                     System.out.println(e);
		                     found = true;
		                  }
		               }
		               
		               if(!found){
		                  System.out.println("Record Not Found");
		               }
		               System.out.println("----------------------------");
		            break;

		            case 4:
		               found = false;
		               System.out.print("Enter Account_Number to Delete :");
		               Account_Number = s.nextInt();
		               System.out.println("----------------------------");
		               i = c.iterator();
		               while(i.hasNext()){
		            	   AccountDetails e = i.next();
		                  if(e.getAccount_Number() == Account_Number)  {
		                     i.remove();
		                     found = true;
		                  }
		               }
		               
		               if(!found){
		                  System.out.println("Record Not Found");
		               }else{
		                  System.out.println("Record is Deleted Successfully...!");
		               }

		               System.out.println("----------------------------");
		            break;
		            case 5:
		               found = false;
		               System.out.print("Enter Account_Number to Update :");
		               Account_Number = s.nextInt();
		               
		               ListIterator<AccountDetails>li = c.listIterator();
		               while(li.hasNext()){
		            	   AccountDetails e = li.next();
		                  if(e.getAccount_Number() == Account_Number)  {
		                     System.out.print("Enter new Password : ");
		                     Password = s.nextLine();
		                     Group = s.nextLine();
		                     Url = s.nextLine();
		                     System.out.print("Check new Password : ");
		                     //if(Password  )
		                    
		                     li.set(new AccountDetails(Account_Number,Url,Password,Group));
		                     found = true;
		                  }
		               }
		               
		               if(!found){
		                  System.out.println("Record Not Found");
		               }else{
		                  System.out.println("Record is Updated Successfully...!");
		               }

		               
		            break;

		            
		         }
		      }while(ch!=0);
		   }
		}

