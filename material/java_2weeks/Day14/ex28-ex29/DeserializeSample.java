import java.io.*;

public class DeserializeSample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("message.ser");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			String message = (String) ois.readObject();
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
