/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5prak;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class CarData {
    public static ArrayList<Car> carList= new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType,polNum,merk));
    }
    public void listOfCar(){
        System.out.println("-------------------------------");
        System.out.println("    DAFTAR MOBIL");
        System.out.println("-------------------------------");
        for (Car sc : CarData.carList) {
            System.out.println("TIPE MOBIL  : " + sc.getCarType());
            System.out.println("NO.POLIS    : " + sc.getPolNum());
            System.out.println("MERK MOBIL  : " + sc.getMerk());
            System.out.println("-------------------------------");
        }
    }
}
