package day04;

public class GasStation {

    int price;

    public GasStation(int price){
        this.price=price;
    }

    public int tankCar(Car car, int liter){
        car.setAmountOfFuel(liter);
        return liter*price;
    }
}
