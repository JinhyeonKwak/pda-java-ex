package day02;

public class Phone {
    private static int idCounter = 0;

    protected int id;
    protected String brandName;
    protected String turnOnSound;

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getTurnOnSound() {
        return turnOnSound;
    }

    int generateId() {
        return ++idCounter;
    }
}