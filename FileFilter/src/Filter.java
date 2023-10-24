import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
*
* @author smadzar
*/

public class Filter {
    public static void main(String[] args) throws Exception {
        
        try {
            QueueUnlimited myQueue = new QueueUnlimited();
            File file = new File("src/files/inputFile.txt");
            FileWriter fileWriter = new FileWriter("src/files/filteredFile.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();

                for(int i = 0; i < line.length(); ++i) {
                    myQueue.enqueue(Character.toString(line.charAt(i)));
                }
                if(myReader.hasNextLine()) {
                    myQueue.enqueue("\n");
                }
            }

            while(!myQueue.isEmpty()) {
                
                char c = myQueue.dequeue().charAt(0);

                if(Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }

                else if(Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                }

                printWriter.write(c);
            }

            myReader.close();
            printWriter.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}
