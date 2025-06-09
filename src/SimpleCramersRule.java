//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SimpleCramersRule {
    public static void main(String[] args) {
        // Example: Solve 2x + 3y = 8 and 4x - y = 2
        double a = 2, b = 3, c = 8;
        double d = 4, e = -1, f = 2;

        // Calculate the determinants
        double D  = a * e - b * d;
        double Dx = c * e - b * f;
        double Dy = a * f - c * d;

        double x = Dx / D;
        double y = Dy / D;

        System.out.printf("x = %.4f\n", x);
        System.out.printf("y = %.4f\n", y);

        // Optional: Verify the solution
        System.out.print("\nVerification:\n");
        System.out.printf("Equation 1: %.2f\n", a * x + b * y);
        System.out.printf("Equation 2: %.2f\n", d * x + e * y);
    }
}
