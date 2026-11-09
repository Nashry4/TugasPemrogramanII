package exam_code_ch8_me;

public class Airplane extends Vehicle implements Moveable {

    private int numberOfEngine;

    public Airplane(String brand, int productionYear, String engineType, int numberOFEngine) {
        super(brand, productionYear, engineType);
        this.numberOfEngine = numberOFEngine;
    }

    @Override 
    public void operate() {
        engine.startEngine();
        System.out.println(brand + " Siap terbang dengan " + numberOfEngine + " mesin");
    }

    @Override 
    public void move() {
        System.out.println(brand + " Terbang mengudara weswoshhhh!!");
    }
}