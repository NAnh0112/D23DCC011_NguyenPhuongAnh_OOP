package File;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
public class Doc_DL {
	public static void main(String[] args) {
		File f = new File("C:\\\\Users\\\\PAnh\\\\Java\\\\PA\\\\src\\\\Ke_Thua\\\\file.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
		    String line = null;
		    while (true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
