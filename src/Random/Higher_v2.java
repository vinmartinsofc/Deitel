package Random;

import java.util.Scanner;

public class Higher_v2 {
 public static void main (String[] args) {
 Scanner input = new Scanner(System.in);
 int higher = Integer.MIN_VALUE;
 int secondHigher = Integer.MIN_VALUE;
 int thirdHigher = Integer.MIN_VALUE;
 int iterator = 1;
 int keyboardInput;	

    while (iterator <= 10) {
	System.out.println("Enter the integer: ");
	keyboardInput = input.nextInt();
		
		if (keyboardInput > higher) {
			thirdHigher = secondHigher;
			secondHigher = higher;
			higher = keyboardInput;

		} else if (keyboardInput > secondHigher && keyboardInput != higher) {
					secondHigher = keyboardInput;
			} else if (keyboardInput > thirdHigher && keyboardInput != higher && keyboardInput != secondHigher) {
					thirdHigher = keyboardInput;

				}


		iterator++;

	}

	if (higher == Integer.MIN_VALUE) {
		System.out.println("Error!");
		
	} else {
		System.out.println("Higher: " + higher);
		System.out.println("Second Higher: " + secondHigher);
		System.out.println("Third Higher: " + thirdHigher);

		}
		
	}

}

