package stream.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img");
		List<String> txtFiles = new ArrayList<String>();

		// 2-1 파일 목록중 txt 파일을 찾으시오.
		for (String file : list) {
			if (file.contains("txt")) {
				txtFiles.add(file);
			}

		}

		for (String txtFile : txtFiles) {
			System.out.print(txtFile + " ");
		}
		System.out.println();
		System.out.println();
		
		// 2-2 확장자별로 파일의 개수를 구하시오.
		int txtNum = 0;
		int pdfNum = 0;
		int imgNum = 0;

		for (String file : list) {
			if (file.contains("txt")) {
				txtNum++;
			} else if (file.contains("pdf")) {
				pdfNum++;
			} else if (file.contains("img")) {
				imgNum++;
			}
		}
		System.out.println("txt파일의 개수:" + txtNum);
		System.out.println("pdf파일의 개수:" + pdfNum);
		System.out.println("img파일의 개수:" + imgNum);
		System.out.println();
		
		// 2-3 파일의 확장자만 추출하여 출력하세요.
		String txtStr = null;
		String pdfStr = null;
		String imgStr = null;
		
		for (String file : list) {
			if (file.contains("txt")) {
				txtStr = "txt";
			} else if (file.contains("pdf")) {
				pdfStr = "pdf";
			} else if (file.contains("img")) {
				imgStr = "img";
			}
		}
		System.out.print(txtStr + " ");
		System.out.print(pdfStr + " ");
		System.out.print(imgStr + " ");
	}

}
