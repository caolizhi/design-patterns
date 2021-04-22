package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description 懒汉模式，线程安全
 *@Author caolizhi
 *@Date 2021/4/22 13:42
 *@Version 1.0
 **/
public class LazySingletonSafe {

	private static LazySingletonSafe instance;

	private LazySingletonSafe() {}

	public static synchronized LazySingletonSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonSafe();
		}
		return instance;
	}
}
