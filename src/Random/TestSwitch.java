package Random;

public class TestSwitch {
	public static void main (String[] args) {

	int value = 5;

		if (value % 2 == 0) {
		value = 0;
			
		} else {
		value = 1;		
			
		}

		
		switch (value) {

		case 0:
		System.out.println("Even integer");
		break;
		case 1:
		System.out.println("Even Odd");
		break;
		default:
		System.out.println("Have no idea what happened!");
		break;
			
		}

	}


}