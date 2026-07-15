package com.contact.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

import com.contact.main.Contact;

public class ContactService
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> a = new  ArrayList<>();
	public static  void addContact()
	{

		System.out.println("enter the contact_id");
		int contact_id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the mobileNumber");
		String mobileNumber = sc.next();
		System.out.println("enter the email");
		String email = sc.next();
		System.out.println("enter the address");
		String address = sc.next();

		Contact c = new Contact(contact_id,name,mobileNumber,email,address);
		a.add(c);
		System.out.println("Added Successfully");   
	}

	public static void viewContacts()
	{

		if(a.isEmpty())
		{
			System.out.println("Contact not found");
		}
		else
		{
			for(Contact c:a)
			{
				System.out.println(c);

			}
		}

	}
	public static void searchContact()
	{
		System.out.println("enter the contact_id");
		int id = sc.nextInt();
		boolean found = false;

		for(Contact c:a)
		{
			if(id == c.getContact_id())
			{
				System.out.println(c);
				found = true;
			}

		}
		if(!found)
		{
			System.out.println("contact not found");
		}
	}

	public static void updateContact()
	{
		System.out.println("enter the contact_id");
		int id = sc.nextInt();
		boolean found = false;

		for(Contact c:a)
		{
			if(id == c.getContact_id())
			{
				System.out.println("Enter the name");
				String name = sc.next();

				System.out.println("Enter the mobileNumber");
				String mobileNumber = sc.next();

				System.out.println("Enter the email");
				String email = sc.next();
				System.out.println("Enter the address");
				String address = sc.next();
				c.setName(name);
				c.setMobileNumber(mobileNumber);
				c.setEmail(email);
				c.setAddress(address);
				System.out.println("Updated Sucessfully");
                found = true;
			}

		}
		if(!found)
		{
			System.out.println("contact not found");
		}
	}
	public static void deleteContact()
	{
		System.out.println("enter the contact_id");
		int id = sc.nextInt();
		boolean found = false;
		for(Contact c:a)
		{
			if(id == c.getContact_id())
			{
				a.remove(c);
				System.out.println("Removed Sucessfully");
				found = true;
				break;
			}
		}
		if(!found)
	    {
	        System.out.println("contact Not Found");
	    }
		
	}
	public static void searchByName()
	{
		System.out.println("enter the name");
		String name = sc.next();
		boolean found = false;

		for(Contact c:a)
		{
			if(name.equals(c.getName()))
			{
				System.out.println(c);
				found = true;
			}

		}
		if(!found)
		{
			System.out.println("contact not found");
		}
	}

	public static void countContacts()
	{
		
			System.out.println("Total count :"+ a.size());
		
	}
	public static void sortbyName()
	{
		Collections.sort(a, (c1, c2) -> c1.getName().compareTo(c2.getName()));

		for(Contact c : a)
		{
		    System.out.println(c);
		}
	}
	public static void sortbyEmail()
	{
		Collections.sort(a, (c1, c2) -> c1.getEmail().compareTo(c2.getEmail()));

		for(Contact c : a)
		{
		    System.out.println(c);
		}
	}
	public static void sortbyMobileNumber()
	{
		Collections.sort(a, (c1, c2) -> c1.getMobileNumber().compareTo(c2.getMobileNumber()));

		for(Contact c : a)
		{
		    System.out.println(c);
		}
	}
}

