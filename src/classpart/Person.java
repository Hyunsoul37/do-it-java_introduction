package classpart;

public class Person {
	String name;		// 이름
	float height;			// 키
	float weight;		// 몸무게
	char gender;		// 성별
	boolean married;	// 결혼 여부
	
	public Person() { }

	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
