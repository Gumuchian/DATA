package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class data {

	public static void main(String[] args) {
		try{
			InputStream file=new FileInputStream("data_science.dat"); 
			InputStreamReader fich=new InputStreamReader(file);
			BufferedReader br=new BufferedReader(fich);
			String data=br.readLine();
			int t[]=new int[(data.length()-4)/184];
			int i;
			for (i=0;i<t.length;i++){
				
			}
			fich.close();
			file.close();
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		try {
			FileWriter fw = new FileWriter ("data.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw); 
				fichierSortie.println (chaine+"\n test de lecture et écriture !!"); 
			fichierSortie.close();
			System.out.println("Le fichier " + fichier + " a été créé!"); 
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

}
