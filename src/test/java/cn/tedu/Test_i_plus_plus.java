package cn.tedu;

import org.junit.Test;

public class Test_i_plus_plus {

	@Test
	public void test() {
		int i = 1;
		i = i++;
		System.out.println("i = " + i);
		int j = i++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		int k = i + ++i * i++;
		System.out.println("i = " + i);
		System.out.println("k = " + k);
	}

}
