import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * purpose: The ReadFile class is responsible for reading in
 * a file of address entries.
 * @author Bandana Kaur
 *
 */
public class ReadFile {
	
	/**
	 * Get path of file to read.
	 */
	private String path;
	
	
	/**
	 * Constructor to create a ReadFile object.
	 * @param file_path	The file path that is sent to the 
	 * constructor by the user.
	 */
	public ReadFile(String file_path) {
		path = file_path;
	}
	
	
	/**
	 * The OpenFile method is responsible for reading
	 * in lines from the file.
	 * @return	An array of all the data from the file.
	 * @throws IOException	An Exception to handle an error that is
	 * occurred while reading in a file.
	 */
	public String[] OpenFile() throws IOException {
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = getLines();
		
		String [] textData = new String[numberOfLines];
		
		for (int i=0; i<numberOfLines; i++) {
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
	
	/**
	 * The getLines method is responsible for
	 * getting the number of lines in the file. It is also
	 * used to initialize the array.
	 * @return	An int value of the total number of lines
	 * in the file.
	 * @throws IOException	An exception to be handled if
	 * an error occurs while dealing with the file and its contents.
	 */
	int getLines() throws IOException {
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String line;
		int numberOfLines = 0;
		
		while ((line = bf.readLine()) != null) {
			numberOfLines++;
		}
		
		bf.close();
		
		return numberOfLines;
	}

}