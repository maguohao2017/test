package mgh.排序算法.希尔排序;

/**
 * 希尔排序
 * @author maguohao
 * @category 2018-8-28
 * 希尔排序平均效率是O(nlogn) 算法复杂度小于 O(n^2) 
 */
public class shellSort2 {

	private int[] numbers;
	 
    public shellSort2(int[] numbers) {
        this.numbers = numbers;
    }
 
    /**
     * 对数组分组并对每个组做直接插入排序, 完成后缩小组的数量, 重复插入排序, 直到缩小到一个组
     * 第一次分组数: section = n/2 == 0 ? n/2 : n/2+1, 分组规则: 每隔n/2挑一个数, 即[x]和[x+n/2]为一组
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
        System.out.print("排序后: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
    }
 
    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 3, 6, 2, 7, 1, 5, 8 };
        System.out.print("排序前: ");
        for(int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
        System.out.println();
        shellSort2 ss = new shellSort2(numbers);
        ss.sort();
    }


}
