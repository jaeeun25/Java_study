package step3_생성자;

class Book{
	String title;
	String author;
	
	// 메소드
	void show() {
		System.out.println(title + ":" + author);
	}
	
	Book(){
		this("");
		System.out.println("생성자를 호출하였습니다.");
	}
	
	Book(String title){
		this(title, "작자미상");		
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}

public class C3_BookEx {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생떼쥐페리");
		System.out.println(littlePrince.title);
		System.out.println(littlePrince.author);
		System.out.println("****************");
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title);
		System.out.println(loveStory.author);
		System.out.println("****************");
		
		Book emptyBook = new Book();
		System.out.println(emptyBook.title);
		System.out.println(emptyBook.author);
		System.out.println("****************");
		
		loveStory.show();
	}
}