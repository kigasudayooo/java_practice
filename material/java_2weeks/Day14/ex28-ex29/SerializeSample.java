import java.io.*;

public class SerializeSample {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		System.out.print("‰½‚©“ü—Í‚µ‚Ä‚Ý‚Ä‚­‚¾‚³‚¢ > ");
		String message = console.readLine();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("message.ser");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(message);
			out.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
