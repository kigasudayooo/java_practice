import java.io.*;

public class BufferedReaderSample {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(in);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
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
