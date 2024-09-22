package C4;

public class CarTest {
    public static void main(String[] args) {
        Car Audi = new Car(2014, "Audi", 2014,  250000 );
        System.out.println(Audi.getYearModel());
        Audi.printSpeed(120);

        Car Volvo = new Car(2018, "Volvo", 2018,  28990 );
        System.out.println(Volvo.getYearModel());
        Volvo.printSpeed(170);


        Car Thar = new Car(2018, "Thar", 2018,  28990 );
        System.out.println(Thar.getYearModel());
        Thar.printSpeed(90);

    }
}
