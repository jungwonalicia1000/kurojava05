package ���;

import java.util.Date;

public class �Է��׽�Ʈ9 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("28�ϱ��� �Դϴ�.");
			break;
		case 4:	case 6:	case 9:	case 11:
			System.out.println("30�ϱ��� �Դϴ�.");
			break;
		default:
			System.out.println("31�ϱ��� �Դϴ�.");
		}
	}
}
