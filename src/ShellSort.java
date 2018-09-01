package mgh.�����㷨.ϣ������;

/**
 * ϣ������
 * @author maguohao
 * @category 2018-8-28
 * ϣ������ƽ��Ч����O(nlogn) �㷨���Ӷ�С�� O(n^2) 
 */
public class ShellSort {

	private int[] numbers;
	 
    public ShellSort(int[] numbers) {
        this.numbers = numbers;
    }

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 4, 3, 6, 2, 7, 1, 5, 8 };
		System.out.print("����ǰ: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
        System.out.println();
        ShellSort ss = new ShellSort(numbers);
        ss.sort(numbers);

	}
	
	/**
     * ϣ������
     *
     * @param num
     */
    public static void sort(int[] num) {
        int temp;
        //Ĭ�ϲ���Ϊ���鳤�ȳ���2
        int step = num.length;
        while (true) {
            step = step / 2;
            //ȷ��������
            for (int i = 0; i < step; i++) {
                //�Է������ݽ���ֱ�Ӳ�������
                for ( int j = i + step; j < num.length; j = j + step) {
                    temp=num[j];
                    int k;
                   for( k=j-step;k>=0;k=k-step){
                       if(num[k]>temp){
                           num[k+step]=num[k];
                       }else{
                           break;
                       }
                   }
                   num[k+step]=temp;
                }
            }
            if (step == 1) {
                break;
            }
        }
        
        System.out.print("�����: ");
        for(int x = 0; x < num.length; x++) {
            System.out.print(num[x] + "  ");
        }
    }


}
