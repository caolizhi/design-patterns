package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description 懒汉模式，线程安全
 *@Author caolizhi
 *@Date 2021/4/22 13:42
 *@Version 1.0
 **/
public class LazySingletonDcl {

	private static volatile LazySingletonDcl instance; // 加 volatile 防止指令重排

	private LazySingletonDcl() {}

	public static LazySingletonDcl getInstance() {
		if (instance == null) {
			synchronized (LazySingletonDcl.class) {
				if (instance == null) {
					instance = new LazySingletonDcl();
				}
			}
		}
		return instance;
	}
}
