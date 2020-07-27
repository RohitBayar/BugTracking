/**
 * 
 */
package in.fundemental.funde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.fundemental.funde.entity.Release;
import in.fundemental.funde.repository.ReleaseRepository;

/**
 * @author ra670131
 *
 */
@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	ReleaseRepository releaseRepository;
	
	@Override
	public Iterable<Release> listReleases() {
		return releaseRepository.findAll();
	}

}
