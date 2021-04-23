package top.caolizhi.example.designpatterns.factory.simplefactory;

/**
 *@Description TODO
 *@Author caolizhi
 *@Date 2021/4/23 10:27
 *@Version 1.0
 **/
public class Fish implements Animal {
	@Override
	public void move() {
		System.out.println("fish swimming .....");
	}
}
