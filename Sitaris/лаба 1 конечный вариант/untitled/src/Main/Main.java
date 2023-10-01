package Main;

import models.*;

public class Main {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.immovable(19, 9);

        builder = new Foreman();
        builder.immovable(20,5);

        DirectorOfRealEstateSales directorOfPharmacologySales = new DirectorOfRealEstateSales();
        directorOfPharmacologySales.immovable(10,1);

        PropertyOwner propOwner = new CleaningService();
        propOwner.immovable(11,3);
    }
}