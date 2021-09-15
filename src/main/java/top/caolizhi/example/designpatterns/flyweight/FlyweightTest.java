package top.caolizhi.example.designpatterns.flyweight;

public class FlyweightTest {

	public static void main(String[] args) {
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("类型1");
		Flyweight flyweight2 = FlyweightFactory.getFlyweight("类型2");

		flyweight1.operate();
		flyweight2.operate();

		String str1 = "和谐";
		String str2 = "社会";
		String str3 = "和谐社会";
		String str4;
		str4 = str1 + str2;
		System.out.println(str4 == str3);

		System.out.println(str4.intern() == str3);
	}

}
