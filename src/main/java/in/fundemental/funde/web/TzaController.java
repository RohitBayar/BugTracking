/**
 * 
 */
package in.fundemental.funde.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.fundemental.funde.service.ApplicationService;
import in.fundemental.funde.service.ReleaseService;
import in.fundemental.funde.service.TicketService;

/**
 * @author ra670131
 *
 */
@Controller
public class TzaController {
	private ApplicationService applicationService;
	private ReleaseService releaseService;
	private TicketService ticketService;
	
	@Autowired
	public void setApplciationService(ApplicationService appService) {
		this.applicationService = appService;
	}
	
	@Autowired
	public void setReleaseService(ReleaseService relServ) {
		this.releaseService = relServ;
	}
	
	@Autowired
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	@GetMapping("/applications")
	public String getApplications(Model model) {
		model.addAttribute("applications", applicationService.listApplications());
		return "applications";
	}
	@GetMapping("/releases")
	public String getReleases(Model model) {
		model.addAttribute("releases", releaseService.listReleases());
		return "releases";
	}
	@GetMapping("/tickets")
	public String getTickets(Model model) {
		model.addAttribute("tickets", ticketService.listTickets());
		return "tickets";
	}
}
