import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Start {

    public static void main(String[] args) {

        String fileName = "src//file.txt";
        File file = new File(fileName);
        LocalDateTime time = LocalDateTime.now();

        if (file.exists()) {
            System.out.println("You are overwriting the file");
        } else {
            System.out.println("You are creating a new file");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(String.valueOf(time));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}