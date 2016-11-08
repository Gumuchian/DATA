package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class data {

	public static void main(String[] args){
		try{
			Path path=Paths.get("data_science.dat");
			byte[] data=Files.readAllBytes(path);
			int t[]=new int[(data.length-4)/184];
			FileWriter fw = new FileWriter ("data.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			int i;
			PrintWriter fichierSortie = new PrintWriter (bw);
			for (i=0;i<t.length;i++){
				t[i]=(int) ((data[i*184+8]<<8 & 0xFF)+(data[i*184+8+1]) & 0xFF);
				fichierSortie.println(t[i]);
			}
			fichierSortie.close();
			fw.close();
			bw.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
		}


	}

}
