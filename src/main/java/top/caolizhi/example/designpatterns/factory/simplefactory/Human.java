package top.caolizhi.example.designpatterns.factory.simplefactory;

/**
 *@Description TODO
 *@Author caolizhi
 *@Date 2021/4/23 10:26
 *@Version 1.0
 **/
public class Human implements Animal {

	@Override
	public void move() {
		System.out.println("human walk......");
	}
}
