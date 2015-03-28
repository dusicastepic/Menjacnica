package menjacnica;

import java.util.GregorianCalendar;

public class KursValute {

	private GregorianCalendar datum;
	private double prodajniKurs, srednjiKurs, kupovniKurs;
	
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) throws Exception{
		if(datum==null) throw new Exception("Morate da ukucate ispravan datum.");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<=0 || prodajniKurs<=srednjiKurs||prodajniKurs<=kupovniKurs) 
			throw new RuntimeException("Prodajni kurs ne moze da bude negativan, ni manji od srednjeg ili kupovnog");
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<=0 ||srednjiKurs<=kupovniKurs||srednjiKurs>=prodajniKurs)
			throw new RuntimeException("Srednji kurs ne moze da bude negativan i mora da ima vrednost izmedju prodajnog i kupovnog kursa");
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<=0||kupovniKurs>=srednjiKurs||kupovniKurs>=prodajniKurs)
			throw new RuntimeException("Kupovni kurs ne moze da bude negativan, ni veci od srednjeg ili kupovnog");
		this.kupovniKurs = kupovniKurs;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KursValute other = (KursValute) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	public String toString() {
		return "KursValute [datum=" + datum + ", prodajniKurs=" + prodajniKurs
				+ ", srednjiKurs=" + srednjiKurs + ", kupovniKurs="
				+ kupovniKurs + "]";
	}
	
	


}
