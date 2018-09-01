package mgh.排序算法.约瑟夫环.数组办法;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 约瑟夫环 队列
 * @author maguohao
 * @category 2018-8-29
 * 
 */
public class yuesefuLinkedList {

private int personNumber;
	
	private int number;
	
	public yuesefuLinkedList(int personNumber,int number) {
		this.personNumber = personNumber;
		this.number = number;
	}
	
	public static void main(String[] args) {
		
		int personNumber = 100;
		int number = 10;
		yuesefuLinkedList ss = new yuesefuLinkedList(personNumber,number);
		ss.countQueue(personNumber,number);

	}
	
	/**
	 * 队列解决约瑟夫环问题
	 * @param personNumber 人数
	 * @param number          数的数
	 */
	public static void countQueue(int personNumber,int number){
	    //1.把人放到队列中
	    Queue<Integer> persons =  new LinkedList<Integer>();
	    for (int i = 0; i < personNumber; i++) {
	        persons.add(i+1);
	    }

	    //2.算法
	    int counts = 0;//计数器
	    while (!persons.isEmpty()) {
	        //1.出队列
	        Integer person = persons.poll();
	        //2.计数器++
	        counts++;
	        //3.判断
	        if (counts % number == 0) {
	            //是,打印
	            System.out.println("出局: "+person);
	        } else {
	            //不是,继续入队列
	            persons.add(person);
	        }

	    }
	}

}
