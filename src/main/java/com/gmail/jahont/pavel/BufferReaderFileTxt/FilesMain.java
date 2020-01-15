package com.gmail.jahont.pavel.BufferReaderFileTxt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class FilesMain {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        try {
            String path = "src/main/java/BufferReaderFileTxt/myfile.txt";
            FileReader file = new FileReader(path);
            BufferedReader fileReader = new BufferedReader(file);
            String thisLine = null;
            while ((thisLine = fileReader.readLine()) != null) {
                logger.info(thisLine);
            }
        } catch (FileNotFoundException e) {
            logger.info("File not found!!!");
        }
 /*       try {
            String fileLine = fileReader.readLine();
            logger.info(fileLine);
        }catch (IOException err){
            logger.info(err.getMessage());
        }   */
        //---------------------------Short try-catch handling-----------------------------------------------
/*        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/Files/myfile.txt"))) {
            String temp;
            while ((temp = fileReader.readLine()) != null) {
                arrayList.add(temp);
            }
        }
        int a = arrayList.size();
        for (int i=0; i<a; i++) {
            logger.info(arrayList.get(i));
        }*/
        //---------------------------Working with XML--------------------------------------------------------
/*        DocumentBuilderFactory myXML = DocumentBuilderFactory.newInstance();
        myXML.setValidating(false);
        DocumentBuilder builder = myXML.newDocumentBuilder();
        Document doc = builder.parse(new File("src/Files/myfile.xml"));

        try {
            Node parentNode = (Node) doc.getFirstChild();
            Node person = (Node) parentNode.getFirstChild();
            logger.info(parentNode.getTextContent());
        } catch (ClassCastException err) {
            logger.info(err.getMessage());
        }*/
    }
}