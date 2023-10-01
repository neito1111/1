package Voronov.Artyom.Firstapp;

public class Music {
    private String name;
    private int amount;
    private boolean isDownload;
    public void download(){
        System.out.println("Песня ("+name+") была успешно загружена");
    }
    public Music(){
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setAmount(int Amount){
        this.amount=Amount;
    }
    public void setIsDownload(boolean IsDownload){
        this.isDownload=IsDownload;
    }
    public String getName(){
        return name;
    }
    public int getAmount(){
        return amount;
    }
    public boolean getIsDownload(){
        return isDownload;
    }
    public void Print(){
        System.out.println(name);
        System.out.println(amount);
        if(isDownload){
            System.out.println("Можно скачать");
        }
        else{
            System.out.println("Нельзя скачать");
        }
    }
}