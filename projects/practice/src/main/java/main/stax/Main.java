package main.stax;

import javax.xml.stream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.getProperty;

public class Main {

    public static void main(String[] args) {
        //Read
//        final String fileName = "C:\\BASE\\knowledgeSharing\\testXML.xml";
//        try {
//            XMLStreamReader xmlStreamReader = XMLInputFactory.newFactory().createXMLStreamReader(fileName, new FileInputStream(fileName));
//
//            while (xmlStreamReader.hasNext()) {
//                xmlStreamReader.next();
//                if (xmlStreamReader.isStartElement()) {
//                    System.out.println("Start element: " + xmlStreamReader.getLocalName());
//                } else if (xmlStreamReader.isEndElement()) {
//                    System.out.println("End element: " + xmlStreamReader.getLocalName());
//                } else if (xmlStreamReader.hasText() && xmlStreamReader.getText().trim().length() > 0) {
//                    System.out.println("Value: " + xmlStreamReader.getText());
//                }
//            }
//        } catch (FileNotFoundException | XMLStreamException e) {
//            e.printStackTrace();
//        }
        //Write
        try {
            XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(new FileWriter("result.xml"));
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeCharacters(getProperty("line.separator"));
            xmlStreamWriter.writeCharacters("   ");
            xmlStreamWriter.writeStartElement("BookShop");
            xmlStreamWriter.writeCharacters(getProperty("line.separator"));
            for (int i = 1; i < 5; i++) {
                xmlStreamWriter.writeCharacters("       ");
                xmlStreamWriter.writeStartElement("Book");
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
                xmlStreamWriter.writeCharacters("           ");
                xmlStreamWriter.writeStartElement("Title");
                xmlStreamWriter.writeCharacters("Book - " + i);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
                xmlStreamWriter.writeCharacters("           ");
                xmlStreamWriter.writeStartElement("Author");
                xmlStreamWriter.writeCharacters("Author - " + i);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
                xmlStreamWriter.writeCharacters("           ");
                xmlStreamWriter.writeStartElement("Date");
                xmlStreamWriter.writeCharacters(new SimpleDateFormat("dd:MM:yyyy").format(new Date()));
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
                xmlStreamWriter.writeCharacters("           ");
                xmlStreamWriter.writeStartElement("Price");
                xmlStreamWriter.writeAttribute("currency", "UAH");
                xmlStreamWriter.writeCharacters("" + i * 15);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
                xmlStreamWriter.writeCharacters("       ");
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters(getProperty("line.separator"));
            }
            xmlStreamWriter.writeCharacters("   ");
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeCharacters(getProperty("line.separator"));
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.writeCharacters(getProperty("line.separator"));
            xmlStreamWriter.flush();
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }

}
