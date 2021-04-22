package top.caolizhi.example.designpatterns.singleton;

/**
 *@Description 防止反序列化
 *@Author caolizhi
 *@Date 2021/4/22 16:10
 *@Version 1.0
 **/
public enum HungryEnumSingleton {
	INSTANCE;
	public void getInstance() {}
}
