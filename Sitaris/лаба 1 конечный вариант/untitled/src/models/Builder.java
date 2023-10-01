package models;

import interfaces.Construct;

public class Builder implements Construct {
    public Builder(){
        System.out.println("Это конструктор класса Строителя");
    }


    @Override
    public int immovable(int hours, int rate) {
        System.out.println("Я занимаюсь стройкой " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
