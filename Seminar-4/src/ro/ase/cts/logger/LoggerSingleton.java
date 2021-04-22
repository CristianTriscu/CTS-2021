package ro.ase.cts.logger;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class LoggerSingleton {

	private static LoggerSingleton instance=null;
	private String fileName;
	private LoggerSingleton(){
		fileName="Log.txt";
		
	}
	
	private LoggerSingleton(String fileName) {
		this.fileName=fileName;
	}
	
	public void log(String message) {
		try {
			FileOutputStream fos=new FileOutputStream(fileName,true);
			OutputStreamWriter writer=new OutputStreamWriter(fos);
			
			BufferedWriter bufferedWriter=new BufferedWriter(writer);
			
			bufferedWriter.write(String.valueOf(new Date()+" "));
			bufferedWriter.write(message);
			bufferedWriter.write(System.lineSeparator());
			
			bufferedWriter.close();
			writer.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized LoggerSingleton getInstance() {
		if(instance==null) {
			instance=new LoggerSingleton();
		}
		return instance;
	}
	
	public static synchronized LoggerSingleton getInstance(String fileName) {
		if(instance==null) {
			instance=new LoggerSingleton(fileName);
		}else {
			System.out.println("Default logger already created!");
		}
		return instance;
	}
	
}
	
