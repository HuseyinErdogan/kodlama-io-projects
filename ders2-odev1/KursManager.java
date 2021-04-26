
public class KursManager {
	public void kursaEgitmenEkle(Kurs kurs, Egitmen egitmen) {
		kurs.egitmenler.add(egitmen);
		egitmen.kurslar.add(kurs);
		System.out.println(kurs.kursName+" isimli kursa "+egitmen.egitmenName+" isimli eðitmen eklendi." );
	}
	public void kursEgitmenleriniBul(Kurs kurs) {
		for(Egitmen egitmen:kurs.egitmenler) {
			System.out.println(egitmen.egitmenName);
		}
	}
}
