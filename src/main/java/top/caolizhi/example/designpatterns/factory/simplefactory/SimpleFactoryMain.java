package top.caolizhi.example.designpatterns.factory.simplefactory;

/**
 *@Description 工厂模式 main
 *@Author caolizhi
 *@Date 2021/4/23 8:30
 *@Version 1.0
 **/
public class SimpleFactoryMain {
	public static void main(String[] args) {
		AnimalsFactory animalsFactory = new AnimalsFactory();
		Animal human = animalsFactory.getAnimal("human");
		human.move();
	}
}
