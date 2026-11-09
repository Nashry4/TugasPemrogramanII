package exam_code_ch8_me;

public class Engine {
    
    private String type;
    private boolean isRunning;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void startEngine() { 
        isRunning = true;
        System.out.println("Mesin telah dinyalakan");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println("Mesin telah dimatikan");
    }

    public boolean isRunning() {
        return isRunning;
    }
}