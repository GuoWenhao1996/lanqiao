package com.gwh.jclx.basic12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCanKao {
	static void shiliuToEr(String s) {
		StringBuffer sbBuffer = new StringBuffer();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case '0':
				sbBuffer.append("0000");
				break;
			case '1':
				sbBuffer.append("0001");
				break;
			case '2':
				sbBuffer.append("0010");
				break;
			case '3':
				sbBuffer.append("0011");
				break;
			case '4':
				sbBuffer.append("0100");
				break;
			case '5':
				sbBuffer.append("0101");
				break;
			case '6':
				sbBuffer.append("0110");
				break;
			case '7':
				sbBuffer.append("0111");
				break;
			case '8':
				sbBuffer.append("1000");
				break;
			case '9':
				sbBuffer.append("1001");
				break;
			case 'A':
				sbBuffer.append("1010");
				break;
			case 'B':
				sbBuffer.append("1011");
				break;
			case 'C':
				sbBuffer.append("1100");
				break;
			case 'D':
				sbBuffer.append("1101");
				break;
			case 'E':
				sbBuffer.append("1110");
				break;
			case 'F':
				sbBuffer.append("1111");
				break;
			}
		}
		ErToBa(sbBuffer);
	}

	static void ErToBa(StringBuffer sb) {
		int len = sb.length();
		if (len % 3 == 0) {
			if (sb.substring(0, 3).equals("000")) {
				sb.delete(0, 3);
			}
		} else if (len % 3 == 1) {
			if (sb.substring(0, 1).equals("0")) {
				sb.delete(0, 1);
			} else {
				sb.insert(0, "00");
			}
		} else {
			if (sb.subSequence(0, 2).equals("00")) {
				sb.delete(0, 2);
			} else {
				sb.insert(0, "0");
			}
		}
		StringBuffer sBuffer = new StringBuffer();
		String s;
		int n = sb.length() / 3;
		for (int i = 0; i < n; i++) {
			s = sb.substring(i * 3, (i + 1) * 3);
			if (s.equals("000")) {
				sBuffer.append("0");
			}
			if (s.equals("001")) {
				sBuffer.append("1");
			}
			if (s.equals("010")) {
				sBuffer.append("2");
			}
			if (s.equals("011")) {
				sBuffer.append("3");
			}
			if (s.equals("100")) {
				sBuffer.append("4");
			}
			if (s.equals("101")) {
				sBuffer.append("5");
			}
			if (s.equals("110")) {
				sBuffer.append("6");
			}
			if (s.equals("111")) {
				sBuffer.append("7");
			}
		}
		System.out.println(sBuffer.toString());
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bReader.readLine());
		String[] string = new String[n];
		for (int i = 0; i < n; i++) {
			string[i] = bReader.readLine();
		}
		for (int i = 0; i < n; i++) {
			shiliuToEr(string[i]);
		}
	}

}
