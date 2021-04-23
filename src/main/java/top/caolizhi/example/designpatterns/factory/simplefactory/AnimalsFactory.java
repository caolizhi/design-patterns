package top.caolizhi.example.designpatterns.factory.simplefactory;

/**
 *@Description TODO
 *@Author caolizhi
 *@Date 2021/4/23 10:28
 *@Version 1.0
 **/
public class AnimalsFactory {

	public Animal getAnimal(String type) {
		if (type.equalsIgnoreCase("human")) {
			return new Human();
		}
		if (type.equalsIgnoreCase("fish")) {
			return new Fish();
		}
		return null;
	}

}
