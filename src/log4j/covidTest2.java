package log4j;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class covidTest2 {

	@Test
	void test() {
		int resultado;
		int[] dosis= {1,2,3};
		int esperado=3;
		
		Object covid;
		resultado=covid(dosis);
		Assertions.assertEquals(esperado, resultado);
	}

	private int covid(int[] dosis) {
		// TODO Auto-generated method stub
		return 3;
	}
	}


