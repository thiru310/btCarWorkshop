/**
 * 
 */
package com.java.workshop.carworkshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author tpurusot
 *
 */
public class AppDataInitialiser {
		
	
	 public List<MechanicVO> createMechanicList() {
		 List<MechanicVO> mechanicList = new LinkedList<MechanicVO>();
			SkillVO engineCleaningSkill = new SkillVO();
			engineCleaningSkill.setSkillId(1);
			engineCleaningSkill.setSkillName("EngineCleaning");
			App.skillVoList.add(engineCleaningSkill);
			
			SkillVO jumpStartingSkill = new SkillVO();
			jumpStartingSkill.setSkillId(2);
			jumpStartingSkill.setSkillName("JumpStarting");
			App.skillVoList.add(jumpStartingSkill);
			
			SkillVO rearDefrosterSkill = new SkillVO();
			rearDefrosterSkill.setSkillId(3);
			rearDefrosterSkill.setSkillName("RearDeFroster");
			App.skillVoList.add(rearDefrosterSkill);
			
			SkillVO serpentineBeltSkill = new SkillVO();
			serpentineBeltSkill.setSkillId(4);
			serpentineBeltSkill.setSkillName("SerpentineBelt");
			App.skillVoList.add(serpentineBeltSkill);
			
			SkillVO carbCleaningSkill = new SkillVO();
			carbCleaningSkill.setSkillId(5);
			carbCleaningSkill.setSkillName("CarburetorCleaning");
			App.skillVoList.add(carbCleaningSkill);
			
			SkillVO oilChangeSkill = new SkillVO();
			oilChangeSkill.setSkillId(6);
			oilChangeSkill.setSkillName("OilChanging");
			App.skillVoList.add(oilChangeSkill);
			
			SkillVO sparkPlugSkill = new SkillVO();
			sparkPlugSkill.setSkillId(7);
			sparkPlugSkill.setSkillName("SparkPlug");
			App.skillVoList.add(sparkPlugSkill);
			
			SkillVO timingBeltSkill = new SkillVO();
			timingBeltSkill.setSkillId(8);
			timingBeltSkill.setSkillName("TimingBelt");
			App.skillVoList.add(timingBeltSkill);
			
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
			return mechanicList;
		}
		
		public List<String> createIssueList() {
			List<String> issueList = new LinkedList<String>();
			issueList.add("EngineCleaning");
			issueList.add("JumpStarting");
			issueList.add("RearDeFroster");
			issueList.add("SerpentineBelt");
			issueList.add("CarburetorCleaning");
			issueList.add("OilChanging");
			issueList.add("SparkPlug");
			issueList.add("TimingBelt");
			return issueList;
		}
		
		public Map<String,SkillVO> issueSkillMap() {
			Map<String,SkillVO> issueSkillMap = new HashMap<String, SkillVO>();
			for(String issueStr : App.issueList) {
				for(SkillVO skillvo : App.skillVoList) {
					if(null !=  issueStr && !issueStr.isEmpty() && null != skillvo &&  null != skillvo.getSkillName() && !skillvo.getSkillName().isEmpty()) {
						if(issueStr.equalsIgnoreCase(skillvo.getSkillName())) {
							issueSkillMap.put(issueStr, skillvo);
						}
					}
				}
			}
			return issueSkillMap;
		}
}
