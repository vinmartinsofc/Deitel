package Random;

import java.util.Scanner;

public class Higher {
 public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
 int higher = Integer.MIN_VALUE;
 int secondHigher = Integer.MIN_VALUE;
 int iterator = 1;
 int keyboardInput;	

    while (iterator <= 10) {
	System.out.println("Enter the integer: ");
	keyboardInput = input.nextInt();
		
		if (keyboardInput > higher) {
			secondHigher = higher;
			higher = keyboardInput;

		} else if (keyboardInput > secondHigher && keyboardInput != higher ) {
					secondHigher = keyboardInput;

			}
		iterator++;

	}

	if (higher == Integer.MIN_VALUE) {
		System.out.println("Error");
		
	} else {
		System.out.println("Higher: " + higher);
		System.out.println("Second Higher: " + secondHigher);

		}
		
	}

}

