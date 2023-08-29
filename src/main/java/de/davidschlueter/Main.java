package de.davidschlueter;
import de.davidschlueter.FileInterpreter.FileInterpreter;

import java.io.File;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // get current directory
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDirectory);
        System.out.println(args[0]);
        File file = new File(currentDirectory + "/" + args[0]);
        FileInterpreter fileInterpreter = new FileInterpreter(file);
        fileInterpreter.readFile();
    }

}