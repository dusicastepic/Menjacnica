package menjacnica.interfejs;

import java.util.GregorianCalendar;
import menjacnica.KursValute;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodaj(Valuta valuta);
	public void izbrisi(Valuta valuta);
	public KursValute vratiKurs(GregorianCalendar datum, String ime);

}
