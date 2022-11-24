package JavaBible.applyObject.part1;

class Car {
    boolean Engine;
    int Gear;
    int Speed;


    void Engine() {
        Engine = !Engine;
    }

    void GearUp() {
        Gear++;
    }

    void GearDown() {
        Gear--;
    }

    void SetSpeed(int I) {
        Speed = I;
    }
}
