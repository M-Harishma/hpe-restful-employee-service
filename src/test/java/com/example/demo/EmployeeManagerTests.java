package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class EmployeeManagerTests {

	@Test
	void testEmployeeListIsNotEmpty() {
		EmployeeManager manager = new EmployeeManager();
		assertFalse(manager.getEmployees().getEmployeeList().isEmpty());
	}
	@Test 
	void testInitialEmployeeCount(){
		EmployeeManager manager = new EmployeeManager();
		assertEquals(5, manager.getEmployees().getEmployeeList().size());
	}
	@Test
	void testAddingNewEmployee(){
		EmployeeManager manager = new EmployeeManager();
		int before = manager.getEmployees().getEmployeeList().size();

		Employee newEmp = new Employee(99, "Test", "User", "test@example.com", "Tester");
		manager.getEmployees().getEmployeeList().add(newEmp);

		int after = manager.getEmployees().getEmployeeList().size();
		assertEquals(before + 1, after);
	}

}
