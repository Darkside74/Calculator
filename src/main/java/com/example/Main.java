import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Bienvenue dans la calculatrice simple!");
        System.out.print("Entrez le premier nombre: ");
        double num1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choisissez une opération:");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Résultat: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Résultat: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Résultat: " + result);
                break;
            case 4:
                try {
                    result = calculator.divide(num1, num2);
                    System.out.println("Résultat: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Choix invalide!");
        }

        scanner.close();
    }
}
