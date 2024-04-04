package day02;

public class Person {
    private String name;
    private Phone ownPhone;

    public Person(String name) {
        this.name = name;
    }

    void buyPhone(PhoneShop shop, String brandName) {
        this.ownPhone = shop.sellPhone(brandName);
    }

    void turnOnPhone() {
        System.out.printf("%s님이 폰을 켭니다.\n", this.name);
        System.out.println(this.ownPhone.getTurnOnSound());
    }
}
