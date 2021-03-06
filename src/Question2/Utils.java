package Question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    //Usando o static para chamar o método usando Utils.readFile,
    //sem a necessidade de criar um objeto para depois chamar o método
    public static String readFile(String filePath) {
        String data = "";
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            data = "An error occurred.";
            e.printStackTrace();
        }
        return data.trim();
    }
}
