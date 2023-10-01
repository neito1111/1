package interfaces;

public interface Sell extends Immovable {

    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я продаю " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
