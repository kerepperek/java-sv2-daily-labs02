package day04;

public class Car {

    int amountOfFuel;
    int km;

    public double calculateConsumption(){
        return (((double)amountOfFuel)/km)*100;
    }

    public int getAmountOfFuel(){
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }
}
