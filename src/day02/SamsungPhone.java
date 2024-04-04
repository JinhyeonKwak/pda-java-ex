package day02;

public class SamsungPhone extends Phone {
    public SamsungPhone() {
        this.id = this.generateId();
        this.brandName = "Samsung";
        this.turnOnSound = "samsung~~~~~~~!!!";
    }
}
