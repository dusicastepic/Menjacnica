package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.KursValute;
import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();


	public void dodaj(Valuta valuta) {

		if(valuta==null)
			throw new RuntimeException("Valuta ne moze da bude null! ");
		if(valute.contains(valuta)) 
			throw new RuntimeException("Valuta vec postoji ");
		valute.add(valuta);


	}

	public void izbrisi(Valuta valuta) {
		if(valuta==null) 
			throw new RuntimeException("Valuta ne moze da bude null! ");
		if(!valute.contains(valuta)) 
			throw new RuntimeException("Valuta ne postoji");
		valute.remove(valuta);
	}

	public KursValute vratiKurs(GregorianCalendar datum, String ime) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getIme().equals(ime)&&valute.get(i).getKv().getDatum().get(GregorianCalendar.DAY_OF_MONTH)==datum.get(GregorianCalendar.DAY_OF_MONTH))
				return valute.get(i).getKv();
			}
		return null;
	}

}
