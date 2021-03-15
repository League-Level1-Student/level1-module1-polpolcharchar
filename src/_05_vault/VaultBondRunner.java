package _05_vault;

public class VaultBondRunner {
public static void main(String[] args) {
	JamesBond bond = new JamesBond();
	Vault vault = new Vault();
	bond.findCode(vault);
}
}
