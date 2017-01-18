package com.gwh.jclx.basic13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		QuickSort(array, 0, n - 1);
		for (int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

	private static void QuickSort(int[] array, int left, int right) {
		if (left < right) { // 只要元素个数大于1，就划分
			int pivotpos = Partition(array, left, right); // 划分
			QuickSort(array, left, pivotpos - 1); // 递归左侧
			QuickSort(array, pivotpos + 1, right); // 递归右侧
		}
	}

	private static int Partition(int[] Vector, int low, int high) {
		int pivotpos = low; // 对准最前端
		int pivot = Vector[low]; // 对基准元素赋值
		for (int i = low + 1; i <= high; i++) { // 检测整个序列，进行划分
			if (Vector[i] < pivot) { // 小于基准元素的放在左边
				pivotpos++;
				if (pivotpos != i) {
					int temp = Vector[pivotpos];
					Vector[pivotpos] = Vector[i];
					Vector[i] = temp;
				}
			}
		}
		Vector[low] = Vector[pivotpos]; // 当前元素与基准元素交换位置
		Vector[pivotpos] = pivot; // 就位
		return pivotpos; // 返回基准元素位置
	}
}