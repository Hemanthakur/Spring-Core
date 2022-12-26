package DP_01_a;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Welcome to our site. Would you like to order or repair?\n");
		String user_input=sc.nextLine();
		
		if(user_input.toLowerCase().equals("repair")) {
			System.out.println("Is it the phone or the accessory that you want to be replaced?");
			Rep repair=new Rep();
			RepAccessory repaira=new RepAccessory();
			String productType=sc.nextLine();
			if(productType.toLowerCase().equals("phone")){
			System.out.println("Please provide the phone model");
			String modelrep=sc.nextLine();
			repair.ProcessPhoneRepair(modelrep);
			}
			else
			{
			System.out.println("Please provide the accessory detail, like headphone ,tempered glass");
			String accessory=sc.nextLine();
			repaira.ProcessAccessoryRepair(accessory);
			}
		}
		else if(user_input.toLowerCase().equals("order")) {
			Ord order=new Ord();
			System.out.println("Please provide the phone model name");
			String model=sc.nextLine();
			order.ProcessOrder(model);
			
		}
		
	}

}
