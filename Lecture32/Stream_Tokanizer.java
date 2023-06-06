package Lecture32;

import java.io.*;

public class Stream_Tokanizer {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		FileReader reader = new FileReader("/Users/pc/desktop/Output.txt");
		BufferedReader bufferread = new BufferedReader(reader);
		StreamTokenizer token = new StreamTokenizer(bufferread);
		int t;
		while ((t = token.nextToken()) != StreamTokenizer.TT_EOL) {
			switch (t) {
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Number : " + (int) token.nval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Word : " + token.sval);
				break;
			}
		}
	}
}
