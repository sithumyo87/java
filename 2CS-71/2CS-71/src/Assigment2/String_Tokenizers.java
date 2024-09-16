package Assigment2;

import java.io.*;
import java.util.*;

public class String_Tokenizers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new FileReader("/Users/khantphonenaing/Desktop/Exam/2CS-71/src/Assigment2/textfile.dat")
				);
		
		String letter = br.readLine();
		StringTokenizer st = new StringTokenizer(letter);
		
		while (st.hasMoreTokens()) 
			System.out.println(st.nextToken());
		
		br.close();
	}

}
