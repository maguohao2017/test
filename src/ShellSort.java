package mgh.排序算法.希尔排序;

/**
 * 希尔排序
 * @author maguohao
 * @category 2018-8-28
 * 希尔排序平均效率是O(nlogn) 算法复杂度小于 O(n^2) 
 */
public class ShellSort {

	private int[] numbers;
	 
    public ShellSort(int[] numbers) {
        this.numbers = numbers;
    }

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 4, 3, 6, 2, 7, 1, 5, 8 };
		System.out.print("排序前: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
        System.out.println();
        ShellSort ss = new ShellSort(numbers);
        ss.sort(numbers);

	}
	
	/**
     * 希尔排序
     *
     * @param num
     */
    public static void sort(int[] num) {
        int temp;
        //默认步长为数组长度除以2
        int step = num.length;
        while (true) {
            step = step / 2;
            //确定分组数
            for (int i = 0; i < step; i++) {
                //对分组数据进行直接插入排序
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
        
        System.out.print("排序后: ");
        for(int x = 0; x < num.length; x++) {
            System.out.print(num[x] + "  ");
        }
    }


}
