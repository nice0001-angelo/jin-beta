package net.jin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.jin.utils.Calculator;

@SpringBootTest
public class JinBetaApplicationTests {
	private Calculator calculator;
	
	public JinBetaApplicationTests() {
		//given
		this.calculator = new Calculator();
	}
	
	@Test
	public void plus() throws Exception{
		//when
		int result = calculator.plus(2,5,7,10); 
		
		//then
		assertThat(result, is(24));
	}

}
