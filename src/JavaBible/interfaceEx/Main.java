package JavaBible.interfaceEx;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Model3", "elec", 4);

        String start = tesla.EngineStart(tesla.engine);
        System.out.println("Start car name  = " + start + tesla.getName());
    }
}
