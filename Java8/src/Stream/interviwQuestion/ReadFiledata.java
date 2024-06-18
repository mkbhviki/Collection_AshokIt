package Stream.interviwQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFiledata {
	public static void main(String[] args) throws IOException {
		/*
		 * FileReader fr=new FileReader(new File("info.txt")); BufferedReader br=new
		 * BufferedReader(fr); String line=br.readLine(); while(line !=null){
		 * System.out.println(line); line=br.readLine();
		 * 
		 * } br.close();
		 */
		
		String filename= "info.txt";
		List<String>lines=new ArrayList();
		
		try (Stream<String> stream=Files.lines(Paths.get(filename))){
			
			stream.filter(l->l.startsWith("H"))
			.forEach(line->System.out.println(line));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
