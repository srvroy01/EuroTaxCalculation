package com.sample.service;

import java.math.BigDecimal;
import org.drools.core.impl.KnowledgeBaseFactory;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import com.sample.model.EuroCountry;
import com.sample.model.EuroCountry.Country;
import com.sample.model.EuroCountry.Type;

public class Germany {

	public Germany() {
		// TODO Auto-generated constructor stub
	}
	public void calculateGermanTax() {

		try {

			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer(); 
			//KieBase kBase1 = kContainer.getKieBase();
			KieSessionConfiguration sessionConfiguration = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
			KieSession kSession2 = kContainer.newKieSession("ksession-rule",sessionConfiguration);	
			EuroCountry item3 = new EuroCountry();
			item3.setPurchaseCountry(Country.Germany);
			item3.setTypeofItem(Type.MEDICINES);
			item3.setSellPrice(new BigDecimal(10));

			kSession2.insert(item3);

			EuroCountry item4 = new EuroCountry();
			item4.setPurchaseCountry(Country.Germany);
			item4.setTypeofItem(Type.GROCERIES);
			item4.setSellPrice(new BigDecimal(10));
			kSession2.insert(item4);

			kSession2.fireAllRules();

			System.out.println("Tax percentage for medicines in " +item3.getPurchaseCountry().toString()   + " " 
					+ item3.getLocalTax().intValue());

			System.out.println("Tax percentage for groceries in " +item4.getPurchaseCountry().toString()   + " " 
					+ item4.getLocalTax().intValue());
			
			kSession2.dispose();

		}
		catch (Throwable t2) {
			t2.printStackTrace();
		}


	}
}

