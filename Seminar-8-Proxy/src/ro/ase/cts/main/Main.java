package ro.ase.cts.main;

import java.util.Scanner;

import ro.ase.cts.proxy.Authentication;
import ro.ase.cts.proxy.AuthenticationProxy;
import ro.ase.cts.proxy.AuthenticationSecurityException;
import ro.ase.cts.proxy.WebsiteAuthentication;

public class Main {

	public static void main(String[] args) {
		Authentication auth = new AuthenticationProxy(new WebsiteAuthentication());
		Scanner scanner = new Scanner(System.in);
		String username = "";
		String password = "";

		System.out.print("Username: ");
		username = scanner.nextLine();
		System.out.print("Password: ");
		password = scanner.nextLine();

		try {
			while (true) {
				if (auth.login(username, password)) {
					System.out.println("Login Successfully!");
					break;
				} else {
					System.out.println("Bad credentials!");
					System.out.print("Username: ");
					username = scanner.nextLine();
					System.out.print("Password: ");
					password = scanner.nextLine();
				}

			}
		} catch (AuthenticationSecurityException e) {
			System.out.println(e.getMessage());

		}
		scanner.close();
	}

}
