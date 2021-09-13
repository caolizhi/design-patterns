package top.caolizhi.example.designpatterns.flyweight;

public class ConcreteFlyweight1 extends Flyweight{


	// 接收外部状态
	public ConcreteFlyweight1(String _extrinsic) {
		super(_extrinsic);
	}

	// 根据外部状态进行逻辑处理
	@Override
	public void operate() {
		System.out.println("I'm concrete class 1 !");
	}
}
