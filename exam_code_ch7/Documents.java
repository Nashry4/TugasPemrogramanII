package exam_code_ch7;

abstract class Documents {
    protected String fileName;

    public Documents(String fileName) {
        this.fileName = fileName;
    }

    public abstract void generateDocument();
}