package exam_code_ch7;

public class PowerPoint extends Documents {
    public PowerPoint(String fileName) {
        super(fileName);
    }

    public void generateDocument() {
        System.out.println("Membuat dokumen PPT: " + fileName);
    }
}
