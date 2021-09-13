package top.caolizhi.example.designpatterns.flyweight;

public class FlyweightTest {

	public static void main(String[] args) {
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("类型1");
		Flyweight flyweight2 = FlyweightFactory.getFlyweight("类型2");

		flyweight1.operate();
		flyweight2.operate();

	}

}
