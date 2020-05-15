package ceit.aut.ac.ir.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import ceit.aut.ac.ir.model.Note;

public class FileUtils {

    private static final String NOTES_PATH = "./notes/";

    // It's a static initializer. It's executed when the class is loaded.
    // It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }
    
    public static Note fileReader(File file) {
        try {
        FileInputStream fs = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fs);
        Note n= (Note) in.readObject();
        return n;
        

        } catch (Exception e) {
            e.printStackTrace();
            return new Note("", "", "");
        }
    }

    public static void fileWriter(String content) {
        Note n=new Note("title", "content", "date");
    }

    public String readWithStrem(File file)
    {
        try {
            
            FileInputStream f=new FileInputStream(file);
            String s="";
            int a=-1;
            while((a=f.read())!=-1)
            {
                s+=""+(char)a;
            }
            return s;
            } catch (Exception e) {
                return "";
            }
    }
public void WriteWithStream(String content)
{
    //TODO: write content on file
    String fileName = getProperFileName(content);
    System.out.println(fileName);
    File f=new File("notes\\"+fileName);
    try {
        f.createNewFile();
        FileWriter fs=new FileWriter(f);
        fs.write(content);
        fs.flush();
        fs.close();
        
    } catch (Exception e) {
       System.out.println("Failed");
    }
}

    //TODO: Phase2: proper methods for handling serialization

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file.txt";
    }
}
