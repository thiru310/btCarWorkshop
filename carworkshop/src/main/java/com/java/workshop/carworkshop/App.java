package com.java.workshop.carworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
	public static List<MechanicVO> mechanicList = new ArrayList<MechanicVO>();
	public static List<SkillVO> skillVoList = new ArrayList<SkillVO>();
	public static final List<String> issueList = new ArrayList<String>();
	public static Map<String,SkillVO> issueSkillMap = new HashMap<String, SkillVO>();
	public static Map<String,List<MechanicVO>> skillMechanicMap = new HashMap<String,List<MechanicVO>>();
	Set<MechanicVO> avialablemechanicSet = new HashSet<MechanicVO>();
	
	public App() {
		createMechanicList();
		createIssueList();
		issueSkillMap();
		
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
        
        Set<MechanicVO> mechOptfortheCar = app.getSkillAvailableMechanicMap(car);
        System.out.println("Available Mechanics after assigning to car service");
        System.out.println(Arrays.toString(mechanicList.toArray()));
    	
    	System.out.println( "Hello World!" );
    }
    
    
    public void createMechanicList() {
		SkillVO engineCleaningSkill = new SkillVO();
		engineCleaningSkill.setSkillId(1);
		engineCleaningSkill.setSkillName("EngineCleaning");
		skillVoList.add(engineCleaningSkill);
		
		SkillVO jumpStartingSkill = new SkillVO();
		jumpStartingSkill.setSkillId(2);
		jumpStartingSkill.setSkillName("JumpStarting");
		skillVoList.add(jumpStartingSkill);
		
		SkillVO rearDefrosterSkill = new SkillVO();
		rearDefrosterSkill.setSkillId(3);
		rearDefrosterSkill.setSkillName("RearDeFroster");
		skillVoList.add(rearDefrosterSkill);
		
		SkillVO serpentineBeltSkill = new SkillVO();
		serpentineBeltSkill.setSkillId(4);
		serpentineBeltSkill.setSkillName("SerpentineBelt");
		skillVoList.add(serpentineBeltSkill);
		
		SkillVO carbCleaningSkill = new SkillVO();
		carbCleaningSkill.setSkillId(5);
		carbCleaningSkill.setSkillName("CarburetorCleaning");
		skillVoList.add(carbCleaningSkill);
		
		SkillVO oilChangeSkill = new SkillVO();
		oilChangeSkill.setSkillId(6);
		oilChangeSkill.setSkillName("OilChanging");
		skillVoList.add(oilChangeSkill);
		
		SkillVO sparkPlugSkill = new SkillVO();
		sparkPlugSkill.setSkillId(7);
		sparkPlugSkill.setSkillName("SparkPlug");
		skillVoList.add(sparkPlugSkill);
		
		SkillVO timingBeltSkill = new SkillVO();
		timingBeltSkill.setSkillId(8);
		timingBeltSkill.setSkillName("TimingBelt");
		skillVoList.add(timingBeltSkill);
		
		MechanicVO mechanic1 = new MechanicVO();
		mechanic1.setAvailable(Boolean.TRUE);
		mechanic1.setMechanicId(100);
		mechanic1.setMechanicName("AAAAAA");
		mechanic1.setMechanicWorksFor("Maruti Suzuki");
		List<SkillVO> mechanic1SkillList = new ArrayList<SkillVO>();
		mechanic1SkillList.add(engineCleaningSkill);
		mechanic1SkillList.add(serpentineBeltSkill);
		mechanic1.setSkillList(mechanic1SkillList);
		
		MechanicVO mechanic2 = new MechanicVO();
		mechanic2.setAvailable(Boolean.TRUE);
		mechanic2.setMechanicId(110);
		mechanic2.setMechanicName("BBBBBB");
		mechanic2.setMechanicWorksFor("Maruti Suzuki");
		List<SkillVO> mechanic2SkillList = new ArrayList<SkillVO>();
		mechanic2SkillList.add(carbCleaningSkill);
		mechanic2SkillList.add(oilChangeSkill);
		mechanic2.setSkillList(mechanic2SkillList);
		
		MechanicVO mechanic3 = new MechanicVO();
		mechanic3.setAvailable(Boolean.TRUE);
		mechanic3.setMechanicId(120);
		mechanic3.setMechanicName("CCCCCC");
		mechanic3.setMechanicWorksFor("Maruti Suzuki");
		List<SkillVO> mechanic3SkillList = new ArrayList<SkillVO>();
		mechanic3SkillList.add(timingBeltSkill);
		mechanic3SkillList.add(serpentineBeltSkill);
		mechanic3.setSkillList(mechanic3SkillList);
		
		MechanicVO mechanic4 = new MechanicVO();
		mechanic4.setAvailable(Boolean.TRUE);
		mechanic4.setMechanicId(130);
		mechanic4.setMechanicName("DDDDDD");
		mechanic4.setMechanicWorksFor("Maruti Suzuki");
		List<SkillVO> mechanic4SkillList = new ArrayList<SkillVO>();
		mechanic4SkillList.add(oilChangeSkill);
		mechanic4SkillList.add(carbCleaningSkill);
		mechanic4.setSkillList(mechanic4SkillList);
		
		MechanicVO mechanic5 = new MechanicVO();
		mechanic5.setAvailable(Boolean.TRUE);
		mechanic5.setMechanicId(140);
		mechanic5.setMechanicName("EEEEEE");
		mechanic5.setMechanicWorksFor("Maruti Suzuki");
		List<SkillVO> mechanic5SkillList = new ArrayList<SkillVO>();
		mechanic5SkillList.add(engineCleaningSkill);
		mechanic5SkillList.add(serpentineBeltSkill);
		mechanic5.setSkillList(mechanic5SkillList);
		
		MechanicVO mechanic6 = new MechanicVO();
		mechanic6.setAvailable(Boolean.TRUE);
		mechanic6.setMechanicId(150);
		mechanic6.setMechanicName("FFFFFF");
		mechanic6.setMechanicWorksFor("Hyundai");
		List<SkillVO> mechanic6SkillList = new ArrayList<SkillVO>();
		mechanic6SkillList.add(engineCleaningSkill);
		mechanic6SkillList.add(sparkPlugSkill);
		mechanic6.setSkillList(mechanic6SkillList);
		
		MechanicVO mechanic7 = new MechanicVO();
		mechanic7.setAvailable(Boolean.TRUE);
		mechanic7.setMechanicId(160);
		mechanic7.setMechanicName("GGGGGG");
		mechanic7.setMechanicWorksFor("Hyundai");
		List<SkillVO> mechanic7SkillList = new ArrayList<SkillVO>();
		mechanic7SkillList.add(rearDefrosterSkill);
		mechanic7SkillList.add(serpentineBeltSkill);
		mechanic7.setSkillList(mechanic7SkillList);
		
		MechanicVO mechanic8 = new MechanicVO();
		mechanic8.setAvailable(Boolean.TRUE);
		mechanic8.setMechanicId(170);
		mechanic8.setMechanicName("HHHHHH");
		mechanic8.setMechanicWorksFor("Hyundai");
		List<SkillVO> mechanic8SkillList = new ArrayList<SkillVO>();
		mechanic8SkillList.add(carbCleaningSkill);
		mechanic8SkillList.add(jumpStartingSkill);
		mechanic8.setSkillList(mechanic8SkillList);
		
		MechanicVO mechanic9 = new MechanicVO();
		mechanic9.setAvailable(Boolean.TRUE);
		mechanic9.setMechanicId(180);
		mechanic9.setMechanicName("IIIIII");
		mechanic9.setMechanicWorksFor("Hyundai");
		List<SkillVO> mechanic9SkillList = new ArrayList<SkillVO>();
		mechanic9SkillList.add(oilChangeSkill);
		mechanic9SkillList.add(sparkPlugSkill);
		mechanic9.setSkillList(mechanic9SkillList);
		
		MechanicVO mechanic10 = new MechanicVO();
		mechanic10.setAvailable(Boolean.TRUE);
		mechanic10.setMechanicId(190);
		mechanic10.setMechanicName("JJJJJJ");
		mechanic10.setMechanicWorksFor("Hyundai");
		List<SkillVO> mechanic10SkillList = new ArrayList<SkillVO>();
		mechanic10SkillList.add(timingBeltSkill);
		mechanic10SkillList.add(rearDefrosterSkill);
		mechanic10.setSkillList(mechanic10SkillList);
		
		mechanicList.add(mechanic1);
		mechanicList.add(mechanic2);
		mechanicList.add(mechanic3);
		mechanicList.add(mechanic4);
		mechanicList.add(mechanic5);
		mechanicList.add(mechanic6);
		mechanicList.add(mechanic7);
		mechanicList.add(mechanic8);
		mechanicList.add(mechanic9);
		mechanicList.add(mechanic10);
	}
	
	public void createIssueList() {
		issueList.add("EngineCleaning");
		issueList.add("JumpStarting");
		issueList.add("RearDeFroster");
		issueList.add("SerpentineBelt");
		issueList.add("CarburetorCleaning");
		issueList.add("OilChanging");
		issueList.add("SparkPlug");
		issueList.add("TimingBelt");
		
	}
	
	public void issueSkillMap() {
		for(String issueStr : issueList) {
			for(SkillVO skillvo : skillVoList) {
				if(null !=  issueStr && !issueStr.isEmpty() && null != skillvo &&  null != skillvo.getSkillName() && !skillvo.getSkillName().isEmpty()) {
					if(issueStr.equalsIgnoreCase(skillvo.getSkillName())) {
						issueSkillMap.put(issueStr, skillvo);
					}
				}
			}
		}
		System.out.println("issueSkillMap >>"+issueSkillMap.toString());
	}
	
	public Set<MechanicVO> getSkillAvailableMechanicMap(CarVO car) {
		String carBrandname = car.getCarMake();
		List<String> issuelist = car.getIssues();
		System.out.println("issues list in getAvailableMechanic Map >>"+Arrays.toString(issuelist.toArray()));
		if(null != issuelist && issuelist.size() > 0) {
			System.out.println("Issue List is not empty");
			Set<MechanicVO> availableMechanicList = new HashSet<MechanicVO>();
			for(String issues : issuelist) {
				System.out.println("Iterateing issue list");
				for(MechanicVO mechanicVO : mechanicList) {
					if(null != carBrandname && !carBrandname.isEmpty() && carBrandname.equals(mechanicVO.getMechanicWorksFor())){
						if(null != mechanicVO && mechanicVO.isAvailable() && null != mechanicVO.getSkillList() && mechanicVO.getSkillList().size() > 1) {
							for(SkillVO mechanicSkill: mechanicVO.getSkillList()) {
								if(null != issues && !issues.isEmpty()) {
									if(null != mechanicSkill &&  null != mechanicSkill.getSkillName() && !mechanicSkill.getSkillName().isEmpty()) {
										if(mechanicSkill.getSkillName().equals(issues)) {
											System.out.println("Mechaninc name >>"+mechanicVO.getMechanicName());
											System.out.println("Mechaninc skill >>"+mechanicSkill.getSkillName());
											if(mechanicList.contains(mechanicVO)) {
												int mechanicVOIndex = mechanicList.indexOf(mechanicVO);
												mechanicList.get(mechanicVOIndex).setAvailable(Boolean.FALSE);
											}
											mechanicVO.setAvailable(Boolean.FALSE);
											avialablemechanicSet.add(mechanicVO);
										}
									}
								}
							}
						}
					}
					
					//skillMechanicMap.put(skillvo.getSkillName(), availableMechanicList);
				}
			}
			System.out.println("Mechanic Skill list >>"+Arrays.toString(availableMechanicList.toArray()));

		}
		return avialablemechanicSet;
			
			
		
	}
	
	
	public void skillMechanicMap() {
		for(SkillVO skillvo : skillVoList) {
			List<MechanicVO> availableMechanicList = new ArrayList<MechanicVO>();
			for(MechanicVO mechanicVO : mechanicList) {
				if(null != mechanicVO && mechanicVO.isAvailable() && null != mechanicVO.getSkillList() && mechanicVO.getSkillList().size() > 1) {
					for(SkillVO mechanicSkill: mechanicVO.getSkillList()) {
						if(null != skillvo && null != skillvo.getSkillName() && !skillvo.getSkillName().isEmpty()) {
							if(null != mechanicSkill &&  null != mechanicSkill.getSkillName() && !mechanicSkill.getSkillName().isEmpty()) {
								if(mechanicSkill.getSkillName().equals(skillvo.getSkillName())) {
									System.out.println("Mechaninc name >>"+mechanicVO.getMechanicName());
									System.out.println("Mechaninc skill >>"+mechanicSkill.getSkillName());
									availableMechanicList.add(mechanicVO);
								}
							}
						}
					}
				}
				System.out.println("Mechanic Skill list >>"+Arrays.toString(availableMechanicList.toArray()));
				skillMechanicMap.put(skillvo.getSkillName(), availableMechanicList);
			}
			
		}
		System.out.println("skillMechanicMap >>>"+skillMechanicMap.toString());
	}
	
}
