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
			FileWriter fw = new FileWriter ("data.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw); 
			String data=br.readLine();
			byte datab[]=data.getBytes();
			int t[]=new int[(data.length()-4)/184];
			int i;
			for (i=0;i<t.length;i++){
				t[i]=(int) ((datab[i*184+8]<<8)+datab[i*184+8+1]);
				fichierSortie.println(t[i]);
			}
			System.out.println(data.length());
			fich.close();
			file.close();
			br.close(); 
			fichierSortie.close();
			fw.close();
			bw.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
		
	}

}
