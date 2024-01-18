package com.example.Add.image.to.Pdf.CreateImage;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;


public class CreatePdf {
    public static void main(String[] args) {

       try {
           String path = "D:\\Ajay\\Adding Image to Pdf\\insertPdf\\sample.pdf";
           PdfWriter pdfWriter = new PdfWriter(path);

           PdfDocument pdfDocument = new PdfDocument(pdfWriter);
           pdfDocument.addNewPage();

           Document document = new Document(pdfDocument);
           document.close();
       }catch (Exception e ){
           e.printStackTrace();
       }

        System.out.println("Hello");
    }
}
