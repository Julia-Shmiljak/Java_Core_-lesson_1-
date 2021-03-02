package ua.lviv.lgs;
import java.util.Random;
public class Application {
	public static void main(String[] args) {
		byte b = 8;
		short sh = 12;
		int in = 120;
		long l = 5L;
		float f = 7.7F;
		double d = 12.214;
		char c = 2;
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Char = " + (int)Character.MAX_VALUE);
		System.out.println("Char = " + (int)Character.MIN_VALUE);
		System.out.println("Boolean = " + Boolean.FALSE);
		System.out.println("Boolean = " + Boolean.TRUE);
		
		int sum = 1000;
		Random random = new Random(sum);
		int array[] = new int [10];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(500);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array = " + array[i]);
		}
		for (int i = 0; i < array.length; i++) 
			max = Math.max(max, array[i]);
		System.out.println("Max = " + max);
		
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}	
		System.out.println("Min = " + min);
	}
}

