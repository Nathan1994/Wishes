
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.struts2.user.model.Operation;
import com.struts2.user.model.User;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				User u = new User();
				u.setId(3453);
				u.setName("T1q");
				u.setAge(18);
				
				
//				//Configuration cfg = new Configuration();
//				//SessionFactory sf = cfg.configure().buildSessionFactory();
//				Session session = sf.openSession();
//				session.getTransaction().begin();
//				session.save(u);
//				session.getTransaction().commit();
//				session.close();
//				sf.close();
				
				Operation o = new Operation();
				o.dataSave(u);
				
				
				
			} 

	

}