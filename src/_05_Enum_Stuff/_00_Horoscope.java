package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		zodiac(Zodiac.AQUARIUS);
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void zodiac(Zodiac z) {
		if (z.equals(z.AQUARIUS)) {
	System.out.println("You will have good luck");	
		}
		if (z.equals(z.ARIES)) {
			System.out.println("You will win the lottery");
		}
		if (z.equals(z.CANCER)) {
			System.out.println("You will have bad luck");
		}
		if (z.equals(z.CAPRICORN)) {
			System.out.println("You will find One Hundred Dollars on the ground");
		}
		if (z.equals(z.GEMINI)) {
			System.out.println("You will go broke");
		}
		if (z.equals(z.LEO)) {
			System.out.println("You will never get sick");
		}
		if (z.equals(z.LIBRA)) {
			System.out.println("You will get sick");
		}
		if (z.equals(z.PISCES)) {
			System.out.println("You will experience happiness");
		}
		if (z.equals(z.SAGITTARIUS)) {
			System.out.println("You will experience sadness");
		}
		if (z.equals(z.SCORPIO)) {
			System.out.println("You will find five dollars on the ground");
		}
	if (z.equals(z.TAURUS)) {
		System.out.println("You will lose your most valuable possesion");
	}
	if (z.equals(z.VIRGO)) {
		System.out.println("I don't know :(");
	}

	}
	// 3. Make a main method to test your method
	
}
