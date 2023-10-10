package registrationtest;

import com.github.javafaker.Faker;
import registrationtest.utils.RandomGenerator;

public class TestData extends RandomGenerator {
    String monthArray[] = {"January","February","March","April","May","June",
            "July","Augest","September","October","November","December"};
    String hobbies[] = {"Sports","Reading","Music"};
    String states[] = {"NCR","Uttar Pradesh","Haryana","Rajasthan"};
    String citiesNCR[] = {"Delhi","Gurgaon", "Noida"};
    String citiesUttar[] = {"Agra","Lucknow", "Merrut"};
    String citiesHaryana[] = {"Karnal","Panipat"};
    String citiesRajasthan[] = {"Jaipur","Jaiselmer"};

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            phoneNumber = String.valueOf(faker.number().randomNumber(10, true)),
            day = dayCheck(),
            month = faker.options().option(monthArray),
            year = String.valueOf(faker.number().numberBetween(1996, 2005)),
            subject = getRandomCapital(),
            hobby = faker.options().option(hobbies),
            picture = "photo_5440751325626355282_x.jpg",
            address = faker.address().streetAddress(),
            state = faker.options().option(states),
            city = cityArrayGenerate(state, citiesNCR, citiesUttar, citiesHaryana, citiesRajasthan);
}
