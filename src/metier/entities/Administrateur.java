package metier.entities;
// Generated 12 janv. 2016 02:22:22 by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Administrateur generated by hbm2java
 */
@Entity
@Table(name = "administrateur", catalog = "biblio")
public class Administrateur implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAdmin;
	private String login;
	private String password;

	public Administrateur() {
	}

	public Administrateur(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public Administrateur(int idAdmin, String login, String password) {
		this.idAdmin = idAdmin;
		this.login = login;
		this.password = password;
	}

	@Id

	@Column(name = "ID_ADMIN", unique = true, nullable = false)
	public long getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

	@Column(name = "LOGIN", length = 30)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "PASSWORD", length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
