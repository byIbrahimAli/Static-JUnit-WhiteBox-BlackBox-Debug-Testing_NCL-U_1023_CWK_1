package testing;

//DO NOT CHANGE THESE IMPORTS
import project1.Module;
import project1.ModuleRecord;
import project1.ModuleResult;
import project1.Qualification;
import project1.Student;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

// This is a junit test class if you wish to use one. It contains a sample
// student. You do NOT need to review the code in this class and you CAN
// modify it to add your own test data if you wish.
public class JUnitTest {
	
	Module m = new Module ("CSC 1023", "Software Engineering", 30, 25, 23, 6);
	Module m2 = new Module ("CSC 1023", "Software Engineering", 30, 25, 23, 6);
	Student s = new Student ("Graham H", "123456789");
	ModuleRecord mr = new ModuleRecord(m);
	ModuleRecord mr2 = new ModuleRecord(m2, 10);
	
	// =============== STUDENT.JAVA TESTING ===============
	@Test
	public void GetNameTest (){
		String name = "John Smith";
		Student s = new Student(name, "150789456");
		assertEquals("Test for getName: ", name, s.getName());
	}
			
	// =============== MODULE.JAVA TESTING ===============
	@Test
	public void getCode(){
		assertEquals("Test for getCode", "CSC 1023", m.getCode());
	}
	
	@Test
	public void getTitle(){
		assertEquals("Test for getTitle", "Software Engineering", m.getTitle());
	}
	
	@Test
	public void getSemesterOneCredits(){
		assertEquals("Test for getSemesterOneCredits", 30, m.getSemesterOneCredits());
	}
	
	@Test
	public void getSemesterTwoCredits(){
		assertEquals("Test for getSemesterTwoCredits", 25, m.getSemesterTwoCredits());
	}
	
	@Test
	public void getSemesterThreeCredits(){
		assertEquals("Test for getSemesterThreeCredits", 23, m.getSemesterThreeCredits());
	}
	
	@Test
	public void getTotalCredits(){
		assertEquals("Test for getTotalCredits", 78, m.getTotalCredits());
	}
	
	@Test
	public void getLevel(){
		assertEquals("Test for getLevel", 6, m.getLevel());
	}
	
	// =============== MODULERECORD.JAVA TESTING ===============
	@Test
	public void getModuleMark(){
		assertEquals("Tests getModuleMark", 10, mr2.getModuleMark());
	}
	
	@Test
	public void recordMark(){
		mr.recordMark(100);
		assertEquals("Tests recordMark", 100, mr.getModuleMark());
	}
	
	@Test
	public void getModuleResult1(){
		mr.recordMark(100);
		assertEquals("Test for getModuleResult - Pass", ModuleResult.PASS, mr.getModuleResult());
	}
	
	@Test
	public void getModuleResult2(){
		assertEquals("Test for getModuleResult - Fail", ModuleResult.FAIL, mr2.getModuleResult());
	}
	
	@Test
	public void getModule(){
		assertEquals("Test for getModule", m, mr.getModule());
	}
	
}
