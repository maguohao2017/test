package mgh.排序算法.约瑟夫环;


import java.util.LinkedList;
import java.util.List;

/**
 * 约瑟夫环 
 * @author maguohao
 * @category 2018-8-29
 * 
 */
public class Yuesefu {

	//问题：有100个人围成一个圈，从1开始报数，报到14的这个人就要退出。然后其他人重新开始，从1报数，到14退出。
	//问：最后剩下的是100人中的第几个人？
	public static void main(String[] args) {
		
		/*
         * 先说说我做这题的思路：
         * 1、创建一个含有100个元素的集合，元素从1到100。（分别对应这100个人）
         * 2、从1数到14算一圈，则相当于走了99个圈，每走一圈从集合里删除一个元素。
         * 3、走完这99圈以后，集合里剩下的那个元素就是最后剩下的人
         *
         * 这里最关键的就是求每次从集合里删除的那个元素的下标。
         */
        //创建一个集合all，集合中的元素为1，2，3，……，100，代表所有人
        List<Integer> all = new LinkedList<Integer>();
        for(int i = 1;i <= 100;i++){
            all.add(i);
        }
 
        //下面的代码表示循环99次，每次从集合里删除一个元素，代表退出的那个人的编号
        //i表示退出的那个人在all集合中的下标
        int i = 0;
        //循环99次
        for(int n = 1;n < 100;n++){
            //每次循环时，求得将要退出的人在集合中的下标
            i = (i + 13) % all.size();
            //将集合中代表该人的元素删除
            System.out.println("出局: "+i);	
            all.remove(i);
        }
 
        //循环99次，删除99个人，剩下的最后一个，就是你了
        System.out.println("最后剩下的是第 " + all.get(0) + " 个人");
 
        /*
         * 不难看出，本题最核心的还是求每次循环时需要删除的那个元素的下标。
         */

	}

}
