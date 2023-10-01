package interfaces;

public interface PropertyCare extends Immovable {

    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я веду уход за недвижимостью " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
