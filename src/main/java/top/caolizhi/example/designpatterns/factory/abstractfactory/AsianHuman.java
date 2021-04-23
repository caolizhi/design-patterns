package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description human 的实现
 *@Author caolizhi
 *@Date 2021/4/23 10:50
 *@Version 1.0
 **/
public class AsianHuman implements Human {
	@Override
	public String height() {
		return "height is 2m";
	}

	@Override
	public String region() {
		return "Asian";
	}
}
