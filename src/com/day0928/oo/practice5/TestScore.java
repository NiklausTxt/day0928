package com.day0928.oo.practice5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestScore {

	public static void main(String[] args) throws IOException {
		
		System.out.println("请输入学生个数:");
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		Student[] students = new Student[len];
		
		System.out.println("请输入学生信息：");
		
		for(int i=0;i<len;i++){
			String name = scanner.next();
			int score1 = scanner.nextInt();
			int score2 = scanner.nextInt();
			int score3 = scanner.nextInt();
			students[i]=new Student(name, score1, score2, score3);
		}
		scanner.close();
		
		Set<Student> set = new TreeSet<>();
		for(int i =0 ;i<students.length;i++){
			set.add(students[i]);
		}
		
		String fileName = "D:\\practice5\\student.txt";
		String folderPath = "D:\\practice5";
		File file = new File(folderPath);
		file.mkdirs();
		File file2 = new File(fileName);
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter bWriter = null;
		bWriter = new BufferedWriter(new FileWriter(file2));
		
		for(Student s :set){
				String str = s.toString();
				bWriter.append(str);
				bWriter.newLine();
			
			System.out.println(s.toString());
		}
		
		if(bWriter!=null){
			try {
				bWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
