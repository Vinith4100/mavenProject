package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import greeting.Greet;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Greet greeter;

	@Override
	public void run(String... args) throws Exception {
		greeter.greet();
	}

}
