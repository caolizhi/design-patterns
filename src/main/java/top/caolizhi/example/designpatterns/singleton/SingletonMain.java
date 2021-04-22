package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description main method
 *@Author caolizhi
 *@Date 2021/4/22 13:09
 *@Version 1.0
 **/
public class SingletonMain {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		// 恶汉模式单例
		/*IntStream.range(0, 10).forEach( i -> {
			new Thread(() -> {
				HungrySingleton hungrySingleton = HungrySingleton.getInstance();
				System.out.println(hungrySingleton.hashCode());
			}, "thread " + i).start();
		});*/

		// 懒汉模式线程安全单例
		/*IntStream.range(0, 10).forEach( i -> {
			new Thread(() -> {
				LazySingletonSafe instance = LazySingletonSafe.getInstance();
				System.out.println(instance.hashCode());
			}, "thread " + i).start();
		});*/

		// 懒汉模式线程不安全单例
		/*IntStream.range(0, 10).forEach( i -> {
			new Thread(() -> {
				LazySingletonNotSafe lazySingleton = LazySingletonNotSafe.getInstance();
				System.out.println(lazySingleton.hashCode());
			}, "thread " + i).start();
		});*/

		// DCL 单例
		/*IntStream.range(0, 10).forEach( i -> {
			new Thread(() -> {
				LazySingletonDcl lazySingletonDcl = LazySingletonDcl.getInstance();
				System.out.println(lazySingletonDcl.hashCode());
			}, "thread " + i).start();
		});*/

		long endTime = System.currentTimeMillis();
		System.out.println("total execution time " + (endTime - startTime) + " ms");
	}

}
