package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
	System.out.println("Begin"+ "");
	System.out.println("Press 1 to create profile");
	System.out.println("Press 2 to create profile");
	System.out.println("Press 3 to create profile");
	System.out.println("Press 4 to create profile");
	System.out.println("Press 5 to create profile");
	System.out.println("Press 6 to create profile");
	System.out.println("Press 7 to create profile");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	
	int ch = sc.nextInt();
	FacebookControllerInterface fc = new FacebookController();
	switch(ch)
	{
	case 1:
		fc.createProfileController();
		break;
	case 2:
		fc.viewProfileController();
		break;
	case 3:
		fc.deleteProfileController();
		break;
	case 4:
		fc.editProfileController();
		break;
	case 5:
		fc.searchProfileController();
		break;
	case 6:
		fc.viewAllProfileController();
		break;
	case 7:
		fc.loginProfileController();
		break;
	default:
		System.out.println("None");
		
	}
	}
}
