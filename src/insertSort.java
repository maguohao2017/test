package mgh.�����㷨.��������;

/**
 * ֱ�Ӳ�������
 * @author maguohao
 * @category 2018-8-27
 * �����µ�ʱ�临�Ӷȶ���O(n^2)���������¶���O(n)���ռ临�Ӷ���O(1)
 */
public class insertSort {
	
	public static void main(String[] args) {
		
		int[] arr = { 6, 5, 3, 1, 8, 7, 2, 4 };//��������
		
		System.out.println("����ǰ:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		// ֱ�Ӳ�������
		insertSort(arr);
		
		System.out.println();
		System.out.println("�����:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}
	
	/**
	 * ֱ�Ӳ�������
	 */
	private static void insertSort(int[] arr) {
		
		int j; // �������б��±�
		int t; // ������Ԫ��
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < arr[i-1]) {
				
				t = arr[i];// ��ֵ��������Ԫ��
				
//				for(j = i -1;j >= 0 && arr[j] > t;j--) {
//					arr[j + 1] = arr[j];// �Ӻ���ǰ�����������б�����ʹ�����Ԫ�رȽϣ����������Ԫ�ؽϴ���������
//				}
				
				//whileѭ����forѭ���������
				j = i - 1;
				while(j >= 0 && arr[j] > t) {
					
					arr[j + 1] = arr[j];// �Ӻ���ǰ�����������б�����ʹ�����Ԫ�رȽϣ����������Ԫ�ؽϴ���������
					j--;
				}
				
				arr[j + 1] = t;// ��������Ԫ�ز��뵽��ȷ��λ��
			}
			
			print(arr,i);
		}
		
	}
	
	private static void print(int[] arr,int no) {
		System.out.println();
		System.out.println("�����е�" + no + "��:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
