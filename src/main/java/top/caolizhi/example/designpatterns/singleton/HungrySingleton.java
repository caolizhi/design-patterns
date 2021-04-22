package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description
 * 		饿汉模式， 线程安全
 * 		优点：没有加锁，执行效率会提高。
 * 		缺点：浪费空间，只要加载类就会 new 出对象
 *@Author caolizhi
 *@Date 2021/4/22 11:03
 *@Version 1.0
 **/
public class HungrySingleton extends Singleton {

	private static HungrySingleton instance = new HungrySingleton();

	/**
	 * @Description 类私有，该类不会被实例化
	 **/
	private HungrySingleton() {}

	public static HungrySingleton getInstance() {
		return instance;
	}
}


