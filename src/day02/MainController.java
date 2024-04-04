package day02;

import java.util.List;
import java.util.Random;

public class MainController {

    private static final PhoneShop shop = PhoneShop.getInstance();

    // 실행 함수
    public void run(String... args) {
        PhoneShop shop = createShop();

        for (String arg : args) {
            simulateWithPerson(arg);
        }
    }

    //== private methods ==//
    private PhoneShop createShop() {
        List<Phone> phones = List.of(
                new SamsungPhone(),
                new SamsungPhone(),
                new ApplePhone(),
                new ApplePhone()
        );

        shop.addPhone(phones);
        return shop;
    }

    private void simulateWithPerson(String personName) {
        Person person = new Person(personName);
        List<String> allPhones = shop.showAllPhones();

        Random random = new Random();
        String toBuy = allPhones.get(random.nextInt(allPhones.size()));
        person.buyPhone(shop, toBuy);

        person.turnOnPhone();
    }
}
