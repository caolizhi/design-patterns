package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description human 的工厂类
 *@Author caolizhi
 *@Date 2021/4/23 11:08
 *@Version 1.0
 **/
public class HumanFactory extends CreatureFactory {

	@Override
	Human getHuman(String type) {
		if (type.equalsIgnoreCase("Asian")) {
			return new AsianHuman();
		}
		if (type.equalsIgnoreCase("Africa")) {
			return new AfricaHuman();
		}
		return null;
	}

	@Override
	Dog getDog(String type) {
		return null;
	}
}
