package corejava;
import java.util.Scanner;

public class Nonstaticmethod {
		public int add() { //our non static method
			System.out.println("Enter your numbers");
			Scanner s = new Scanner(System.in);
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int total = num1 + num2;
			return total;
		}
		public static void main(String[] args) {
			// create reference to the non static method add()
			Nonstaticmethod a = new Nonstaticmethod();
			
			int sum = a.add();
			System.out.println(sum);
		}

	}
