package interfaces;

public interface DiscussionOfDetails extends Immovable {
    @Override
    default int immovable(int hours, int rate){
        System.out.println("Я веду обсуждение о деталях " + hours + " часов в день по ставке " + rate );
        return hours * rate;
    }
}
