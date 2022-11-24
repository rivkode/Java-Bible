package JavaBible.applyObject.part1;

public class Transfortation {

    public static void main(String[] args) {
        Car car;

        car = new Car();

        car.Engine();
        car.GearUp();
        car.SetSpeed(10);
        System.out.println(car.Engine);
        System.out.println(car.Gear);
        System.out.println(car.Speed);

        car.Speed = 100;
        System.out.println(car.Speed);
    }
}


