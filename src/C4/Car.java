package C4;

public class Car {
    private int yearModel;
    private String Brand;
    private int priceModel;
    private int numberModel;

    public Car(){

    }

    public Car(int yearModel, String brand, int priceModel, int numberModel) {
        this.yearModel = yearModel;
        Brand = brand;
        this.priceModel = priceModel;
        this.numberModel = numberModel;
    }

    public void printSpeed(int speed){
        System.out.println("Car Speed is " + speed);
    }
    public int getMiles(int miles){
        return miles;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPriceModel() {
        return priceModel;
    }
    public int getNumberModel() {
        return numberModel;
    }

}
