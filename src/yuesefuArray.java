package mgh.排序算法.约瑟夫环.队列办法;


/**
 * 约瑟夫环 数组
 * @author maguohao
 * @category 2018-8-29
 * 
 */
public class yuesefuArray {

	private int personNumber;
	
	private int number;
	
	public yuesefuArray(int personNumber,int number) {
		this.personNumber = personNumber;
		this.number = number;
	}
	
	public static void main(String[] args) {
		
		int personNumber = 100;
		int number = 10;
		yuesefuArray ss = new yuesefuArray(personNumber,number);
		ss.count(personNumber,number);
		
	}
	
	/**
	 * 数组解决约瑟夫环问题
	 * @param personNumber 人数
	 * @param number       数的数
	 */
	public static void count(int personNumber,int number){
	    //1.把人放到数组中,数据结构
	    int[] persons = new int[personNumber];
	    for (int i = 0; i < personNumber; i++) {
	        persons[i] = i+1;
	    }

	    //2.算法
	    int index = 0;//从0开始
	    int dunNumbers = 0;//记录蹲下人数的数
	    int duns = 0;//记录蹲下人的个数

	    while (duns !=personNumber ) {
	        //有人没有蹲下

	        //1.判读当前位置是否是蹲下
	        if (persons[index%persons.length] == 0) {
	            //蹲下,继续数数
	            dunNumbers++;
	            index++;
	        }else {
	            //2.没有蹲下,判读数的数是否是number的数
	            if ((index + 1 -dunNumbers)%number == 0) {
	                //是
	                //打印该位置
	                System.out.println("出局:  "+persons[index%persons.length]);
	                //用0标识蹲下
	                persons[index%persons.length] = 0;
	                //蹲下的人数++
	                duns++;
	                //继续数数
	                index++;
	            }else {
	                //否
	                //继续数数
	                index++;
	            }

	        }

	    }
	}

}
