package week1.DesignPatternsAndPrinciples.FactoryMethodPattern;

public class DocumentFactoryExample {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new DocumentFactory() {
            public Document createDocument() {
                return new WordDocument();
            }
        };

        DocumentFactory pdfFactory = new DocumentFactory() {
            public Document createDocument() {
                return new PdfDocument();
            }
        };

        DocumentFactory excelFactory = new DocumentFactory() {
            public Document createDocument() {
                return new ExcelDocument();
            }
        };

        Document word = wordFactory.createDocument();
        word.open();

        Document pdf = pdfFactory.createDocument();
        pdf.open();

        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
