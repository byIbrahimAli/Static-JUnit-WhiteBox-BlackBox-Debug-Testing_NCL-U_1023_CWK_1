package testing;

//DO NOT CHANGE THESE IMPORTS
import project1.Module;
import project1.ModuleRecord;
import project1.ModuleResult;
import project1.Qualification;
import project1.Student;

// This is a driver class if you wish to use one. It contains a sample
// student. You do NOT need to review the code in this class and you CAN
// modify it to add your own test data if you wish.
public class Test {

	public static void main(String[] args) {

		// =============== DEFAULT ===============
		// new student object
		/*Student chris = new Student("Chris", "1");

		// test for student object
		System.out.println("Name value of student object should be 'Chris': " + chris.getName());*/

		// =============== STUDENT.JAVA TESTING ===============					/*Steps relating to table*/
				//Student Constructor
		/*Student s0 = new Student ("Ibrahim Ali", 123456789);*/				/*1.*/
		Student s1 = new Student ("Ibrahim Ali", "123456789");					/*2.*/
				//addModule method
		/*s1.addModule(m);*/
		Module m0 = new Module ("MD0", "Module 0", 30, 26, 3, 6);				/*1.*/
		s1.addModule(m0);														/*2.*/
				//removeModule method
		/*s1.removeModule(m);*/													/*1.*/
		s1.removeModule(m0);													/*2.*/
				//checkModuleSelection method
		s1.checkModuleSelection();												/*1., 2.*/

		Student s2 = new Student ("Graham Harley", "133356789");				/*3.*/

		Module m1 = new Module ("MD1", "Module 1", 27, 86, 98, 7);
		Module m2 = new Module ("MD2", "Module 2", 60, 86, 98, 7);
		Module m3 = new Module ("MD3", "Module 3", 107, 56, 98, 7);
		Module m4 = new Module ("MD4", "Module 4", 27, 6, 20, 7);
		Module m5 = new Module ("MD5", "Module 5", 123, 106, 98, 7);
		Module m6 = new Module ("MD6", "Module 6", 148, 150, 149, 7);
		Module m7 = new Module ("MD7", "Module 7", 5, 9, 8, 7);
		Module m8 = new Module ("MD8", "Module 8", 63, 49, 72, 7);
		Module m9 = new Module ("MD9", "Module 9", 69, 93, 86, 7);
		Module m10 = new Module ("MD10", "Module 10", 86, 86, 98, 7);
		Module m11 = new Module ("MD11", "Module 11", 90, 66, 98, 7);
		Module m12 = new Module ("MD12", "Module 12", 67, 96, 88, 7);
		Module m13 = new Module ("MD13", "Module 13", 77, 88, 99, 7);

		s2.addModule(m1);
		s2.addModule(m2);
		s2.addModule(m3);
		s2.addModule(m4);
		s2.addModule(m5);
		s2.addModule(m6);
		s2.addModule(m7);
		s2.addModule(m8);
		s2.addModule(m9);
		s2.addModule(m10);
		s2.addModule(m11);
		s2.addModule(m12);
		s2.addModule(m13);

		s2.checkModuleSelection();
				//recordMark method												/*1.*/
		s1.addModule(m0);
		s1.recordMark(m0, 86);
				//getAverage method												/*1.*/
		s2.recordMark(m1, 100);
		s2.recordMark(m2, 90);
		s2.recordMark(m3, 80);
		s2.recordMark(m4, 70);
		s2.recordMark(m5, 60);
		s2.recordMark(m6, 50);
		s2.recordMark(m7, 55);
		s2.recordMark(m8, 40);
		s2.recordMark(m9, 30);
		s2.recordMark(m10, 25);
		s2.recordMark(m11, 20);
		s2.recordMark(m12, 10);
		s2.recordMark(m13, 1);
		System.out.println(s2.getAverage());
				//getQualification method										/*1.*/
		System.out.println(s2.getQualification());


		// =============== MODULE.JAVA TESTING ===============					/*Steps relating to table*/
				//Module Constructor
		Module m14 = new Module ("MD14", "Module 14", 77, 88, 99, 7);			/*1.*/


		// =============== MODULERECORD.JAVA TESTING ===============					/*Steps relating to table*/
				//ModuleRecord Constructor [1]
		ModuleRecord mr1 = new ModuleRecord(m0, 80);
				//ModuleRecord Constructor [2]
		ModuleRecord mr2 = new ModuleRecord(m1);

	}

}
