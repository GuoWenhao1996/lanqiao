package com.gwh.sfxl.algo040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] sqqs, sqzz, sqsx, sqcf, cxz, finz;
	static int[][] dgb;
	static int n = 0, fin = 0, max = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		n = Integer.parseInt(s);
		sqqs = new int[n + 1];
		sqzz = new int[n + 1];
		sqcf = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			s = reader.readLine();
			String[] sa = s.split(" ");
			sqqs[i] = Integer.parseInt(sa[0]);
			sqzz[i] = Integer.parseInt(sa[1]);
			if (max < sqzz[i])
				max = sqzz[i];
		}
		sqsx = new int[max + 1];
		for (int i = 1; i <= n; i++) {
			if (sqsx[sqzz[i]] == 0) {
				sqsx[sqzz[i]] = i;
			} else {
				if (sqqs[i] > sqqs[sqsx[sqzz[i]]]) {
					for (int j = 1; j <= n; j++) {
						if (sqcf[j] == 0) {
							sqcf[j] = sqsx[sqzz[i]];
							sqsx[sqzz[i]] = i;
							break;
						}
					}
				}
			}
		}
		dgb = new int[2][n + 1];
		for (int i = 1; i <= max; i++) {
			if (sqsx[i] != 0) {
				getcs(sqsx[i]);
			}
		}
		for (int i = 1; i <= n; i++) {
			if (fin < dgb[0][i])
				fin = dgb[0][i];
		}
		for (int k = max; k >= 1; k--) {
			if (sqsx[k] == 0)
				continue;
			int i = sqsx[k];
			if (dgb[0][i] == fin)
				continue;
			for (int j = sqzz[i] + 1; j <= max; j++) {
				if (j == max) {
					dgb[0][i] = 0;
					dgb[1][i] = 0;
					continue;
				}
				if (sqsx[j] == 0)
					continue;
				if (dgb[0][sqsx[j]] == 0)
					continue;
				if ((dgb[0][sqsx[j]] == dgb[0][i] + 1) & (sqqs[sqsx[j]] > sqzz[i]))
					break;
				if (dgb[0][sqsx[j]] > dgb[0][i] + 1) {
					dgb[0][i] = 0;
					dgb[1][i] = 0;
					break;
				}
			}

		}
		for (int i = 1; i <= n; i++) {
			if (sqcf[i] != 0) {
				getcs1(sqcf[i]);
			} else
				break;
		}

		cxz = new int[fin + 1];
		finz = new int[fin + 1];
		int xh = 1;
		for (int i = 1; i <= n; i++) {
			if (dgb[0][i] == 0)
				continue;
			if (cxz[dgb[0][i]] != 0)
				continue;
			if (fincheck(i) == 1) {
				finz[xh] = i;
				xh++;
				cxz[dgb[0][i]] = i;
				dealsq(i);
			}
		}
		System.out.println(fin);

		for (int i = 1; i <= fin; i++) {
			System.out.print("" + finz[i] + " ");
		}
		System.out.println();
	}

	static void getcs(int a) {
		int cs = 0;
		for (int i = sqqs[a] - 1; i > 0; i--) {
			if (sqsx[i] != 0) {
				cs = dgb[0][sqsx[i]];
				if (cs != 0) {
					break;
				}
			}
		}
		for (int i = sqqs[a]; i < sqzz[a]; i++) {
			if (sqsx[i] != 0) {
				if (dgb[0][sqsx[i]] > cs + 1)
					return;
			}
		}
		dgb[0][a] = cs + 1;
		dgb[1][a] = 1;
	}

	static void getcs1(int a) {
		int cs = 0;
		int b = dgb[0][sqsx[sqzz[a]]];
		if (b == 0)
			return;
		for (int i = sqqs[a] - 1; i > 0; i--) {
			if (sqsx[i] != 0) {
				cs = dgb[0][sqsx[i]];
				if (cs != 0) {
					break;
				}
			}
		}
		if (cs + 1 < b)
			return;
		dgb[0][a] = cs + 1;
		dgb[1][a] = 1;
	}

	static int fincheck(int a) {
		int[] lsst = new int[fin + 1];
		int b = 0, c = 0, sc = 0, ec = 0;
		int cs = dgb[0][a];
		for (int i = cs - 1; i >= 1; i--) {
			if (cxz[i] != 0) {
				b = cxz[i];
				sc = i;
				break;
			}
		}
		if (b != 0) {
			lsst[sc] = sqzz[b];
			for (int i = sqzz[b] + 1; i < sqqs[a]; i++) {
				if (sqsx[i] == 0)
					continue;
				if (dgb[0][sqsx[i]] == 0)
					continue;
				if (lsst[dgb[0][sqsx[i]]] != 0)
					continue;
				if (sqqs[sqsx[i]] <= lsst[dgb[0][sqsx[i]] - 1])
					continue;
				lsst[dgb[0][sqsx[i]]] = sqzz[sqsx[i]];
			}
			if (lsst[cs - 1] == 0)
				return 0;
			if (lsst[cs - 1] >= sqqs[a])
				return 0;
		}
		for (int i = cs + 1; i <= fin; i++) {
			if (cxz[i] != 0) {
				c = cxz[i];
				ec = i;
				break;
			}
		}
		if (c != 0) {
			lsst[ec] = sqqs[c];
			for (int i = sqqs[c] - 1; i > sqzz[a]; i--) {
				if (sqsx[i] == 0)
					continue;
				if (dgb[0][sqsx[i]] == 0)
					continue;
				if (i >= lsst[dgb[0][sqsx[i]] + 1])
					continue;
				lsst[dgb[0][sqsx[i]]] = Math.max(sqqs[sqsx[i]], lsst[dgb[0][sqsx[i]]]);
			}
			if (lsst[cs + 1] == 0)
				return 0;
			if (lsst[cs + 1] <= sqzz[a])
				return 0;
		}
		return 1;
	}

	static void dealsq(int a) {
		int cs = dgb[0][a];
		for (int i = sqzz[a] - 1; i >= 1; i--) {
			if (sqsx[i] == 0)
				continue;
			if (dgb[0][sqsx[i]] == 0)
				continue;
			int dcs = dgb[0][sqsx[i]];
			if (dcs == cs) {
				dgb[0][sqsx[i]] = 0;
				dgb[1][sqsx[i]] = 0;
				continue;
			}
			if (dcs == cs - 1) {
				if (i >= sqqs[a]) {
					dgb[0][sqsx[i]] = 0;
					dgb[1][sqsx[i]] = 0;
					continue;
				}
			}
			if (dcs == cs - 2)
				break;
		}
		for (int i = sqzz[a] + 1; i <= max; i++) {
			if (sqsx[i] == 0)
				continue;
			if (dgb[0][sqsx[i]] == 0)
				continue;
			int dcs = dgb[0][sqsx[i]];
			if (dcs == cs) {
				dgb[0][sqsx[i]] = 0;
				dgb[1][sqsx[i]] = 0;
				continue;
			}
			if (dcs == cs + 1) {
				if (sqzz[a] >= sqqs[sqsx[i]]) {
					dgb[0][sqsx[i]] = 0;
					dgb[1][sqsx[i]] = 0;
					continue;
				}
			}
			if (dcs == cs + 2)
				break;
		}
	}
}
