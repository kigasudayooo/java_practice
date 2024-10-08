import java.io.File;
import java.io.IOException;

public class TryCatchSample {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// do something
		}
		System.out.println("finish");
	}
}
