/**
 * 
 */
package in.fundemental.funde.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.fundemental.funde.entity.Application;
import in.fundemental.funde.entity.Release;

/**
 * @author ra670131
 *
 */
@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
