package mod.oa.entity;

/**
 * ModDept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer depId;
	private String depName;
	private String depDesc;
	private Integer depParent;

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String depName, String depDesc, Integer depParent) {
		this.depName = depName;
		this.depDesc = depDesc;
		this.depParent = depParent;
	}

	// Property accessors

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepDesc() {
		return this.depDesc;
	}

	public void setDepDesc(String depDesc) {
		this.depDesc = depDesc;
	}

	public Integer getDepParent() {
		return this.depParent;
	}

	public void setDepParent(Integer depParent) {
		this.depParent = depParent;
	}

}