/**
 * 
 */
package in.fundemental.funde.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.fundemental.funde.entity.Application;

/**
 * @author ra670131
 *
 */
@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
