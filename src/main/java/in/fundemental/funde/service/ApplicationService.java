/**
 * 
 */
package in.fundemental.funde.service;

import in.fundemental.funde.entity.Application;

import java.util.List;

/**
 * @author ra670131
 *
 */
public interface ApplicationService {
//	Iterable<Application> listApplications();
	List<Application> listApplications();
	Application findApplication(long id);
}
