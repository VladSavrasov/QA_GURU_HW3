package registrationtest.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    public Faker faker = new Faker();

    public String dayCheck() {
        String day = String.valueOf(faker.number().numberBetween(1, 31));
        return (Integer.parseInt(day) > 9) ? day : "0" + day;
    }

    public String getRandomCapital() {
        String ab = "abcdeghilmnoprstuy";
        SecureRandom rnd = new SecureRandom();
        return String.valueOf(ab.charAt(rnd.nextInt(ab.length())));
    }

    public String cityArrayGenerate(String state, String[] citiesNCR, String[]
            citiesUttar, String[] citiesHaryana, String[] citiesRajasthan) {
        if (state.equals("NCR")) return faker.options().option(citiesNCR);
        else if (state.equals("Uttar Pradesh")) return faker.options().option(citiesUttar);
        else if (state.equals("Haryana")) return faker.options().option(citiesHaryana);
        else return faker.options().option(citiesRajasthan);
    }
}
