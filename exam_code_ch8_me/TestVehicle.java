package exam_code_ch8_me;

public class TestVehicle {
    public static void main(String[] args) {
       Car car = new Car("BMW", 2019, "Turbo bensin", 4);
       Airplane airplane = new Airplane("Boeing", 2015, "Turbofan", 2);

       car.operate();
       car.move();
       car.checkEngineCondition();
       
       System.out.println();

       airplane.operate();
       airplane.move();
       airplane.checkEngineCondition();
    }
}
