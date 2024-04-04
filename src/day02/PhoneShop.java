package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneShop {
    private static PhoneShop instance;
    private final List<Phone> phones = new ArrayList<>();

    private PhoneShop() {
    }

    public static PhoneShop getInstance() {
        if (instance == null) {
            instance = new PhoneShop();
        }
        return instance;
    }

    void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    void addPhone(List<Phone> phones) {
        this.phones.addAll(phones);
    }

    List<String> showAllPhones() {
        return phones.stream()
                .map(p -> String.valueOf(p.getBrandName()))
                .collect(Collectors.toList());
    }

    Phone sellPhone(String brandName) {
        Phone phone = phones.stream()
                .filter(p -> p.getBrandName().equals(brandName))
                .findAny().orElse(null);
        phones.removeIf(p -> {
            assert phone != null;
            return p.getId() == phone.getId();
        });
        return phone;
    }
}
