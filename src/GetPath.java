import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetPath {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
        //to reach a file from outside the project
        filePath = Paths.get("/Users/adem.ten/Documents/JAVA/OutThere.txt");
        printFile(filePath);
    }
    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
