package factory;

public class GetFactoryInstance {
	
	public FactoryClass getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
