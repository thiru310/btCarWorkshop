package com.java.workshop.carworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
	public static List<MechanicVO> mechanicList = null;
	public static final List<SkillVO> skillVoList = new LinkedList<SkillVO>();
	public static List<String> issueList = null;
	public static Map<String,SkillVO> issueSkillMap = null;;
	public static Map<String,List<MechanicVO>> skillMechanicMap = new HashMap<String,List<MechanicVO>>();
	public static final Set<MechanicVO> avialablemechanicSet = new HashSet<MechanicVO>();
	
	public App() {
		AppDataInitialiser appDataInitialise = new AppDataInitialiser();
		mechanicList = appDataInitialise.createMechanicList();
		issueList = appDataInitialise.createIssueList();
		issueSkillMap = appDataInitialise.issueSkillMap();
		
	}
	
	
	
    public static void main( String[] args )
    {
    	App app = new App();
    	
        CarVO car = new CarVO();
        car.setCarMake("Maruti Suzuki");
        car.setCarMakeYear("2015");
        car.setCarNumber("PY 01 BF 7450");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("OilChanging");
        carissues.add("TimingBelt");
        carissues.add("CarburetorCleaning");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback Swift");
        
        Set<MechanicVO> mechOptfortheCar = app.getSkillAvailableMechanicMap(car, mechanicList);
        
        Mechanic mechanic = new Mechanic();
        mechanic.repair(car, mechOptfortheCar);
    	
    }
    
	public Set<MechanicVO> getSkillAvailableMechanicMap(CarVO car,List<MechanicVO> mechanicVolist) {
		skillMechanicMap = getskillMechanicMap(mechanicVolist);
		String carBrandname = car.getCarMake();
		List<String> issuelist = car.getIssues();
		Set<MechanicVO> availableMechanicList = new HashSet<MechanicVO>();
		if(null != issuelist && issuelist.size() > 0) {
			for(Map.Entry<String, List<MechanicVO>> skillmechanicgrp : skillMechanicMap.entrySet()) {
				for(String issue : issuelist) {
					if(null != skillmechanicgrp && null !=  skillmechanicgrp.getKey() && skillmechanicgrp.getKey().equals(issue)) {
						for(MechanicVO mechanic : skillmechanicgrp.getValue()) {
							if(null != mechanic && mechanic.getMechanicWorksFor().equals(carBrandname) && mechanic.isAvailable()) {
								availableMechanicList.add(mechanic);
							}
						}
					}
				}
				
			}
		}
		return availableMechanicList;
	}
	
	
	public static Map<String,List<MechanicVO>> getskillMechanicMap(List<MechanicVO> mechaniclst) {
		for(SkillVO skillvo : skillVoList) {
			List<MechanicVO> availableMechanicList = new ArrayList<MechanicVO>();
			for(MechanicVO mechanicVO : mechaniclst) {
				if(null != mechanicVO && mechanicVO.isAvailable() && null != mechanicVO.getSkillList() && mechanicVO.getSkillList().size() > 1) {
					for(SkillVO mechanicSkill: mechanicVO.getSkillList()) {
						if(null != skillvo && null != skillvo.getSkillName() && !skillvo.getSkillName().isEmpty()) {
							if(null != mechanicSkill &&  null != mechanicSkill.getSkillName() && !mechanicSkill.getSkillName().isEmpty()) {
								if(mechanicSkill.getSkillName().equals(skillvo.getSkillName())) {
									availableMechanicList.add(mechanicVO);
								}
							}
						}
					}
				}
				skillMechanicMap.put(skillvo.getSkillName(), availableMechanicList);
			}
			
		}
		return skillMechanicMap;
	}
	
}
