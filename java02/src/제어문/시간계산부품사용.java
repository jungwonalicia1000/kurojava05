package ���;

import java.util.Date;

public class �ð�����ǰ��� {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours(); //�ð��� ������.
		System.out.println("���� �ð��� " + hour);
		int m = date.getMinutes();
		//���� : ��Ʈ��+��Ʈ+ȭ��ǥ �Ʒ�
		//�̵� : ��Ʈ+ȭ��ǥ
		System.out.println("���� ���� " + m);
		int s = date.getSeconds();
		System.out.println("���� �ʴ� " + s);
		int y = date.getYear() + 1900;
		System.out.println("���ش� " + y);
		int month = date.getMonth() + 1;
		System.out.println("�̹� ���� " + month);
		
	}

}




