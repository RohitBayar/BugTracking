/**
 * 
 */
package in.fundemental.funde;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.fundemental.funde.entity.Application;
import in.fundemental.funde.entity.Release;
import in.fundemental.funde.entity.Ticket;
import in.fundemental.funde.repository.ApplicationRepository;
import in.fundemental.funde.repository.ReleaseRepository;
import in.fundemental.funde.repository.TicketRepository;

/**
 * @author ra670131
 *
 */
@Component
public class MyRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MyRunner.class);
	
	@Autowired
	private ApplicationRepository repository;
	
	@Autowired
	private ReleaseRepository relRepo;
	
	@Autowired
	private TicketRepository ticketRepo;
	
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		Application app1 = new Application("Bugzee","Rohit","Application for tracking bugs");
		repository.save(app1);
		repository.save(new Application("Expenses","Roh","Application for tracking expenses"));
		repository.save(new Application("Notifications","hit","Application for tracking notifications"));
		Release rel = new Release("release1","25-07-2020");
		relRepo.deleteAll();
		relRepo.save(rel);
		relRepo.save(new Release("release2","23-07-2020"));
		relRepo.save(new Release("release3","21-07-2020"));
		
		ticketRepo.deleteAll();
		ticketRepo.save(new Ticket("tic1","ticket 1",app1,rel,"false"));
		
		for (Application application : repository.findAll()) {
			log.info("The application is:" + application.toString());
		}

	}

}
