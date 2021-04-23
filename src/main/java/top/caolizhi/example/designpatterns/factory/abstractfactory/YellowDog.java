package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description dog 的实现
 *@Author caolizhi
 *@Date 2021/4/23 10:59
 *@Version 1.0
 **/
public class YellowDog implements Dog {
	@Override
	public String color() {
		return "yellow skin";
	}

	@Override
	public String hair() {
		return "yellow hair";
	}
}
