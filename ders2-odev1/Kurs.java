import java.util.ArrayList;

public class Kurs {
	public int kursId;
	public String kursName;
	public ArrayList<Egitmen> egitmenler;

	public Kurs(int kursId, String kursName) {
		this.kursId = kursId;
		this.kursName = kursName;
		this.egitmenler = new ArrayList<Egitmen>();
	}

}
