package interfaces;

public interface SalesManager extends  Sell, Construct {

    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я занимаюсь подсчетом стоимости квартир " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
