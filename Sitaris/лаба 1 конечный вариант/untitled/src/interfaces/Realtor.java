package interfaces;

public interface Realtor extends Sell, DiscussionOfDetails, PropertyCare {
    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я подбираю квартиры " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
