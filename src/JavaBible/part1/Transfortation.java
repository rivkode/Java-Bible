package JavaBible.part1;

public class Transfortation {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();


        car1.Engine();
        car1.Gear = 10;
        car1.SetSpeed(100);


        car2.Engine();
        car2.Gear = 20;
        car2.SetSpeed(200);

        Car.Wheel = 4;
        Car.Window = 6;

        System.out.println("car1 엔진 :" + car1.Engine);
        System.out.println("car1 기어 :" + car1.Gear);
        System.out.println("car1 스피드 :" + car1.Speed);


        System.out.println(Car.Window);

        System.out.println("car2 엔진 :" + car2.Engine);
        System.out.println("car2 기어 :" + car2.Gear);
        car2.Engine();
        System.out.println("car2 엔진 :" + car2.Engine);
        System.out.println("car2 스피드 :" + car2.Speed);

        System.out.println(Car.Wheel);

    }
}


