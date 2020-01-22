import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class OperadorAritmetico {
	public OperadorAritmetico() {
		
	}

	public static int suma(int a, int b) {
		return a + b;
		}
	public static int division(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception();
			}  
		return a / b;
		}
	public static int divisionPorCero(int a, int b) throws Exception {
		
	}
}