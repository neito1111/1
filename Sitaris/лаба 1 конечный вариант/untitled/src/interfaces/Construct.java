package interfaces;

public interface Construct extends Immovable {
    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я строю " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}