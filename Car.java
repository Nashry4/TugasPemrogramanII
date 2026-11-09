package exam_code_ch8_me;

public class Car extends Vehicle implements Moveable {
    
    private int wheel;

    public Car (String brand, int productionYear, String engineType, int wheel) {
        super(brand, productionYear,engineType);
        this.wheel = wheel;
    }

    @Override 
    public void operate() {
        engine.startEngine();
        System.out.println(brand + " Siap dikendarai di jalan raya dengan " + wheel + " roda");
    }

    @Override 
    public void move() {
        System.out.println(brand + " melaju brum brum!!!");
    }

    public void honk() {
        System.out.println("TOD TOD");
    }
}