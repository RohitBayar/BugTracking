/**
 * 
 */
package in.fundemental.funde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.fundemental.funde.entity.Ticket;
import in.fundemental.funde.repository.TicketRepository;

/**
 * @author ra670131
 *
 */
@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public Iterable<Ticket> listTickets() {
		return ticketRepository.findAll();
	}

}
