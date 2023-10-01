import khachatrian.secondapp.Manager;
public class Main {
    public static void main(String[] args) {

        Manager[] managers = new Manager[3];
        managers[0]=new Manager("Khachatrian",20,true);
        managers[1]=new Manager("Voronov",16,true);
        managers[2]=new Manager("Ermakov",18,true);

        for (Manager manager : managers) {
            manager.getAllInfo();
            System.out.println();
        }

        System.out.println("Средний возраст управляющих: " + Manager.averageAge(managers));
        System.out.println("Количество управляющих, справляющихся с обязанностями: " + Manager.qualityTrue(managers));

    }
}