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

public class Belgium {

	public Belgium() {
		// TODO Auto-generated constructor stub
	}
	public void calculateBelTax() {

		try {	
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer(); 
			KieSessionConfiguration sessionConfiguration = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
			KieSession kSession1 = kContainer.newKieSession("ksession-rule",sessionConfiguration);	
			EuroCountry item1 = new EuroCountry();
			item1.setPurchaseCountry(Country.Belgium);
			item1.setTypeofItem(Type.MEDICINES);
			item1.setSellPrice(new BigDecimal(10));
			kSession1.insert(item1);

			EuroCountry item2 = new EuroCountry();
			item2.setPurchaseCountry(Country.Belgium);
			item2.setTypeofItem(Type.GROCERIES);
			item2.setSellPrice(new BigDecimal(10));
			kSession1.insert(item2);

			kSession1.fireAllRules();

			System.out.println("Tax percentage for medicines in " +item1.getPurchaseCountry().toString()   + " " 
					+ item1.getLocalTax().intValue());

			System.out.println("Tax percentage for groceries in " +item2.getPurchaseCountry().toString()   + " " 
					+ item2.getLocalTax().intValue());
			kSession1.dispose();
		}
		catch (Throwable t1) {
			t1.printStackTrace();
		}
	}
}