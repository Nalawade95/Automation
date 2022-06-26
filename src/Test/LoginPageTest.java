package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
		@Test
		public void test1(){//4
			System.out.println("test1 executed");
		}
		@Test
		public void test2(){//7
			System.out.println("test2 executed");
		}
		@BeforeClass
		public void beforeclass(){//2ete
			System.out.println("Before class is executed");
		}
		@AfterClass
		public void afterclass(){//9
			System.out.println("After class is executed");
		}
		@BeforeMethod
		public void beforemethod(){//3 6
			System.out.println("Before method is executed");
		}
		@AfterMethod
		public void aftermethod(){//5 8
			System.out.println("After method is executed");
		}
		@BeforeTest
		public void beforetest(){//1
			System.out.println("Before test executed");
		}
		@AfterMethod
		public void aftertest(){//10
			System.out.println("After test is executed");

	}
	}

