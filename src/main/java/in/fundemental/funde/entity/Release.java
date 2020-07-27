/**
 * 
 */
package in.fundemental.funde.entity;

import javax.persistence.*;

/**
 * @author ra670131
 *
 */
@Entity
public class Release {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String releaseDate;
	private String description;
	/**
	 * 
	 */
	public Release() {
	}
	/**
	 * @param id
	 * @param releaseDate
	 * @param description
	 */
	public Release(String releaseDate, String description) {
		this.releaseDate = releaseDate;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
