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
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_id")
	private Long id;
	
	@Column(name="app_name", nullable=false)
	private String name;
	
	@Column(length=2000)
	private String description;
	private String owner;
	
	
	
	/**
	 * 
	 */
	public Application() {
	}

	/**
	 * @param name
	 * @param description
	 * @param owner
	 */
	public Application(String name, String description, String owner) {
		this.name = name;
		this.description = description;
		this.owner = owner;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", description='" + description + '\'' +
                '}';
    }

}
