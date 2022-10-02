package demo.spring.BeanwithjavaCode;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
      
	
	@Value("${teacher.name}")
	 private String name ; 
	 
	 private TeacherDependency dep ;
	 public Teacher() {
		 
	 }
	 public Teacher(TeacherDependency dep) {
		 this.dep = dep ;
	 }
	 public String getName() {
         return this.name ;	
	 }
	 public void testdep() {
         dep.calldep();

	 }
}
