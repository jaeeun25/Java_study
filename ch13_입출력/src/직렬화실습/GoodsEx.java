package 직렬화실습;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GoodsEx {
	public static void main(String[] srgs) {
		GoodsRegistrationController grc = new GoodsRegistrationController("C:\\LJE\\File\\GoodsEx.txt");
		
		while(true) {
			System.out.println("----------------제품 관리 프로그램----------------");
			System.out.println("1.제품등록|2.전체조회|3.선택조회|4.수정|5.삭제|6.종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("메뉴를 선택하세요>> ");
			int menu = grc.scanner.nextInt();
			
			switch(menu) {
				case 1:				// 등록
					grc.insert();
					break;
					
				case 2:				// 전체 조회
					grc.selectAll();
					break;
					
				case 3:				// 특정 제품 조회
					System.out.println("조회할 제품 이름을 입력해주세요> ");
					grc.select(grc.scanner.next());
					break;
					
				case 4:				// 수정
					System.out.println("수정할 제품 이름과 가격을 입력해주세요> ");							
					boolean updateResult = grc.update(grc.scanner.next(), grc.scanner.nextInt());
					
					if(updateResult) System.out.println("제품을 수정했습니다.");
					else System.out.println("해당 제품이 없습니다.");
					break;
					
				case 5:				// 삭제
					System.out.println("삭제할 제품 이름을 입력해주세요> ");
					boolean deleteResult = grc.delete(grc.scanner.next());
					
					if(deleteResult) System.out.println("제품을 삭제했습니다.");
					else System.out.println("해당 제품이 없습니다.");
					break;
					
				case 6:				// 종료
					try {			// 제품 목록파일로 내보내기
						FileOutputStream fos = new FileOutputStream(grc.url, false);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						
						oos.writeObject(grc.goodsStorage);
						
						oos.close();
						fos.close();
						System.out.println("제품 목록 저장을 완료했습니다.");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("제품 목록 저장 중 오류가 발생했습니다.");
					}
					System.out.println("제품 관리 프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
	}
}
