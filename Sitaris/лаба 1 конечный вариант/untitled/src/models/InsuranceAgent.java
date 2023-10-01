package models;

import interfaces.Sell;

public abstract class InsuranceAgent implements Sell {
    InsuranceAgent(){
        System.out.println("Это конструктор класса Страховго агента");
    }

}
