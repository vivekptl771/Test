package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPasteAssignment
{
	
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("../TEST 1/File7.txt");
		FileWriter  fw = new FileWriter("../TEST 1/File9.txt");
		int i;
		while((i=fr.read())!=-1)
			
		{
			fw.write((char)i);
		}
		System.out.println("This file is copied ");
		fw.close();
	}
}
