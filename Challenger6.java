import java.util.*;

public class Challenger6 {
	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		System.out.println("------------------�ֻ��� ����-----------------");
		System.out.println("1. ���ӽ���");
		System.out.println("2. ���� ����");
		
		int num = 0;
		
		while(true) {
			try {
				num = sc.nextInt();
				break;
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("���ڷ� �Է����ּ���.");
				System.out.println("1. ���ӽ���");
				System.out.println("2. ���� ����");
				sc = new Scanner(System.in);
			}
		}
		
		int retry = 0;
		String answer = "";
		
		do {
			Random rd = new Random();
			int turn = rd.nextInt(2)+1;
			int p1_dice = rd.nextInt(6)+1;
			int com_dice = rd.nextInt(6)+1;
			
			 switch(num) {
			 	case 1:
			 		switch(turn) {
			 			case 1:
		 					System.out.println("�÷��̾��� �����Դϴ�.");
			 				System.out.print("�ֻ����� �����ּ���. (yes(Yes), no(No)): ");
			 				answer = sc.next();
			 				
		 					if(answer.equals("yes") || answer.equals("Yes")) {
			 					System.out.println("�÷��̾��� �ֻ��� ���� "+p1_dice+"�Դϴ�.");
			 					System.out.println("��ǻ���� �ֻ��� ����"+com_dice+"�Դϴ�.");
			 					
			 					if(p1_dice > com_dice) {
			 						System.out.println("�÷��̾ �̰���ϴ�.");
			 					} else if(com_dice > p1_dice){
			 						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			 					} else {
			 						System.out.println("�����ϴ�.");
			 					}
			 					
			 				} else{
			 					System.out.println("�÷��̾ �ֻ����� ������ �ʾ����Ƿ� ��ǻ�Ͱ� �̰���ϴ�.");
			 				}
			 				break;
			 				
			 			case 2:
		 					System.out.println("��ǻ���� �����Դϴ�.");
			 				System.out.println("��ǻ���� �ֻ��� ���� "+com_dice+"�Դϴ�.");
			 				System.out.print("�ֻ����� �����ּ���. (yes(Yes), no(No)): ");
			 				String answer2 = sc.next();
			 				
			 				if(answer2.equals("yes") || answer2.equals("Yes")) {
			 					System.out.println("�÷��̾��� �ֻ��� ���� "+p1_dice+"�Դϴ�.");
			 					
			 					if(p1_dice > com_dice) {
			 						System.out.println("�÷��̾ �̰���ϴ�.");
			 					} else if(com_dice > p1_dice){
			 						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			 					} else {
			 						System.out.println("�����ϴ�.");
			 					}
			 					
			 				} else {
			 					System.out.println("�÷��̾ �ֻ����� ������ �ʾ�, ��ǻ�Ͱ� �̰���ϴ�.");
			 				}
				 				
			 				break;
			 		}
			 		break;
			 	case 2:
			 		System.out.println("������ �����մϴ�.");
			 		break;
			 }
			 
			 System.out.print("�ٽ��Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�): ");
				while(true){
					try {
						retry = sc.nextInt();
						break;
					} catch(Exception e) {
						e.printStackTrace();
						System.out.println("���ڷ� �Է����ּ���.");
						System.out.print("�ٽ��Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�): ");
						sc = new Scanner(System.in);
					}
				}
		}while(retry == 1);
		 
		if(retry == 2 || num == 2) {
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		
		 sc.close();
	}
}