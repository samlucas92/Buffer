import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Buffer implements Runnable {
	private BufferedReader read;
	private File file;
	private String path, scan;
	private StringBuilder sb = new StringBuilder();
	//Set up an array list to store the scanned file so that it can be accessed by the Gui.
	private ArrayList<String> fileContents = new ArrayList<String>();

	//sets the path taken from Gui to the variable path in this class.
	public void setPath(String path){
			this.path = path;
	}
	
	//Check to see if the path is a real file path.
	synchronized public String checkPath(){
		//sets the file path to the path given in the Gui class
		file = new File(path);
		//if the file path is a real file path and the file is a file not a directory.
		if(file.isFile()){

		}else{
			//Return the file not found message that will be shown in the output box.
			return "File not found";
		}
		
		return "";
	}
	
	//This method will get the file and then use a scanner to get the contents then put it in an array list.
	synchronized public ArrayList<String> getFile() throws IOException{
		//sets file path to the path given in the Gui class 
		file = new File(path);
		try {
			//sets up a new BufferedReader that will scan the file
			read = new BufferedReader(new FileReader(path));
			//adds the content found by the BufferedReader to a String
			
			while((scan = read.readLine()) != null){
				//adds the buffered input to a string builder ready to add them to the Array List
				sb.append(scan);
				fileContents.add(sb.toString());
				
			}
			//Adds the string to the array list
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		read.close();
		//returns the array list
		return fileContents;
	}

	@Override
	public void run() {

	}
}
