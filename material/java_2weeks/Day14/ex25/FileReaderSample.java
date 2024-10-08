import java.io.*;

public class FileReaderSample {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("test.txt");
			int c = 0;
			while ((c = in.read()) != -1) {
				char ch = (char) c;
				System.out.print(ch);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
