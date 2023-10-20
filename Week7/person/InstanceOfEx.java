package person;

class NPerson {}
class NStudent extends NPerson {}
class Researcher extends NPerson {}
class Professor extends Researcher {}

public class InstanceOfEx {
	static void print(NPerson p) {
		if(p instanceof NPerson)
			System.out.print("Person ");
		if(p instanceof NStudent)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Proffessor ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("new NStudent() ->\t"); print(new NStudent());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Proffessor() ->\t"); print(new Professor());

	}

}
