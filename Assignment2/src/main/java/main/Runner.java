package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import entities.Account;
import greeting.Greet;
import repositories.AccountDAO;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public void run(String... args) throws Exception {
		
		Account account1=new Account("Vinith", 12222222L, 34434L);
		accountDAO.save(account1);
	}

}
