package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����!!!");
		System.out.println("------------------------");
		System.out.println("�޴��� ������..");
		System.out.println("------------------------");
		System.out.println("1) ¥���, 2) «��, 3) �쵿");
		System.out.println("------------------------");
		System.out.print("����� ������ ");
		int food = sc.nextInt();
		if(food == 1) {
			System.out.println("¥����� �����ϼ̱���.");
		}else if(food == 2){
			System.out.println("«���� �����ϼ̱���.");
		}else {
			System.out.println("�쵿�� �����ϼ̱���.");
		}
	}

}





