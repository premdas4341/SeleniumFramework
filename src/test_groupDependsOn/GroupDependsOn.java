package test_groupDependsOn;

import org.testng.annotations.Test;

public class GroupDependsOn {
	
	@Test	(groups= {"TalentTEK"})
	public void test1() {
		
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
	
	System.out.println("test3");
}
	
	
	@Test
	public void test4() {
	
	System.out.println("test4");
}
	
	@Test
	public void loginn() {
	
	System.out.println("Login");
}
	
	@Test
	public void changepass() {
	
	System.out.println("changepass");
}

}
