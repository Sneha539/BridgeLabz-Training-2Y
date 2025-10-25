interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting data to CSV");
    }
    public void exportToPDF() {
        System.out.println("Exporting data to PDF");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter r = new ReportExporter();
        r.exportToCSV();
        r.exportToPDF();
        r.exportToJSON();
    }
}
