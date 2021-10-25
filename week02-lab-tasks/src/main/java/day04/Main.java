package day04;

public class Main {

    public static void main(String[] args) {
        Car car=new Car();
        GasStation gasStation=new GasStation(400);
        System.out.println("A tankolás ára? "+gasStation.tankCar(car,30));
        car.setKm(400);
        System.out.println("A fogyasztás:"+car.calculateConsumption());
    }
}
