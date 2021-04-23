package top.caolizhi.example.designpatterns.factory.abstractfactory;

/**
 *@Description 抽象工厂类，定义不同的对象族的产品
 *@Author caolizhi
 *@Date 2021/4/23 10:39
 *@Version 1.0
 **/
public abstract class CreatureFactory {

	abstract Dog getDog(String type);
	abstract Human getHuman(String type);

}
