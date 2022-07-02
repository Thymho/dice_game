import java.util.*;

public class Challenger6 {
	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		System.out.println("------------------주사위 게임-----------------");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임 종료");
		
		int num = 0;
		
		while(true) {
			try {
				num = sc.nextInt();
				break;
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("숫자로 입력해주세요.");
				System.out.println("1. 게임시작");
				System.out.println("2. 게임 종료");
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
		 					System.out.println("플레이어의 차례입니다.");
			 				System.out.print("주사위를 던져주세요. (yes(Yes), no(No)): ");
			 				answer = sc.next();
			 				
		 					if(answer.equals("yes") || answer.equals("Yes")) {
			 					System.out.println("플레이어의 주사위 수는 "+p1_dice+"입니다.");
			 					System.out.println("컴퓨터의 주사위 수는"+com_dice+"입니다.");
			 					
			 					if(p1_dice > com_dice) {
			 						System.out.println("플레이어가 이겼습니다.");
			 					} else if(com_dice > p1_dice){
			 						System.out.println("컴퓨터가 이겼습니다.");
			 					} else {
			 						System.out.println("비겼습니다.");
			 					}
			 					
			 				} else{
			 					System.out.println("플레이어가 주사위를 던지지 않았으므로 컴퓨터가 이겼습니다.");
			 				}
			 				break;
			 				
			 			case 2:
		 					System.out.println("컴퓨터의 차례입니다.");
			 				System.out.println("컴퓨터의 주사위 수는 "+com_dice+"입니다.");
			 				System.out.print("주사위를 던져주세요. (yes(Yes), no(No)): ");
			 				String answer2 = sc.next();
			 				
			 				if(answer2.equals("yes") || answer2.equals("Yes")) {
			 					System.out.println("플레이어의 주사위 수는 "+p1_dice+"입니다.");
			 					
			 					if(p1_dice > com_dice) {
			 						System.out.println("플레이어가 이겼습니다.");
			 					} else if(com_dice > p1_dice){
			 						System.out.println("컴퓨터가 이겼습니다.");
			 					} else {
			 						System.out.println("비겼습니다.");
			 					}
			 					
			 				} else {
			 					System.out.println("플레이어가 주사위를 던지지 않아, 컴퓨터가 이겼습니다.");
			 				}
				 				
			 				break;
			 		}
			 		break;
			 	case 2:
			 		System.out.println("게임을 종료합니다.");
			 		break;
			 }
			 
			 System.out.print("다시하시겠습니까? (1.네, 2.아니오): ");
				while(true){
					try {
						retry = sc.nextInt();
						break;
					} catch(Exception e) {
						e.printStackTrace();
						System.out.println("숫자로 입력해주세요.");
						System.out.print("다시하시겠습니까? (1.네, 2.아니오): ");
						sc = new Scanner(System.in);
					}
				}
		}while(retry == 1);
		 
		if(retry == 2 || num == 2) {
			System.out.println("게임이 종료되었습니다.");
		}
		
		 sc.close();
	}
}