package de.davidschlueter.FileInterpreter;

import java.io.File;
import java.io.FileReader;

public class FileInterpreter {
    private File file = null;
    public FileInterpreter(File file) {
        this.file = file;
    }

    public void readFile() {
        System.out.println("Reading file: " + this.file.getName());
        // read line by line
        try {
            FileReader fileReader = new FileReader(this.file);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }


    }
}
