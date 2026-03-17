interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    // Default method added later
    default void exportToJSON() {
        System.out.println("Exporting report as JSON (default).");
    }
}