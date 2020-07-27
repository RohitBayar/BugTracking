/**
 * 
 */
package in.fundemental.funde.web;

import in.fundemental.funde.entity.Application;
import in.fundemental.funde.exception.ApplicationNotFoundException;
import in.fundemental.funde.service.ApplicationService;
import in.fundemental.funde.service.ReleaseService;
import in.fundemental.funde.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * @author ra670131
 *
 */
@RestController
@RequestMapping("/tza")
public class TzaRestController {
	private ApplicationService applicationService;
	private ReleaseService releaseService;
	private TicketService ticketService;
	
	@Autowired
	public void setApplicationService(ApplicationService appService) {
		this.applicationService = appService;
	}
	
	@Autowired
	public void setReleaseService(ReleaseService relService) {
		this.releaseService = relService;
	}
	
	@Autowired
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	@GetMapping("/applications")
	public ResponseEntity<List<Application>> getApplications() {
		List<Application> list = applicationService.listApplications();
		return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
	}
	@GetMapping("/application/{id}")
	public ResponseEntity<Application> getApplication(@PathVariable("id") int id){
		try {
			return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
		} catch (ApplicationNotFoundException exception){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found");
		}
	}
//	@GetMapping("/releases")
//	public String getReleases(Model model) {
//		model.addAttribute("releases", releaseService.listReleases());
//		return "releases";
//	}
//	@GetMapping("/tickets")
//	public String getTickets(Model model) {
//		model.addAttribute("tickets", ticketService.listTickets());
//		return "tickets";
//	}
}
