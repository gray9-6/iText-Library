package com.example.Add.image.to.Pdf.CreateImage;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;


public class CreatePdf {
    public static void main(String[] args) {

       try {
           // location at which you want to create a pdf
           String path = "D:\\Ajay\\Adding Image to Pdf\\insertPdf\\sample.pdf";  // when the pdf will create the pdf have name sample.pdf
           PdfWriter pdfWriter = new PdfWriter(path);  //  Creating a PdfWriter object

           PdfDocument pdfDocument = new PdfDocument(pdfWriter);     //Creating a PdfDocument object
           pdfDocument.addNewPage();

           Document document = new Document(pdfDocument);  //  Creating the Document object
           document.close();
       }catch (Exception e ){
           e.printStackTrace();
       }

        System.out.println("Hello");

    }
}
