import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class CreateFileFolder_FilesAttributes {

    public static void main(String[] args) {
        try {
//            ****   to create file ****
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

 //           ****   to create folder ****
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            ****   to create nested folder ****
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");//For  mac
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");//For Windows
              // ****   to create nested folder2 ****
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
////            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
//            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified =  " + Files.getLastModifiedTime(filePath));


            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size =  " + attrs.size());
            System.out.println("Last modified =  " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());//tells whether the file is a directory
            System.out.println("Is regular file = " + attrs.isRegularFile());




        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
