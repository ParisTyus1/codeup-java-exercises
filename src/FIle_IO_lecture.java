import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FIle_IO_lecture {
    public static void main(String[] args) {
newFile();
readwriteFile();
    }

    static void newFile(){
        String directory = "data";//relative file path//
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toString());
        Path dataFile = Paths.get(directory,filename);

        try{
            if (Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
                System.out.println("Created directory");

            }if (!Files.exists(dataFile)){
                Files.createFile(dataFile);
                System.out.println("Created file ");

            }
        }catch (IOException ioe){//whenever an input or output operation is failed or interpreted//
            ioe.printStackTrace();
        }
    }
//    static void readFile(){
//        Path poem
//    }



    static void readwriteFile(){
        List<String>fruit = new ArrayList<>();
        fruit.add("Mango");fruit.add("Orange");fruit.add("Peach");fruit.add("Pineapple");
        try {
            Path groceries = Paths.get("data","groceries.txt");
            fruit = Files.readAllLines(groceries);
            for (String fr:fruit){
                System.out.println(fr);
            }
            }catch (IOException ioe){
            ioe.printStackTrace();
        }


        fruit.add("kiwi");fruit.add("starfruit");
        try{
            Path groceries = Paths.get("data","groceries.txt");
            Files.write(groceries,fruit);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

