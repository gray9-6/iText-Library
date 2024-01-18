package com.example.Add.image.to.Pdf.CreateImage;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

public class AddImageToPdf {
    public static void main(String[] args) {

        try {
            String path = "D:\\Ajay\\Adding Image to Pdf\\insertPdf\\sample.pdf";

            // create the paragraph
            String paraText = "You can create an empty PDF Document by instantiating the Document class. " +
                    "While instantiating this class, you need to pass a PdfDocument object as a parameter, " +
                    "to its constructor. To add image to the PDF, create an object of the image that is required" +
                    " to be added and add it using the add() method of the Document class.";
            // create the paragraph object
            Paragraph paragraph = new Paragraph(paraText);
            PdfWriter pdfWriter = new PdfWriter(path);

            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.addNewPage();

            // add image
            String imagePath = "images\\ajay.png";
            ImageData imageData = ImageDataFactory.create(imagePath);   //create the byte array of that image
            Image image = new Image(imageData);
            image.setAutoScale(true);

            Document document = new Document(pdfDocument);
            document.add(paragraph); // add paragraph to the document
            document.add(image); // add image to the document
            document.close();

        }catch (Exception e ){
            e.printStackTrace();
        }

        System.out.println("Hello");

    }
}
