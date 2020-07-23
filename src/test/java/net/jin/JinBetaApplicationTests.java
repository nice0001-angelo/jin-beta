package net.jin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.jin.utils.Calculator;

@SpringBootTest
class JinBetaApplicationTests {

	@Test
	public void plus() throws Exception{
		//given
		Calculator calculator = new Calculator();
		
		//when
		int result = calculator.plus(2,5); 
		
		//then
		assertThat(result, is(7));
	}

}
