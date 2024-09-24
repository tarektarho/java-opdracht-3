import java.util.HashMap;

public class Translator {
    private static HashMap<Integer, String> numericAlpha;

    /**
     * Constructor for the Translator class.
     * Initializes the numericAlpha HashMap with the provided alphabetic and numeric arrays.
     *
     * @param alphabetic An array of Strings representing alphabetic values.
     * @param numeric An array of Integers representing numeric values.
     */
    public Translator(String[] alphabetic, Integer[] numeric) {
        numericAlpha = new HashMap<>();
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    /**
     * Translates a given number to its alphabetic representation.
     *
     * @param number The number to translate.
     * @return The alphabetic representation of the number.
     */
    public String translate(Integer number) {
        return numericAlpha.getOrDefault(number, "ongeldige invoer");
    }
}
