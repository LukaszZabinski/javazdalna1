package pl.sda;

public class RootsCalculator {
    public static RootsCalculator calulateRootsOfSquareEquation(double a, double b, double c) throws NegativeDeltaException {

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta ujemna smuci");
            throw new NegativeDeltaException();

        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new RootsCalculator(x1, x2);

    }

}
}