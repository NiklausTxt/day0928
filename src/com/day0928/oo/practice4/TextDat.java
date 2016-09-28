package com.day0928.oo.practice4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TextDat {
	public static void main(String[] args) {
		String fileName = "D:\\practice4\\text.dat";
		String folderPath = "D:\\practice4";
		createFolder(folderPath);
		creatFile(fileName);
		writeTo(fileName);
		readFrom(fileName);
	}

	public static void createFolder(String folderPath) {
		File file = new File(folderPath);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void creatFile(String fileName) {
		File file = new File(fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeTo(String pathname) {
		File file = new File(pathname);
		BufferedWriter bWriter = null;
		try {
			bWriter = new BufferedWriter(new FileWriter(file));
			bWriter.write("hello,everyone.");
			bWriter.newLine();
			bWriter.write("hahahahahahahahhahahhaha");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bWriter != null) {
				try {
					bWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void readFrom(String pathName) {
		RandomAccessFile raf=null;
		try {
			raf = new RandomAccessFile(pathName, "rw");
			raf.seek(0);
			byte[] buff = new byte[1024];
			int hasRead = 0;
			while ((hasRead = raf.read(buff)) > 0) {
				System.out.println(new String(buff, 0, hasRead));
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(raf!=null){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
