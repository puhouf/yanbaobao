package cn.tedu;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestHashSet {
	
	@Test
	public void test() {
		Set<Integer> s = new HashSet<>();
		boolean flag = s.add(1);
		System.out.println(flag);
		flag = s.add(2);
		System.out.println(flag);
		System.out.println(s);
	}
	
}
