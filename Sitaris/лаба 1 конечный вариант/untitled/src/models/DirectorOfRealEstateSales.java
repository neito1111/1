package models;

import interfaces.Realtor;
import interfaces.SalesManager;

public class DirectorOfRealEstateSales extends InsuranceAgent implements SalesManager, Realtor {
    public DirectorOfRealEstateSales(){
        System.out.println("Это конструктор класса Директор по продажам недвижимости");
    }


    @Override
    public int immovable(int hours, int rate) {
        System.out.println("Я директор,и я балдею");
        return SalesManager.super.immovable(hours, rate);
    }
}
