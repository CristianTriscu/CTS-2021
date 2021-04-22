package ro.ase.cts.logger;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class LoggerSingletonV2 {
	public static LoggerSingletonV2 instance=null;
	
	static {
		instance=new LoggerSingletonV2();
	}
	
	public LoggerSingletonV2() {
		
	}
	
	public void log(String message) {
		try {
			FileOutputStream fos=new FileOutputStream("test",true);
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
}
