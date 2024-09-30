import java.util.Scanner;

public class Main {

    /**
     * Main method to start the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // numeriek array
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // alfabetisch array
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        // Maak een nieuwe instantie van de Translator class
        Translator translator = new Translator(alphabetic, numeric);

        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        String ongeldig = "ongeldige invoer";

        // while loop om het spel te starten
        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if(input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number >= 0 && number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}
