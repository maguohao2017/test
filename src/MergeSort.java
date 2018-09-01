package mgh.�����㷨.�鲢����;

import java.awt.TexturePaint;

/**
 * �鲢���� 
 * @author maguohao
 * @category 2018-8-30
 * �鲢����Merge���ǽ����������������ϣ������ϲ���һ���µ���������Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�
 * Ȼ���ٰ����������кϲ�Ϊ�����������С��鲢�����ǽ����ڹ鲢�����ϵ�һ����Ч�������㷨��
 * ���㷨�ǲ��÷��η���Divide and Conquer����һ���ǳ����͵�Ӧ�á� 
 * ��������������кϲ����õ���ȫ��������У�����ʹÿ��������������ʹ�����жμ�����
 * �������������ϲ���һ���������Ϊ2-·�鲢��
 * �鲢�����㷨�ȶ���������ҪO(n)�Ķ���ռ䣬������ҪO(log(n))�Ķ���ռ䣬ʱ�临�Ӷ�ΪO(nlog(n))���㷨��������Ӧ�ģ�����Ҫ�����ݵ������ȡ��
 * ����ԭ��
 * 1������ռ䣬ʹ���СΪ�����Ѿ���������֮�ͣ��ÿռ�������źϲ��������
 * 2���趨����ָ�룬���λ�÷ֱ�Ϊ�����Ѿ��������е���ʼλ��
 * 3���Ƚ�����ָ����ָ���Ԫ�أ�ѡ�����С��Ԫ�ط��뵽�ϲ��ռ䣬���ƶ�ָ�뵽��һλ��
 * 4���ظ�����3ֱ��ĳһָ��ﵽ����β
 * 5������һ����ʣ�µ�����Ԫ��ֱ�Ӹ��Ƶ��ϲ�����β
 */
public class MergeSort {

	public static void main(String[] args) {
		
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data);
		mergeSort(data);
		System.out.println("���������飺");
		print(data);

	}
	
	public static void mergeSort(int[] data) {
		sort(data,0,data.length-1);
	}
	
	public static void sort(int[] data,int left,int right) {
		
		if(left >= right) {
			return;
		}
		// �ҳ��м�����
		int center = (left + right) / 2;
		// �����������еݹ�
		sort(data,left,center);
		// ���ұ�������еݹ�
		sort(data,center + 1,right);
		// �ϲ�
		merge(data, left, center, right);
		print(data);
	}
	
	/**
	 * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ����
	 * 
	 * @param data
	 *            �������
	 * @param left
	 *            ������ĵ�һ��Ԫ�ص�����
	 * @param center
	 *            ����������һ��Ԫ�ص�������center+1���������һ��Ԫ�ص�����
	 * @param right
	 *            ���������һ��Ԫ�ص�����
	 */
	public static void merge(int[] data,int left,int center,int right) {
		
		// ��ʱ����
		int[] tmpArr = new int[data.length];	 
		// �������һ��Ԫ������
		int mid = center + 1;
		// third ��¼��ʱ���������
		int third = left;
		// �����������һ��Ԫ�ص�����
		int tmp = left;
		
		while (left <= center && mid <= right) {
			// ������������ȡ����С�ķ�����ʱ����
			if(data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			}else {
				tmpArr[third++] = data[mid++];
			}
		}
		
		// ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����
		while(mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while(left <= center) {
			tmpArr[third++] = data[left++];
		}
		
		// ����ʱ�����е����ݿ�����ԭ������
		// ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩
		while(tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
		
	}
	
	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}


}
