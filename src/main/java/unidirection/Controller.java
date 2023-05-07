package unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction EntityTransaction=entityManager.getTransaction();
		
		Busses busses=new Busses();
		busses.setBus_no(9764);
		busses.setBusname("srs");
		

		Busses busses1=new Busses();
		busses1.setBus_no(5678);
		busses1.setBusname("udayaranga");
		

		Busses busses2=new Busses();
		busses2.setBus_no(9763);
		busses2.setBusname("redbus");
		
		Passengers passengers=new Passengers();
		passengers.setId(1);
		passengers.setName("kempa");
		
		Passengers passengers1=new Passengers();
		passengers1.setId(2);
		passengers1.setName("manka");
		
		Passengers passengers2=new Passengers();
		passengers2.setId(3);
		passengers2.setName("penga");
		
		List<Passengers> lp=new ArrayList<Passengers>();
		lp.add(passengers);
		lp.add(passengers1);
		lp.add(passengers2);
		//mapping
		busses.setLp(lp);
		busses1.setLp(lp);
		busses2.setLp(lp);
		
		EntityTransaction.begin();
		entityManager.persist(busses);
		entityManager.persist(busses1);
		entityManager.persist(busses2);
		entityManager.persist(passengers);
		entityManager.persist(passengers1);
		entityManager.persist(passengers2);
		EntityTransaction.commit();
		
		
		
		System.out.println("Unidirection done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
