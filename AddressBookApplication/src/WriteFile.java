import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * purpose: The WriteFile class is responsible for writing 
 * the updated address entries to the new file.
 * @author Bandana Kaur
 *
 */
public class WriteFile {
	/**
	 * Get path of file to write to.
	 */
	private String path;
	
	/**
	 * Boolean value to check whether to overwrite or append to end.
	 */
	private boolean append_to_file = false;
	
	
	/**
	 * Constructor to initialize a WriteFile object.
	 * @param file_path	The file path the user provides of file to which he
	 * wishes to write to.
	 * @param append_value	Boolean value whether to append to the end of file
	 * or overwrite file.
	 */
	public WriteFile(String file_path, boolean append_value) {
		path = file_path;
		append_to_file = append_value;
	}
	
	
	/**
	 * The writeToFile method is responsible for writing to the new file.
	 * @param textLine	String of entries that are to be stored to the new file.
	 * @throws IOException	An Exception to be handled when dealing
	 * with the file and a problem occurs.
	 */
	public void writeToFile(String textLine) throws IOException {
		FileWriter write = new FileWriter(path, append_to_file);
		PrintWriter print_line = new PrintWriter(write);
		
		print_line.printf("%s" + "%n", textLine);
		print_line.close();
	}

}
