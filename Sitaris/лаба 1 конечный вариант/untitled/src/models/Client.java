package models;

import interfaces.Construct;

public class Client implements Construct {
    Client(){
        System.out.println("Это конструктор класса Заказчика");
    }


    @Override
    public int immovable(int hours, int rate) {
        System.out.println("Я помогаю людям " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
