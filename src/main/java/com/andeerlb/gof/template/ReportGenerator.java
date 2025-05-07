package com.andeerlb.gof.template;

public abstract class ReportGenerator {

    public final void generateReport() {
        fetchData();
        processData();
        formatReport();
        exportReport();
    }

    protected void fetchData() {
        System.out.println("Fetching data from database...");
    }

    protected abstract void processData();

    protected void formatReport() {
        System.out.println("Formatting report as PDF...");
    }

    protected void exportReport() {
        System.out.println("Exporting report to disk...");
    }
}
