package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private Collection<Account> accounts;
	private int number;
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

        public Collection<Account> getAccounts() {
                return accounts;
        }

        public void setAccounts(Collection<Account> accounts) {
                this.accounts = accounts;
        }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
        

	/**
	 * 
	 * @param number le numero du client
	 * @param firstName le prenom du client
	 * @param lastName le nom du client
	 */
	public Customer(Integer number, String firstName, String lastName) {
		this.number = number;
                this.firstName = firstName;
                this.lastName = lastName;
                this.accounts = new ArrayList<>();
	}

        
	/**
	 * 
	 * @param number le numero du compte recherche
         * @return Le compte recherche par son numero
	 */
	public Account getAccountByNumber(String number) {
                Account rs = null;  
                for (Account account : getAccounts()) {
                    if (account.getNumber().equals(number)) {
                        rs = account;
                    }
                }
                return rs;
	}

        
	/**
	 * 
	 * @param number le numero du compte
	 * @param name le nom du compte
	 * @param rate le taux du compte
	 */
	public void addAccount(String number, String name, double rate) {
		getAccounts().add(new Account(number, name, rate, this));
	}

}