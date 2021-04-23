package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description dog 的工厂类
 *@Author caolizhi
 *@Date 2021/4/23 11:08
 *@Version 1.0
 **/
public class DogFactory extends CreatureFactory {

	public Dog getDog(String type) {
		if (type.equalsIgnoreCase("blue")) {
			return new BlueDog();
		}
		if (type.equalsIgnoreCase("yellow")) {
			return new YellowDog();
		}
		return null;
	}

	@Override
	Human getHuman(String type) {
		return null;
	}
}
