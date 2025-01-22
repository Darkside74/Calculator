public class Calculator {

    // Méthode pour additionner deux nombres
    public double add(double a, double b) {
        return a + b;
    }

    // Méthode pour soustraire deux nombres
    public double subtract(double a, double b) {
        return a - b;
    }

    // Méthode pour multiplier deux nombres
    public double multiply(double a, double b) {
        return a * b;
    }

    // Méthode pour diviser deux nombres
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro n'est pas autorisée.");
        }
        return a / b;
    }
}
