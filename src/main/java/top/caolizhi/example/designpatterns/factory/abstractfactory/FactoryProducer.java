package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description 工厂生产类，根据类型返回相应的工厂类
 *@Author caolizhi
 *@Date 2021/4/23 11:13
 *@Version 1.0
 **/
public class FactoryProducer {

	CreatureFactory getFactory(String type) {
		if (type.equalsIgnoreCase("human")) {
			return new HumanFactory();
		}
		if (type.equalsIgnoreCase("dog")) {
			return new DogFactory();
		}
		return null;
	}

}
