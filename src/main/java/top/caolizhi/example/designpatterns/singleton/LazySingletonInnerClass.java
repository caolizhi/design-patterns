package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description
 * 	懒汉模式， 线程安全
 * 	利用classloder的机制来保证初始化instance时只有一个线程。JVM在类初始化阶段会获取一个锁，这个锁可以同步多个线程对同一个类的初始化。
 *@Author caolizhi
 *@Date 2021/4/22 11:03
 *@Version 1.0
 **/
public class LazySingletonInnerClass extends Singleton {

	private static class LazySingletonInnerClassHolder {
		private static final LazySingletonInnerClass instance = new LazySingletonInnerClass();
	}

	private LazySingletonInnerClass() {};

	public static LazySingletonInnerClass getInstance() {
		return LazySingletonInnerClassHolder.instance;
	}

}


