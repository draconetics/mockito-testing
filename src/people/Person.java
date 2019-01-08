package people;

public class Person {

	private int dni;
	private String name;
	private int age;
	private int salary;
	
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * @return the name
	 */
	public String getname() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setname(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getage() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setage(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public int getsalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setsalary(int salary) {
		this.salary = salary;
	}

	public boolean isGreaterThan18() {
		if (this.age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isHighSalary() {
		if (this.salary >= 5000) {
			return true;
		} else {
			return false;
		}
	}

}
