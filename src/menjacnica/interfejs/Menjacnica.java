package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.KursValute;
import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public void dodaj(Valuta valuta) {
		if(valuta!=null && !valute.contains(valuta))
			valute.add(valuta);

	}

	public void izbrisi(Valuta valuta) {
		// TODO Auto-generated method stub

	}

	public KursValute vratiKurs(GregorianCalendar datum, String ime) {
		// TODO Auto-generated method stub
		return null;
	}

}
