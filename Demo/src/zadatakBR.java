
public class zadatakBR {  

	public static void main(String[] args) {
	
//IF
//uzavisnosi da li je promenljiva veca od 0, vrsi dodeljivanje vrednosti promenljivoj 3	
	
	int broj = 0;
	
	if(!(broj > 0)) {
		broj = 3;
		System.out.println("broj je: " + broj);
	}
	//bez ! i duplih zagrada nece se nista prikazati
	
	
//SWITCH
// def su ulazni parametri x i y kao dole. Potrebno je izvrsiti proveru
//ostatka deljenja x i y. Ukoliko ne postoji ostatak, prikazati poruku da ostatakne postoji,
//u suprotnom, proveriti da li je ostatak veci ili manji od 1000 i ispisati odgovarajucu poruku
//Ovi zadaci mogu biti primenljivi ukoliko se koristi Scanner.
	
	int x = 523134;
	int y = 325423;
	//
	int ostatak = x % y;
	
	switch(ostatak) {
		case 0:
			System.out.println("Ne postoji ostatak pri deljenju");
			break;
			
		default: 
			if(ostatak < 1000) {
				System.out.println("Ostatak pri deljenju x i y je manji od 1000");
				
			}else {
				System.out.println("Ostatak pri deljenju x i y je veci od 1000");
			}break;
	}
	
	
	
//SWITCH 2
// Dati su podaci String i int. Napaviti uslovnu konstrukciju koja ce da proverava
// da li je proizvodjac automobila Ford i ukoliko jeste, da u zavisnosti od broja vrata 
//ispisuje odgovarajucu poruku..Ovi zadaci mogu biti primenljivi sa Scannerom.
	
	String automobil = "Ford";
	int vrata = 4;
	
	switch (automobil) {  
	case "Ford":
	//radilo bi i bez prvog switha, ali mora da proveri da je proizvodjac stvarno ford	
		
		switch(vrata) {
		case 3:
			System.out.println("Vozis ford sa 3 vrata");
			break;
		case 4:
			System.out.println("Vozis ford sa 4 vrata");
			break;
		case 5:
			System.out.println("Vozis ford sa 5 vrata");
			break;
		}
			
	default:
		System.out.println("Vi ne vozite Ford automobil");
		break;				
		}
	
	
	}
}

