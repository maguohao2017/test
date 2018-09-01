package mgh.�����㷨.ϣ������;

/**
 * ϣ������
 * @author maguohao
 * @category 2018-8-28
 * ϣ������ƽ��Ч����O(nlogn) �㷨���Ӷ�С�� O(n^2) 
 */
public class shellSort2 {

	private int[] numbers;
	 
    public shellSort2(int[] numbers) {
        this.numbers = numbers;
    }
 
    /**
     * ��������鲢��ÿ������ֱ�Ӳ�������, ��ɺ���С�������, �ظ���������, ֱ����С��һ����
     * ��һ�η�����: section = n/2 == 0 ? n/2 : n/2+1, �������: ÿ��n/2��һ����, ��[x]��[x+n/2]Ϊһ��
     */
    public void sort() {
        int section = this.numbers.length / 2;
        int j;
        int temp;
        while(section >= 1) {
            for(int i = section; i < this.numbers.length; i++) {
                temp = this.numbers[i];
                j = i - section;
                while(j >= 0 && this.numbers[j] > temp) {
                    this.numbers[j + section] = this.numbers[j];
                    j = j - section;
                }
                this.numbers[j + section] = temp;
            }
            section /= 2;
        }
        System.out.print("�����: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
    }
 
    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 3, 6, 2, 7, 1, 5, 8 };
        System.out.print("����ǰ: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
        System.out.println();
        shellSort2 ss = new shellSort2(numbers);
        ss.sort();
    }


}
