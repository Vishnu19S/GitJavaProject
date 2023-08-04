package SingleInheritanceForRajavel;

class inheritance {

	 void hero() {

		System.out.println("vijay");
	}

	 void heroine() {
		System.out.println("thirsha");
	}

}

public class Single_inheritance extends inheritance {
	
	 void villan() {
System.out.println("RDX");
	}
	
	private void family() {
System.out.println("prakash raj, nasar");
	}
	

	public static void main(String[] args) {
		
		Single_inheritance v = new Single_inheritance();
		
		v.family();
		v.hero();
		v.heroine();
		v.villan();

	}

}
