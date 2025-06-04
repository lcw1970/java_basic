package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Car car = new K3Car();
        driver.setCar(car);
        driver.drive();

        car = new Model3Car();
        driver.setCar(car);
        driver.drive();
    }
}
