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
			short t[][]=new short[40][(data.length-4)/184];
			FileWriter fw = new FileWriter ("data.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			int i,j;
			PrintWriter fichierSortie = new PrintWriter (bw);
			for (i=0;i<(data.length-4)/184;i++){
				for (j=0;j<40;j++){
					t[j][i]=(short) ((data[i*164+8+j*4]<<8)+(data[i*164+8+1+j*4]));
					if (j!=39){
						fichierSortie.print(t[j][i]+"\t");
					}
					else{
						fichierSortie.println(t[j][i]);
					}
				}
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
