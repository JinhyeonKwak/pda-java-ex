package day02;

public class ApplePhone extends Phone {
    public ApplePhone() {
        this.id = this.generateId();
        this.brandName = "Apple";
        this.turnOnSound = "apple~~~~~~~!!!";
    }
}
