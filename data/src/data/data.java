package data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class data {

	public static void main(String[] args) {
		try{
			InputStream file=new FileInputStream("data_science"); 
			InputStreamReader fich=new InputStreamReader(file);
			BufferedReader br=new BufferedReader(fich);
			String ligne=br.readLine();
			while (ligne!=null){
			}
			fich.close();
			file.close();
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

}
