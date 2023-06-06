package com.example.filehandling.file;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class copyfile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("C:\\Users\\ADMIN\\Documents\\firstfile.txt");
FileOutputStream fout1=new FileOutputStream("C:\\\\Users\\\\ADMIN\\\\Documents\\\\firstfile.txt");
FileOutputStream fout2=new FileOutputStream("C:\\Users\\ADMIN\\Documents\\copyfile.txt");
try {
	byte content[] = "Java Programming language".getBytes();
	ByteArrayInputStream bin = new ByteArrayInputStream(content);
	
	bin.read(content);
	ByteArrayOutputStream bout=new ByteArrayOutputStream();
	//byte [] array= {65,78};
	//bout.write(array);
	bout.writeTo(fout1);
	bout.writeTo(fout2);
	
	
		fout1.write(content);
	fout2.write(content);
    bout.flush();
	bout.close();//has no effect
	System.out.println("Byte Success...");
	
}catch(Exception e) {
	System.out.println(e); 	
}
finally {
	fin.close();
	fout1.close();
	fout2.close();
}
System.out.println("File Copied...");
	}
}

