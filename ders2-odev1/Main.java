
public class Main {

	public static void main(String[] args) {
		Kategori kat1 = new Kategori(1, "Programlama");

		
		Kurs kurs1 = new Kurs(1, "Kurs-1");	
		Kurs kurs2 = new Kurs(2, "Kurs-2");
		Kurs kurs3 = new Kurs(3, "Kurs-3");
		
		Egitmen egitmen1 = new Egitmen(1,"Ahmet");
		Egitmen egitmen2 = new Egitmen(2,"Mehmet");
		
		KursManager kursManager = new KursManager();
		
		kursManager.kursaEgitmenEkle(kurs1, egitmen1);
		kursManager.kursaEgitmenEkle(kurs1, egitmen2);
		
		kursManager.kursEgitmenleriniBul(kurs1);
		

	}

}
