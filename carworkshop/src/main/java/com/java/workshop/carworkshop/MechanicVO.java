/**
 * 
 */
package com.java.workshop.carworkshop;

import java.io.Serializable;
import java.util.List;

/**
 * @author tpurusot
 *
 */
public class MechanicVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6559194508815881899L;
	private String mechanicName;
	private List<String> repairSkills;
	private String mechanicWorksFor;
	private String estimatedCompletion;
	private boolean available;
	private Integer mechanicId;
	/**
	 * @return the mechanicName
	 */
	public String getMechanicName() {
		return mechanicName;
	}
	/**
	 * @param mechanicName the mechanicName to set
	 */
	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}
	/**
	 * @return the repairExpert
	 */
	public List<String> getRepairSkills() {
		return repairSkills;
	}
	/**
	 * @param repairExpert the repairExpert to set
	 */
	public void setRepairSkills(List<String> repairSkills) {
		this.repairSkills = repairSkills;
	}
	/**
	 * @return the mechanicWorksFor
	 */
	public String getMechanicWorksFor() {
		return mechanicWorksFor;
	}
	/**
	 * @param mechanicWorksFor the mechanicWorksFor to set
	 */
	public void setMechanicWorksFor(String mechanicWorksFor) {
		this.mechanicWorksFor = mechanicWorksFor;
	}
	/**
	 * @return the estimatedCompletion
	 */
	public String getEstimatedCompletion() {
		return estimatedCompletion;
	}
	/**
	 * @param estimatedCompletion the estimatedCompletion to set
	 */
	public void setEstimatedCompletion(String estimatedCompletion) {
		this.estimatedCompletion = estimatedCompletion;
	}
	
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * @return the mechanicId
	 */
	public Integer getMechanicId() {
		return mechanicId;
	}
	/**
	 * @param mechanicId the mechanicId to set
	 */
	public void setMechanicId(Integer mechanicId) {
		this.mechanicId = mechanicId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MechanicVO [mechanicName=" + mechanicName + ", repairSkills=" + repairSkills + ", mechanicWorksFor="
				+ mechanicWorksFor + ", estimatedCompletion=" + estimatedCompletion + ", available=" + available
				+ ", mechanicId=" + mechanicId + "]";
	}
	/**
	 * @param mechanicName
	 * @param repairSkills
	 * @param mechanicWorksFor
	 * @param estimatedCompletion
	 * @param available
	 * @param mechanicId
	 */
	public MechanicVO(String mechanicName, List<String> repairSkills, String mechanicWorksFor,
			String estimatedCompletion, boolean available, Integer mechanicId) {
		super();
		this.mechanicName = mechanicName;
		this.repairSkills = repairSkills;
		this.mechanicWorksFor = mechanicWorksFor;
		this.estimatedCompletion = estimatedCompletion;
		this.available = available;
		this.mechanicId = mechanicId;
	}
	/**
	 * 
	 */
	public MechanicVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
