import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContentsFile 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fin =new FileInputStream("E:\\textfile/sample.txt");
			Scanner scan = new Scanner(fin);
			while (scan.hasNextLine()) 
			{
				System.out.println(scan.nextLine());
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello world");
	
	}

}
