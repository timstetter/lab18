package lab18;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Let’s locate some primes!");

		System.out.println("This application will let you enter any number, It will tell you if it's prime and which prime number it is.");
		boolean keepGoing = true;
		while (keepGoing) {
			int userInput = Validator.getIntInRange(scnr, "Enter a prime number between 2 and 999983: ", 2, 999983);

			if (primeCounter(userInput) == 0) {
				System.out.println(userInput + " is not a prime number");
			} else if (userInput == 2) {
				System.out.println("You entered: " + userInput);
				System.out.println("It is the " + primeCounter(userInput) + "st prime number");
			} else if (userInput == 3) {
				System.out.println("You entered: " + userInput);
				System.out.println("It is the " + primeCounter(userInput) + "nd prime number");

			} else if (userInput == 5) {
				System.out.println("You entered: " + userInput);
				System.out.println("It is the " + primeCounter(userInput) + "rd prime number");

			} else {
				System.out.println("You entered: " + userInput);
				System.out.println("It is the " + primeCounter(userInput) + "th prime number");
			}
			keepGoing = Validator.getYesNo(scnr, "Do you want to keep going? ");
		}
		System.out.println("Goodbye!");

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int primeCounter(int n) {
		if (isPrime(n)) {

			ArrayList<Integer> primes = new ArrayList<Integer>();
			if (n <= 1)
				return 0;
			if (n == 2)
				return 1;
			if (n == 3)
				return 2;

			primes.add(2);
			primes.add(3);

			for (int i = 4; i <= n; i++) {
				boolean isPrime = true;
				for (int p : primes) {
					int m = i % p;
					if (m == 0) {
						isPrime = false;
						break;
					}
				}

				if (isPrime) {
					primes.add(i);
				}
			}

			return primes.size();

		} else {
			return 0;
		}

	}
}
