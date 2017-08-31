package builder;

public interface Builder {
	
	/**
	 * 创建部件A
	 */
	public void builderPartA();
	
	/**
	 * 创建部件B
	 */
	public void builderPartB();
	
	/**
	 * 创建部件C
	 */
	public void builderPartC();
	
	/**
	 * 返回组装结果
	 */
	public Product getResult();

}
