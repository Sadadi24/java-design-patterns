package fr.diginamic.singleton;

public class testSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = ConfigurationSingleton.getinstance().getValeur("db.url");
		System.out.println(url);

	}

}
