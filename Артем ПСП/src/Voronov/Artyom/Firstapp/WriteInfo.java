package Voronov.Artyom.Firstapp;

public class WriteInfo {
    private String name;
    private int amount;
    private boolean DownloadStatus;
    public WriteInfo(String a, int b, boolean c){
        this.name=a;
        this.amount=b;
        this.DownloadStatus=c;
    }
    public WriteInfo(){

    }
    public void Print(){
        System.out.println(name);
        System.out.println(amount);
        if(DownloadStatus){
            System.out.println("Можно скачать");
        }
        else{
            System.out.println("Нельзя скачать");
        }
    }
}
