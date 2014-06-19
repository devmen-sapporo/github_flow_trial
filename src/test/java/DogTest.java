import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class DogTest {
	
	private Dog sut;
	
	@Test
	public void testGetName() {
		this.sut = new Dog("Maeda");
		assertThat(sut.getName(), is("Maedaaa"));
	}

}
