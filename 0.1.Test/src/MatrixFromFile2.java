import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class MatrixFromFile2 {
	
	private static final String FILE_NAME = "x";
	
	private static String[] lines;
	private static String[][] mat;
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
		printMatrix();
	}
 
	private static void readFile() throws IOException {
		String line;
		int i = 0;
		try (
				FileReader fr = new FileReader(FILE_NAME);
				BufferedReader reader = new BufferedReader(fr)
			)
		{
			while ((line = reader.readLine() ) != null)	
				i++;			
		}
		try (
				FileReader fr = new FileReader(FILE_NAME);
				BufferedReader reader = new BufferedReader(fr)
			)
		{
			mat = new String[i][];
			for (int j = 0; j <  i; j++) {
				mat[j] = reader.readLine().split(" ");	//mat[j] это индекс строки!!!
				
			}
		}
	}
 
	private static void printMatrix() {		
		String line;
		for(String[] row: mat) {
			line = " ";
			for(String val: row)
				line += " " + val;
			System.out.println(line.trim());
			
		}
	} 
} 
