import java.io.*;

public class ExportData {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("exdata.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("雨にも負けず\n");
			bw.write("風にも負けず");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("例外が発生しました。" + e);
		}
	}
}
