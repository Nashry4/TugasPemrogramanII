package exam_code_ch7;

public class Excel extends Documents {
    public Excel(String fileName) {
        super(fileName);
    }

    public void generateDocument() {
        System.out.println("Membuat dokumen Excel: " + fileName);
    }
}
