package SingleInheritanceForRajavel;

class raj {

	void animals() {
		System.out.println("dog");

	}

}

public class SinInh extends raj {

	void cars() {

		System.out.println("bmw");

	}

	public static void main(String[] args) {

		SinInh aa = new SinInh();

		aa.animals();
		aa.cars();

	}

}
