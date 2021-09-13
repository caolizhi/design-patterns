package top.caolizhi.example.designpatterns.flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 *  享元工厂类
 */

@Setter
@Getter
public abstract class Flyweight {

	// 内部状态
	private String intrinsic;

	// 外部状态
	protected final String extrinsic;

	// 要求享元角色必须接收外部状态
	public Flyweight(String _extrinsic) {
		this.extrinsic = _extrinsic;
	}

	// 定义业务操作
	public abstract void operate();

}
