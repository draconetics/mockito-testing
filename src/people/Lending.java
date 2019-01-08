/**
 * 
 */
package people;

/**
 * @author dracon
 *
 */
public class Lending {
	
	private Person person;
	private int capital;
	private Long id;
	private int quantityQuota;
	private int interestRate;
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		if (person.isGreaterThan18()) {
			if (person.isHighSalary()) {
				this.person = person;
			} else {
				throw new IllegalArgumentException("The salary is not over the minimum");
			}
		} else {
			throw new IllegalArgumentException("The person should be at least 18 years");
		}
		this.person = person;
	}
	/**
	 * @return the capital
	 */
	public int getCapital() {
		return capital;
	}
	/**
	 * @param capital the capital to set
	 */
	public void setCapital(int capital) {
		this.capital = capital;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the quantityQuota
	 */
	public int getQuantityQuota() {
		return quantityQuota;
	}
	/**
	 * @param quantityQuota the quantityQuota to set
	 */
	public void setQuantityQuota(int quantityQuota) {
		this.quantityQuota = quantityQuota;
	}
	/**
	 * @return the interestRate
	 */
	public int getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public int getQuantityToPay() {
		return (this.capital / this.interestRate) * 100 + this.capital;
	}
	
	public int getQuantityOfQuota() {
		return (this.getQuantityToPay() / this.quantityQuota);
	}
	
}
