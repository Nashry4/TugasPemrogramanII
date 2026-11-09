package exam_code_ch7;

public class Word extends Documents{
    public Word(String fileName) {
        super(fileName);
    }

    public void generateDocument() {
        System.out.println("Membuat dokumen Word: " + fileName);
    }
}
