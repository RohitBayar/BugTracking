/**
 * 
 */
package in.fundemental.funde.service;

import in.fundemental.funde.exception.ApplicationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.fundemental.funde.entity.Application;
import in.fundemental.funde.repository.ApplicationRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author ra670131
 *
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	ApplicationRepository applicationRepository;
	
//	@Override
//	public Iterable<Application> listApplications() {
//		return applicationRepository.findAll();
//	}

	@Override
	public List<Application> listApplications(){
		return (List<Application>)applicationRepository.findAll();
	}

	@Override
	public Application findApplication(long id) {
		Optional<Application> optionalApplication = applicationRepository.findById(id);
		if (optionalApplication.isPresent()){
			return optionalApplication.get();
		} else {
			throw new ApplicationNotFoundException("Application not found");
		}
	}

}
