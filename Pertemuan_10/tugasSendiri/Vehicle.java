/*
 *  File    : Vehicle.java
 *  NIM     : 24060121140172
 *  Nama    : Fadhail A Bima
 */

public abstract class Vehicle{
    public double calcFuelEfficiency(){
        return 10;
    }

    public double calcTripDistance(){
        return 10;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }

}