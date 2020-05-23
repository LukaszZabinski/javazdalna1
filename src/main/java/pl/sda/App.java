package pl.sda;




import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("proszę podac kolejno trzy liczby calkowite oddzielone przecinkiem np. 1,2,3");

        Scanner reader = new Scanner(System.in);

        String line = reader.nextLine();

        try


            double[] abc = cleanAndConvertToDoubleArray(line);

            double a = 0, b = 0, c = 0;


            try {
                a = abc[0];
                b = abc[1];
                c = abc[2];

                RootsOfSquareEquation roots = RootsCalculator.calulateRootsOfSquareEquation(a, b, c);

                System.out.println(roots.toString());
            } catch (NegativeDeltaException e) {
                System.out.println("Parametry a: " + a + " b " + b + " c " + c + " spowodowaly ujemna delte :<");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("wypadalo by dodac trzy argumenty ladnie prosze");
            }

            System.out.println("program sie nie konczy, mozesz programowac dalej");

        }

        public static double[] cleanAndConvertToDoubleArray(String line) {
            String[] numbersToConvert = line
                    .trim()
                    .replaceAll(" ", " ")
                    .split(",");

            double[] abc = new double[numbersToConvert.length];
            {


                for (int i = 0; i < numbersToConvert.length; i++) {
                    try {
                        double value = Double.parseDouble(numbersToConvert[i]);
                        abc[i] = value;
                    }
                    return abc;
                }
            }