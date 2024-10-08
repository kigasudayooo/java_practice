import java.io.*;

public class BufferedWriterSample {
	public static void main(String[] args) throws Exception {
		FileWriter out = null;
		try {
			out = new FileWriter("result.txt");
			BufferedWriter bw = new BufferedWriter(out);
			Console console = System.console();
				
			while (true) {
				String line = console.readLine();
				if ("".equals(line)) {
					break;
				}
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
