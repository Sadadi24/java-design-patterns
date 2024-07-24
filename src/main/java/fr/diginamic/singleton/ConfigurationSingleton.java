package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ConfigurationSingleton {
	private static ConfigurationSingleton singleton = new ConfigurationSingleton();
	private HashMap<String,String> cache = new HashMap();
	private ConfigurationSingleton() {
		ResourceBundle fichier = ResourceBundle.getBundle("configuration");
		for(String key : fichier.keySet()) {
			cache.put(key, fichier.getString(key));
		}
			
			
		}
	public static  ConfigurationSingleton getinstance() {
		
		return singleton;
	}
	public String getValeur(String key) {
		return cache.get(key);
	}
	

}
