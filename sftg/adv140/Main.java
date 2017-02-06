package com.gwh.sftg.adv140;

public class Main {
	public static void main(String[] args) {
		boolean[] deng = new boolean[9];
		int count = 0;
		boolean ashouci = true;
		boolean bshouci = true;
		boolean cshouci = true;
		boolean dshouci = true;
		boolean eshouci = true;
		boolean fshouci = true;
		boolean gshouci = true;
		boolean hshouci = true;
		boolean ishouci = true;
		for (int a = 0; a < 2; a++) {
			if (!ashouci) {
				deng[1] = !deng[1];
				deng[3] = !deng[3];
			}
			ashouci = false;
			for (int b = 0; b < 2; b++) {
				if (!bshouci) {
					deng[0] = !deng[0];
					deng[2] = !deng[2];
					deng[4] = !deng[4];
				}
				bshouci = false;
				for (int c = 0; c < 2; c++) {
					if (!cshouci) {
						deng[1] = !deng[1];
						deng[5] = !deng[5];
					}
					cshouci = false;
					for (int d = 0; d < 2; d++) {
						if (!dshouci) {
							deng[0] = !deng[0];
							deng[4] = !deng[4];
							deng[6] = !deng[6];
						}
						dshouci = false;
						for (int e = 0; e < 2; e++) {
							if (!eshouci) {
								deng[1] = !deng[1];
								deng[3] = !deng[3];
								deng[5] = !deng[5];
								deng[7] = !deng[7];
							}
							eshouci = false;
							for (int f = 0; f < 2; f++) {
								if (!fshouci) {
									deng[2] = !deng[2];
									deng[4] = !deng[4];
									deng[8] = !deng[8];
								}
								fshouci = false;
								for (int g = 0; g < 2; g++) {
									if (!gshouci) {
										deng[3] = !deng[3];
										deng[7] = !deng[7];
									}
									gshouci = false;
									for (int h = 0; h < 2; h++) {
										if (!hshouci) {
											deng[4] = !deng[4];
											deng[6] = !deng[6];
											deng[8] = !deng[8];
										}
										hshouci = false;
										for (int i = 0; i < 2; i++) {
											if (!ishouci) {
												deng[5] = !deng[5];
												deng[7] = !deng[7];
											}
											ishouci = false;
											for (int j = 0; j < 9; j++) {
												if (deng[j] == true)
													count++;
											}
											if (count == 4)
												System.out.println(a + "" + b + "" + c + "" + d + "" + e + "" + f + ""
														+ g + "" + h + "" + i);
											count = 0;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}