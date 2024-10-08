import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchSample {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("test");
		} catch (FileNotFoundException e) {
			// do something
		} catch (IOException e) {
			// do something
		}
	}
}
