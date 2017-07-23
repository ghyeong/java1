package exam04;

public class Modifier {
	
	public int pubNum;//어디서든 접근 가능
	private int priNum;//외부에서는 절대 사용X
	int defNum;//다른 폴더에서는 접근X
	protected int proNum;//같은 패키지 안에 있으면 or 상속을 받으면 사용O
	
}
