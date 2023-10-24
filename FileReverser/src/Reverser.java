/**
*
* @author smadzar
*/

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Reverser {
    public static void main(String[] args) throws Exception {
        
        try {
            StackUnlimited myStack = new StackUnlimited();
            File file = new File("src/files/inputFile.txt");
            FileWriter fileWriter = new FileWriter("src/files/reversedFile.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();

                for(int i = 0; i < line.length(); ++i) {
                    myStack.push(Character.toString(line.charAt(i)));
                }
                if(myReader.hasNextLine()) {
                    myStack.push("\n");
                }
            }

            while(!myStack.isEmpty()) {
                printWriter.print(myStack.pop());
            }

            myReader.close();
            printWriter.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
