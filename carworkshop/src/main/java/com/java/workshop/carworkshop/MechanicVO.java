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
	private List<String> repairExpert;
	private String mechanicWorksFor;
	private String estimatedCompletion;
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
	public List<String> getRepairExpert() {
		return repairExpert;
	}
	/**
	 * @param repairExpert the repairExpert to set
	 */
	public void setRepairExpert(List<String> repairExpert) {
		this.repairExpert = repairExpert;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MechanicVO [mechanicName=" + mechanicName + ", repairExpert=" + repairExpert + ", mechanicWorksFor="
				+ mechanicWorksFor + ", estimatedCompletion=" + estimatedCompletion + "]";
	}
	public MechanicVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MechanicVO(String mechanicName, List<String> repairExpert, String mechanicWorksFor,
			String estimatedCompletion) {
		super();
		this.mechanicName = mechanicName;
		this.repairExpert = repairExpert;
		this.mechanicWorksFor = mechanicWorksFor;
		this.estimatedCompletion = estimatedCompletion;
	}
	
	

}
