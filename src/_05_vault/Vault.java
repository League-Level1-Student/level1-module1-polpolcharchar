package _05_vault;

import java.util.Random;

public class Vault {

	// member variable or field or instance variable
	int secretCode = new Random().nextInt(1000000);

	public boolean tryCode(int guess) {
		if (guess == secretCode) {
			return true;
		} else {
			return false;
		}

	}

}
