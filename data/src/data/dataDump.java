package data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dataDump {

	public static void main(String[] args){
		try{
			Path path=Paths.get("rawBackup-2016.09.08.153115.dat");
			byte[] data=Files.readAllBytes(path);
			short t[]=new short[(data.length)/4];
			FileWriter fw = new FileWriter ("dataDump.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			int i;
			PrintWriter fichierSortie = new PrintWriter (bw);
			for (i=0;i<(data.length)/4;i++){
				t[i]=(short) ((data[i*4+2])+(data[i*4+2+1]<<8));
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

