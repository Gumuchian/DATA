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
			short t1[][]=new short[40][(data.length-4)/184];
			FileWriter fw = new FileWriter ("dataI.txt");
			FileWriter fw1 = new FileWriter ("dataQ.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			BufferedWriter bw1 = new BufferedWriter (fw1);
			int i,j;
			PrintWriter fichierSortie = new PrintWriter (bw);
			PrintWriter fichierSortie1 = new PrintWriter (bw1);
			for (i=0;i<(data.length-4)/184;i++){
				for (j=0;j<40;j++){
					t[j][i]=(short) ((data[i*164+8+j*4]<<8)+(data[i*164+8+1+j*4]));
					t1[j][i]=(short) ((data[i*164+12+j*4]<<8)+(data[i*164+12+1+j*4]));
					if (j!=39){
						fichierSortie.print(t[j][i]+"\t");
						fichierSortie1.print(t1[j][i]+"\t");
					}
					else{
						fichierSortie.println(t[j][i]);
						fichierSortie1.println(t1[j][i]);
					}
				}
			}
			fichierSortie.close();
			fw.close();
			bw.close();
			fichierSortie1.close();
			fw1.close();
			bw1.close();
			System.out.println("OK!");
		}
		catch (Exception e){
			System.out.println(e.toString());
		}


	}

}
