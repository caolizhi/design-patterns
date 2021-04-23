package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description human 的实现
 *@Author caolizhi
 *@Date 2021/4/23 10:51
 *@Version 1.0
 **/
public class AfricaHuman implements Human {
	@Override
	public String height() {
		return "height is 3m";
	}

	@Override
	public String region() {
		return "Africa";
	}
}
