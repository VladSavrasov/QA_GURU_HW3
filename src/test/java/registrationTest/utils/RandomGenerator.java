package registrationTest.utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public String arrayGenerate(String[] array) {
        int randomInt = getRandomInt(0, array.length);
        return array[randomInt];
    }
    public String getRandomCapital() {
        String ab = "abcdeghilmnoprstuy";
        SecureRandom rnd = new SecureRandom();
        return String.valueOf(ab.charAt(rnd.nextInt(ab.length())));
    }

    public String cityArrayGenerate(String state, String[] citiesNCR, String[]
            citiesUttar, String[] citiesHaryana, String[] citiesRajasthan) {
        if (state.equals("NCR")) return arrayGenerate(citiesNCR);
        else if (state.equals("Uttar Pradesh")) return arrayGenerate(citiesUttar);
        else if (state.equals("Haryana")) return arrayGenerate(citiesHaryana);
        else return arrayGenerate(citiesRajasthan);
    }
}
