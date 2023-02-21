package JavaBible.interfaceEx;

public class Tesla implements Car{
    public String engine;
    public int wheel;
    public String name;

    void EngineStartByFuel() {

    }

    void EngineStartByElec() {

    }

    @Override
    public String EngineStart(String engine) {
        return engine;
    }

    public Tesla(String name, String engine, int wheel) {
        this.name = name;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
