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
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "application_id")
	private Application application;
	
	@ManyToOne
	@JoinTable(name="ticket_release", joinColumns= @JoinColumn(name="ticket_fk"), inverseJoinColumns = @JoinColumn(name="release_fk"))
	private Release release;
	private String status;
	/**
	 * 
	 */
	public Ticket() {

	}
	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param application
	 * @param release
	 * @param status
	 */
	public Ticket(String title, String description, Application application, Release release,
			String status) {
		this.title = title;
		this.description = description;
		this.application = application;
		this.release = release;
		this.status = status;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	/**
	 * @return the application
	 */
	public Application getApplication() {
		return application;
	}
	/**
	 * @param application the application to set
	 */
	public void setApplication(Application application) {
		this.application = application;
	}
	/**
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}
	/**
	 * @param release the release to set
	 */
	public void setRelease(Release release) {
		this.release = release;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
