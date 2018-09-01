package mgh.�����㷨.Լɪ��.����취;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Լɪ�� ����
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
	 * ���н��Լɪ������
	 * @param personNumber ����
	 * @param number          ������
	 */
	public static void countQueue(int personNumber,int number){
	    //1.���˷ŵ�������
	    Queue<Integer> persons =  new LinkedList<Integer>();
	    for (int i = 0; i < personNumber; i++) {
	        persons.add(i+1);
	    }

	    //2.�㷨
	    int counts = 0;//������
	    while (!persons.isEmpty()) {
	        //1.������
	        Integer person = persons.poll();
	        //2.������++
	        counts++;
	        //3.�ж�
	        if (counts % number == 0) {
	            //��,��ӡ
	            System.out.println("����: "+person);
	        } else {
	            //����,���������
	            persons.add(person);
	        }

	    }
	}

}
