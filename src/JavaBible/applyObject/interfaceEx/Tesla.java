package JavaBible.applyObject.interfaceEx;

public class Tesla implements Car{
    public static final int wheel = 4;
    public String name;
    public String engine;

    void EngineStartByFuel() {

    }

    void EngineStartByElec() {

    }

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.name = "Model3";
        tesla.engine = "elec";
        String start = tesla.EngineStart(tesla.engine);
        System.out.println("start = " + start);
        System.out.println(tesla.name);
    }

    @Override
    public String EngineStart(String engine) {
        return engine;
    }
}
