import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Color
		String color = "\u001B[47;1;30m", stop = "\u001B[0m";

		System.out.println(color + "\n*** Welcome to the new calculator concept! *** \n"
				+ "▼ Please, Choose an option from the calculator ▼ \n" + stop);
		menu();
	}

	public static void menu() {
		// Color
		String g = "\u001B[1;32m", n = "\u001B[1m", m = "\u001B[1;35m", stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);

		System.out.println(n + " - (1) simple calculator");
		System.out.println(" - (2) Square root");
		System.out.println(" - (3) Prime number");
		System.out.println(" - (4) Even or odd");
		System.out.println(" - (5) Pi number");
		System.out.println(" - (6) Exit" + stop);
		System.out.print(g + "Choose an option: " + stop);
		int menu = input.nextInt();

		if (menu == 1) {
			simpleCalculator();

		} else if (menu == 2) {
			squareRoot();

		} else if (menu == 3) {
			primeNumber();

		} else if (menu == 4) {
			evenOrOdd();

		} else if (menu == 5) {
			piNumber();

		} else {
			System.out.println(m + "Thank you for using calculator" + stop + n + " 🤝" + stop);
			System.exit(0);
		}

		input.close();

	}

	public static void simpleCalculator() {
		// color
		String c = "\u001B[1;36m", y = "\u001B[1;33m", g = "\u001B[1;32m", m = "\u001B[1;35m", n = "\u001B[1m",
				stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();

		String escolha;

		System.out.println(c + "\n*** SIMPLE CALCULATOR ***\n" + stop);

		do {
			System.out.print(y + "Enter the value: " + stop);
			double value1 = input.nextDouble();

			System.out.print(y + "Insert an operator " + stop + n + "(+, -, *, /, %, ^,): " + stop);
			char operation = input.next().charAt(0);

			System.out.print(y + "Enter the value: " + stop);
			double value2 = input.nextDouble();

			double result = calcular.calculation(value1, operation, value2);

			System.out.println(g + "Result of the operation is: " + stop + n + result + "\n" + stop);
			System.out.println(g + "The last calculation was (" + stop + n + value1 + " " + operation + " " + value2
					+ stop + g + ") and the result was: " + stop + n + result + "\n" + stop);

			System.out.println(n + "New calculation? insert (S): ");
			System.out.println("Exit to menu, insert (N): " + stop);
			escolha = input.next();

		} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não") && !escolha.equals("NÃO")
				&& !escolha.equals("Not") && !escolha.equals("NOT"));
		System.out.println(m + "Thank you for using the simple calculator.\n\n" + stop);
		menu();
		input.close();

	}

	public static void squareRoot() {
		// Color
		String c = "\u001B[1;36m", y = "\u001B[1;33m", g = "\u001B[1;32m", m = "\u001B[1;35m", n = "\u001B[1m",
				stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();

		String escolha;

		System.out.println(c + "\n*** SQUARE ROOT ***\n" + stop);

		do {
			System.out.print(y + "Enter the value: " + stop);
			double value1 = input.nextDouble();

			double result = calcular.raizQuadrada(value1);

			System.out.println(g + "The square root to: " + stop + n + value1 + stop + g + " is " + stop + n + result
					+ "\n" + stop);
			System.out.println(g + "The last calculation was (" + stop + n + value1 + stop + g
					+ ") and the result was: " + stop + n + result + "\n" + stop);

			System.out.println(n + "New calculation? insert (S): ");
			System.out.println("Exit to menu, insert (N): " + stop);
			escolha = input.next();

		} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não") && !escolha.equals("NÃO")
				&& !escolha.equals("Not") && !escolha.equals("NOT"));
		System.out.println(m + "Thank you for using the square root.\n\n" + stop);
		menu();
		input.close();
	}

	public static void primeNumber() {
		// Color
		String c = "\u001B[1;36m", y = "\u001B[1;33m", g = "\u001B[1;32m", m = "\u001B[1;35m", n = "\u001B[1m",
				stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();
		String escolha;

		System.out.println(c + "\n*** PRIME NUMBER ***\n" + stop);

		do {
			System.out.print(y + "Enter the number: " + stop);
			int value1 = input.nextInt();

			boolean result = calcular.getPrime(value1);

			System.out.println(g + "The number is prime: " + stop + n + result + "\n" + stop);
			System.out.println(g + "The last value was (" + stop + n + value1 + stop + g + ") and the result was: "
					+ stop + n + result + "\n" + stop);

			System.out.println(n + "New test? insert (S): ");
			System.out.println("Exit to menu, inset (N): " + stop);
			escolha = input.next();

		} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não") && !escolha.equals("NÃO")
				&& !escolha.equals("Not") && !escolha.equals("NOT"));
		System.out.println(m + "Thank you for using the prime number.\n\n" + stop);
		menu();
		input.close();
	}

	public static void evenOrOdd() {
		// Color
		String c = "\u001B[1;36m", y = "\u001B[1;33m", g = "\u001B[1;32m", m = "\u001B[1;35m", n = "\u001B[1m",
				stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();
		String escolha = null;

		System.out.println(c + "\n*** EVEN OR ODD ***\n" + stop);

		do {
			System.out.print(y + "Enter the value: " + stop);
			long value1 = input.nextLong();

			boolean result = calcular.getEvenOrOdd(value1);

			System.out.println(g + "The number is pair: " + stop + n + result + "\n" + stop);
			System.out.println(g + "The last value was (" + stop + n + value1 + stop + g + ") and the result was: "
					+ stop + n + result + "\n" + stop);

			System.out.println(n + "New test? insert (S): ");
			System.out.println("Exit to menu, inset (N): " + stop);
			escolha = input.next();

		} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não") && !escolha.equals("NÃO")
				&& !escolha.equals("Not") && !escolha.equals("NOT"));
		System.out.println(m + "Thank you for using the even or odd.\n\n" + stop);
		menu();
		input.close();
	}

	public static void piNumber() {
		// Color
		String c = "\u001B[1;36m", g = "\u001B[1;32m", n = "\u001B[1m", stop = "\u001B[0m";
		Scanner input = new Scanner(System.in);
		Calculadora calcular = new Calculadora();

		System.out.println(c + "\n*** PI NUMBER ***\n" + stop);

		System.out.println(g + "Pi number is: " + stop + n + calcular.getPi(0) + stop + g
				+ "\n\nThe value that is closest to any other, the ratio between the circumference of a circle and its diameter."
				+ stop);

		System.out.println(n + "\n*** Press enter to return to the menu ***" + stop);
		input.nextLine();
		menu();
		input.close();
	}

}
