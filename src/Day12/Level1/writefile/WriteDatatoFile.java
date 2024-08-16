package Day12.Level1.writefile;

import java.io.IOException;
import java.nio.file.*;

public class WriteDatatoFile {
    public static void main(String[] args) {
        String filePath="src/Day12/Level1/writefile/file.txt";
        try {
            Path p= Paths.get(filePath);
            String content="Hello and ome to Planet Earth";
            Files.write(p,content.getBytes(), StandardOpenOption.APPEND);
            Files.write(p,System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}