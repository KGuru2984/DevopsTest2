package TestingPackages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Test1.ClassTest1;

class TestingClass1 {

	@Test
	void test() {
	
		 assertEquals(5, ClassTest1.sum(2, 3));
	}

}
