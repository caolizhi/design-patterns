package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description
 * 	懒汉模式， 线程不安全
 *@Author caolizhi
 *@Date 2021/4/22 11:03
 *@Version 1.0
 **/
public class LazySingletonNotSafe extends Singleton {

	private static LazySingletonNotSafe instance;

	private LazySingletonNotSafe() {};

	public static LazySingletonNotSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonNotSafe();
		}
		return instance;
	}

}


