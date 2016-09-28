package com.day0928.oo.practice5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOperation {

	public static void createFolder(String folderPath) {
		File file = new File(folderPath);
		file.mkdirs();
	}

	public static boolean createFile(String fileName) {
		File file = new File(fileName);
		boolean isSuccess = false;
		try {
			isSuccess = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static void listAndDeleteFiles(String folderPath) {
		File file = new File(folderPath);
		for (String fileName : file.list()) {
			// File newFile = new File(folderPath+"\\"+fileName);
			// newFile.delete();
			System.out.println(fileName);
		}
	}
	
	public static void copyFile(String file1, String file2){
		File readForm = new File(file1);
		File writeTo = new File(file2);
		BufferedReader bReader = null;
		BufferedWriter bWriter = null;
		try {
			bReader=new BufferedReader(new FileReader(readForm));
			bWriter= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeTo, true)));
			String line = bReader.readLine();
			while(line!=null){
				bWriter.write(line);
				bWriter.newLine();
				System.out.println(line);
				line = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bWriter!=null){
				try {
					bWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bReader!=null) {
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void readFromFile(String fileName){
		File file = new File(fileName);
		BufferedReader bReader = null ;
		try {
			bReader = new BufferedReader(new FileReader(file));
			String line = bReader.readLine();
			while(line!=null){
				System.out.println(line);
				line = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bReader!=null){
				try {
					bReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void writeTofile(String fileName) {
		File file = new File(fileName);
		BufferedWriter bWriter = null;
		try {
			FileWriter fWriter = new FileWriter(file);
			bWriter = new BufferedWriter(fWriter);
			bWriter.write("hello");
			bWriter.newLine();
			bWriter.write("welcome");
			bWriter.newLine();
			bWriter.write("to my world!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bWriter != null) {
					bWriter.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
