package unidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Busses {
	
	@Id
	int bus_no;
	String busname;
	@ManyToMany
	List<Passengers> lp;
	public int getBus_no() {
		return bus_no;
	}
	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public List<Passengers> getLp() {
		return lp;
	}
	public void setLp(List<Passengers> lp) {
		this.lp = lp;
	}
	
	
	

}
