public class SolveForX {
    public static void main(String[] args) {
        // Equation: 2x + 3 = 11
        double a = 2; // Coefficient of x
        double b = 3; // Constant term
        double c = 11; // Right-hand side

        // Solving for x
        double x = (c - b) / a;

        System.out.printf("The solution to %.0fx + %.0f = %.0f is:\nx = %.2f\n", a, b, c, x);
    }
}
