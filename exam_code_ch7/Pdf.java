package exam_code_ch7;

public class Pdf extends Documents {
    public Pdf(String filename) {
        super(filename);
    }

    public void generateDocument() {
        System.out.println("Membuat dokumen PDF: " + fileName);
    }  
}