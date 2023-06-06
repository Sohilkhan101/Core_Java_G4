package Lecture32;

 import java.io.*;
 
public class ByteStreamm {
	  
	public static void main(String[] args) throws IOException {  
		
		//1
//	byte content[] = "Hello , Sky is 1 2 3 Blue".getBytes();  
//	ByteArrayInputStream inputStream = new ByteArrayInputStream(content); 
//	 
//	inputStream.read(content);  
//	  
//	File newFile = new File("/Users/pc/desktop/Output.txt");  
//	try (FileOutputStream outputStream = new FileOutputStream(newFile)) {
//		outputStream.write(content);
//	}
	
	
	    //2
	try{    
	    FileInputStream fin=new FileInputStream("/Users/pc/desktop/Output.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fin.close();    
	  }catch(Exception e){System.out.println(e);}    
	  
	}  
	 
}
