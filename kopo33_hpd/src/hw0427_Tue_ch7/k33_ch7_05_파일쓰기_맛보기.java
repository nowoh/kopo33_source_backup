package hw0427_Tue_ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class k33_ch7_05_파일쓰기_맛보기 {

	public static void main(String[] args) throws IOException {
		FileWriter k33_fw = new FileWriter("C:\\Users\\howon\\Desktop\\kopo33\\a.txt, true");
		BufferedWriter k33_bw = new BufferedWriter(k33_fw);
		StringBuffer k33_sf = new StringBuffer();
		
		BufferedReader k33_br = new BufferedReader(new InputStreamReader(System.in));
		String k33_str = "";
		while (!(k33_str = k33_br.readLine()).startsWith("s")) {
			k33_sf.append(k33_str + "\n");
		}
		k33_br.close();
		k33_fw.write(k33_sf.toString());
		k33_fw.flush();
		k33_fw.close();
		System.out.println("저장이 완료되었습니다.");
		
	}

}
