package top.caolizhi.example.designpatterns.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	// 池容器
	private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

	public static Flyweight getFlyweight(String extrinsic) {
		Flyweight flyweight = null;

		if (pool.containsKey(extrinsic)) {
			flyweight = pool.get(extrinsic);
		} else if("类型1".equals(extrinsic)) {
			flyweight = new ConcreteFlyweight1(extrinsic);
			pool.put(extrinsic, flyweight);
		} else if ("类型2".equals(extrinsic)) {
			flyweight = new ConcreteFlyweight2(extrinsic);
			pool.put(extrinsic, flyweight);
		}
		return flyweight;
	}

}
