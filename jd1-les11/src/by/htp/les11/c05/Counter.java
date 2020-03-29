package by.htp.les11.c05;

public class Counter {
	private int min = 0;
	private int max = 10;
	private int rand;

	public Counter() {
	}

	public int plus() {
		if (rand >= max) {
			rand = max;
		} else {
			while (rand < max) {
				rand++;
			}
		}
		return rand;
	}

	public int minus() {
		if (rand <= min) {
			rand = min;
		} else {
			while (rand > min) {
				rand--;
			}
		}
		return rand;
	}

	public void setRand(int rand) {
		this.rand = rand;
	}

}
