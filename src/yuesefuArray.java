package mgh.�����㷨.Լɪ��.���а취;


/**
 * Լɪ�� ����
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
	 * ������Լɪ������
	 * @param personNumber ����
	 * @param number       ������
	 */
	public static void count(int personNumber,int number){
	    //1.���˷ŵ�������,���ݽṹ
	    int[] persons = new int[personNumber];
	    for (int i = 0; i < personNumber; i++) {
	        persons[i] = i+1;
	    }

	    //2.�㷨
	    int index = 0;//��0��ʼ
	    int dunNumbers = 0;//��¼������������
	    int duns = 0;//��¼�����˵ĸ���

	    while (duns !=personNumber ) {
	        //����û�ж���

	        //1.�ж���ǰλ���Ƿ��Ƕ���
	        if (persons[index%persons.length] == 0) {
	            //����,��������
	            dunNumbers++;
	            index++;
	        }else {
	            //2.û�ж���,�ж��������Ƿ���number����
	            if ((index + 1 -dunNumbers)%number == 0) {
	                //��
	                //��ӡ��λ��
	                System.out.println("����:  "+persons[index%persons.length]);
	                //��0��ʶ����
	                persons[index%persons.length] = 0;
	                //���µ�����++
	                duns++;
	                //��������
	                index++;
	            }else {
	                //��
	                //��������
	                index++;
	            }

	        }

	    }
	}

}
