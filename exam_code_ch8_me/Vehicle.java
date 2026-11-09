package exam_code_ch8_me;

abstract class Vehicle {
    
    protected  String brand;
    protected  int productionYear;
    protected  Engine engine;

    public Vehicle(String brand, int productionYear, String type) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.engine = new Engine(type);
    }

    public abstract void operate();
    
    public int calculateAge() {
        return 2026 - productionYear;
    }

    public void checkEngineCondition() {
        if (engine.isRunning()) {
            System.out.println("Mesin dalam keadaan hidup");
        } else {
            System.out.println("Mesin dalam keadaan mati");
        }
    }
}