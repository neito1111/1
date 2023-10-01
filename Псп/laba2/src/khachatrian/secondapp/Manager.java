package khachatrian.secondapp;

public class Manager {
    private String surname;
    private int age;
    private boolean quality;
    public Manager(){

    }
    public Manager(String name,int age,boolean quality){
        this.surname=name;
        this.age=age;
        this.quality=quality;
    }
    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getQuality() {
        return (this.quality);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setQuality(boolean quality) {
        this.quality = quality;
    }

    public void getAllInfo() {
        System.out.println("Фамилия->" + getSurname());
        System.out.println("Возраст->" + getAge());
        System.out.println("справляется ли с обязанностями->" + getQuality());
    }
    public static double averageAge(Manager []manager){
        if(manager.length==0){
            System.out.println("null");
            return 0.0;
        }
        int totalAge=0;
        for( Manager managers:manager){
            totalAge+=managers.getAge();

        }
       return (double) totalAge/manager.length;
    }
    public static int qualityTrue(Manager []manager){
        if(manager.length==0){
            System.out.println("null");
            return 0;
        }
        int count=0;
        for( Manager managers:manager){
            if (managers.getQuality()){
                count ++;
            }
        }
        return count;
    }

}
