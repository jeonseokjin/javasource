package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private User users[] = new User[2];
	private Product[] product= new Product[5];
	private Product[] carts= new Product[10];
	
	private Scanner sc= new Scanner(System.in);
	
	//계정 선택에서 선택한 사용자 정보 담기
	private int selUser;
	
	
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 객체를 이용해서 2개 생성
		//User 생성 후 배열에 담기
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//핸드폰 3개 생성, 스마트 TV 2개 생성
		//배열에 담기
		product[0] = new CellPhone("노트4", 10000, "SKT" );
		product[1] = new CellPhone("아이폰12", 200000, "KT");
		product[2] = new CellPhone("아이폰11", 100000, "LG");
		product[3] = new SmartTV("삼성울트라HD", 2500000, "4k");
		product[4] = new SmartTV("LG스마트", 3000000, "1080p");
		
	}

	@Override
	public void start() {
		System.out.println(title+" : 메인 화면 - 계정 선택");
		System.out.println("=========================");
		
		int i=0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
//		for(int i=0; i<users.length; i++) {
//			System.out.println("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());;
//		}
		System.out.println("[x] 종료");
		System.out.println("선택 : ");
		String input=sc.nextLine();
	
		//input : 0,1,x
		//switch
		switch (input){
			case "0" : case "1":
				System.out.println("### "+input+" 선택 ###");
				
				selUser = Integer.parseInt(input);
				productList();
				break;
			case "x" : case "X":
			System.out.println("프로그램 종료합니다.");
			break;
			default : 
				System.out.println("입력값을 확인해 주세요");
				start();
				break;
		}
		//System.out.println("###"+input+" 선택 ###");
		//0,1 => 위 출력문 보여주고, productList() 호출
	
		//다른게 입력되면 => 입력값을 확인해 주세요
		//				계정선택 화면 보여주기
		System.out.println("### "+input+" 선택 ###");
	}
		
		
	public void productList() {
			System.out.println(title+" : 상품 목록 - 상품 선택");
			System.out.println("=========================");
			
			int i=0;
			for(Product p:product) {
				System.out.printf("[%d]", i++);
				p.printDetail();
			}
			System.out.println("[h] 메인 화면");
			System.out.println("[c] 체크 아웃");
			System.out.println("선택 : ");
			String input = sc.nextLine();
			
			switch (input) {
			case "0" : case "1" : case "2" : case "3" : case "4" :// 0~4 장바구니 담고 다시 한번 목록 화면 보여주기
				for(int j=0; j<carts.length; j++) {
					if(carts[j]==null) {
						carts[j]=product[Integer.parseInt(input)];
						break;
					}
				}
				productList();
				break;
			case "h" : case "H" :
				start();// start() 호출
				break;
			case "c" : case "C" :
				checkout();// checkOut() 호출
				break;
			default :
				System.out.println("메뉴를 확인해 주세요");
				productList();// productList() 호출 
				break;
			}
		
	}
	
	public void checkout() {
		System.out.println(title+" : 체크아웃");
		System.out.println("=========================");
		
		int i=0;
		int sum=0;
		for(Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s(%d)\n" , i++,p.getName(),p.getPrice());
				sum+=p.getPrice();
			}
		
	}
		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("합계 : "+sum+" 원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String input = sc.nextLine();
		
		switch(input) {
		case "p" : case "P" :
			productList();
			break;
		case "q" : case "Q" :
			System.out.println("결제가 완료되었습니다. 감사합니다.");
			break;
		default :
			checkout();
			break;
		}
		
		
		//input : p,q
		//p : 이전화면 productList()
		//q : 결제가 완료되었습니다 감사합니다. (출력문)
		
		
	}

	}


