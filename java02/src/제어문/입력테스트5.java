package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ5 {
//	���� �ð��� 10
//	10�� ���̸� �¸��
//	14�� ���̸� �¿����ʹ�
//	20�� ���̸� ���̺��
//	�ƴϸ� �³���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� ");
		int time = sc.nextInt();
		
		if(time <= 10) {
			System.out.println("�¸��");
		}else if(time <= 14) {
			System.out.println("�¿����ʹ�");
		}else if(time <= 20) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
	}

}





