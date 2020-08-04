/**
 * 
 */
package com.jin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.fasterxml.jackson.core.io.DataOutputAsStream;

/**
 * @author njh
 *
 */
public class DataInputOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:\\Temp/primitive.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("남진현");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("초천재");
		dos.writeDouble(90.5);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Temp/primitive.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			Double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name+": "+score+" : "+order);
		}
		dis.close();
	}

}
