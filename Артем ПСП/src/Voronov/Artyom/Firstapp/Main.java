package Voronov.Artyom.Firstapp;

public class Main {
    public static void main(String[] args){
        Music mm1 = new Music();
        Music mm2 = new Music();
        mm1.setName("Будь Человеком - FRIENDLY THUG 52 NGG");
        mm1.setAmount(10000);
        mm1.setIsDownload(true);

        mm2.setName("Earth Walker 100 - FRIENDLY THUG 52 NGG");
        mm2.setAmount(5000);
        mm2.setIsDownload(false);

        WriteInfo ni1 = new WriteInfo(mm1.getName(),mm1.getAmount(),mm1.getIsDownload());
        ni1.Print();
        WriteInfo ni2 = new WriteInfo(mm2.getName(),mm2.getAmount(),mm2.getIsDownload());
        ni2.Print();
    }
}
