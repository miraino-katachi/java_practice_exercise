import java.io.*;

public class ImportData {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("exdata.txt");
			BufferedReader br = new BufferedReader(fr);

			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}catch (FileNotFoundException e) {
			System.out.println("ファイルが存在しません。");
		} catch (Exception e) {
			System.out.println("例外が発生しました。" + e);
		}
	}
}

