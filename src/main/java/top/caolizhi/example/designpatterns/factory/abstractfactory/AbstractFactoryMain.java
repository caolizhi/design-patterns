package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description 抽象工厂类
 *@Author caolizhi
 *@Date 2021/4/23 11:14
 *@Version 1.0
 **/
public class AbstractFactoryMain {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		CreatureFactory human = factoryProducer.getFactory("human");
		Human africaHuman = human.getHuman("Africa");
		System.out.println(africaHuman.height());
		System.out.println(africaHuman.region());

		CreatureFactory dog = factoryProducer.getFactory("dog");
		Dog blueDog = dog.getDog("blue");
		System.out.println(blueDog.color());
		System.out.println(blueDog.hair());
	}
}
