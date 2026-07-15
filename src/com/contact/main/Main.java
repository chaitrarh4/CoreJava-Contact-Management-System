package com.contact.main;

import java.util.Scanner;

import com.contact.model.ContactService;

public class Main {

	public static void main(String[] args) {
		Contact c = new Contact();
		ContactService cs = new ContactService();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add contact");
			System.out.println("2.viewContacts");
			System.out.println("3.searchContact");
			System.out.println("4.updateContact");
			System.out.println("5.deleteContact");
			System.out.println("6.searchByName");
			System.out.println("7.countContacts");
			System.out.println("8.sortbyName");
			int choice = sc.nextInt();
			switch(choice)
	        {
	            case 1:
	                ContactService.addContact();
	                break;

	            case 2:
	            	ContactService.viewContacts();
	                break;

	            case 3:
	            	ContactService.searchContact();
	                break;

	            case 4:
	            	ContactService.updateContact();
	                break;

	            case 5:
	            	ContactService.deleteContact();
	                break;
	            case 6:
	            	ContactService.searchByName();
	                break;
	            case 7:
	            	ContactService.countContacts();
	                break;  
	            case 8:
	            	ContactService.sortbyName();
	                break;  
	            case 9:
	                System.out.println("Thank You");
	                System.exit(0);

	            default:
	                System.out.println("Invalid Choice");
	        }
	    }
	
		}

	}


