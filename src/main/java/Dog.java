
/**
 * 犬のポチ (名前は変えられません) を生成します。
 * そのうち抽象化されるかもしれません。
 * @author Hiroyuki
 *
 */
public class Dog {
	private String name;
	
	public Dog (String name) {
		this.name = name;
	}
	
	public String getName() {
		return Dog.name;
	}
}
