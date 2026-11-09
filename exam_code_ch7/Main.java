package exam_code_ch7;

public class Main {
    public static void main(String[] args) {
        Documents word = new Word("PraktikumSaya.docx");
        Documents excel = new Excel("Dataset.xls");
        Documents pdf = new Pdf("LaporanPraktikum.pdf");
        Documents ppt = new PowerPoint("InheritanceAndComposition.ppt");

        word.generateDocument();
        excel.generateDocument();
        pdf.generateDocument();
        ppt.generateDocument();
    }
}
