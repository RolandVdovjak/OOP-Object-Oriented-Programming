package sk.Vdovjak.OOP.MojaChalupa.System;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import sk.Vdovjak.OOP.MojaChalupa.Subory.*;

public class Info {
    public enum Subor {
        EDOVOLENKY,
        ELOGINUDAJE,
        EREZERVACIE,
    }

    public Info(Subor subor) {
        try {
            File myObj = null;
            switch (subor){
                case EDOVOLENKY:
                    myObj = new File("Dovolenky.txt");
                    break;

                case ELOGINUDAJE:
                    myObj = new File("LoginUdaje.txt");
                    break;

                case EREZERVACIE:
                    myObj = new File("Rezervacie.txt");
                    break;
            }

            if (myObj != null) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private void nacitajudaje(){

    }
}


/*      Chronologia
*   najst si enum
*   public info otvorim subor podla enum
*   class info public nacitajudaje = nacitam do hashmapy
*   nacitavat rozne subory
*
*
*
*
 */