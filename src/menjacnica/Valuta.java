package menjacnica;

public class Valuta {

	private String ime, skracenica;
	KursValute kv;

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime == null || ime.isEmpty() )
			throw new RuntimeException("Morate da unesete naziv valute.");
		this.ime = ime;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if(skracenica == null || skracenica.isEmpty() || skracenica.length()>3) 
			throw new RuntimeException("Unesite skracenicu valute.");
		this.skracenica = skracenica;
	}
	public KursValute getKv() {
		return kv;
	}
	public void setKv(KursValute kv) {
		if(kv == null) 
			throw new RuntimeException("Kurs valute ne moze da bude null.");
		this.kv = kv;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((kv == null) ? 0 : kv.hashCode());
		result = prime * result
				+ ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (kv == null) {
			if (other.kv != null)
				return false;
		} else if (!kv.equals(other.kv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	public String toString() {
		return "Valuta [ime=" + ime + ", skracenica=" + skracenica + ", kv="
				+ kv + "]";
	}







}
