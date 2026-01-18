import java.io.FileWriter;
import java.io.IOException;

public class SaveManager {
    public void save(ISaveable item) {
        String fileName = item.getFileName();
        String data = item.formatForFile();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
