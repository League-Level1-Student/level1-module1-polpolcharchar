package _05_vault;

public class JamesBond {
	public void findCode(Vault v) {
		boolean placeholder = false;
		for (int i = 0; i < 1000001; i++) {
			if (v.tryCode(i)) {
				System.out.println(i);
				placeholder = true;
			}
		}
		if (placeholder == false) {
			System.out.println(-1);
		}
	}
}
