import java.util.ArrayList;

public class Egitmen {
	public int egitmenId;
	public String egitmenName;
	public ArrayList<Kurs> kurslar;

	public Egitmen(int egitmenId, String egitmenName) {
		this.egitmenId = egitmenId;
		this.egitmenName = egitmenName;
		this.kurslar = new ArrayList<Kurs>();
	}

}
