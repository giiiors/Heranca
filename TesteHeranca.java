package heranca;

public class TesteHeranca {
	public static void main (String args[])

	{
			
			Cavalo meuCavalo = new Cavalo();
			meuCavalo.getNome = "Cavalo Bojack";
			meuCavalo.getIdade = "15";
			meuCavalo.correr = "Cavalo correndo...";
			meuCavalo.getSom = "ihi";
			System.out.println(meuCavalo.getNome);
			System.out.println(meuCavalo.getIdade + " anos" );
			System.out.println(meuCavalo.correr);
			System.out.println(meuCavalo.getSom);
								
			Cachorro meuCachorro = new Cachorro();
			meuCachorro.getNome = "\nCachorro Dog";
			meuCachorro.getIdade = "10";
			meuCachorro.getCorrer =	("Cachorro correndo...");
			meuCachorro.getSom = "au au";
			System.out.println(meuCachorro.getNome);
			System.out.println(meuCachorro.getIdade + " anos");
			System.out.println(meuCachorro.getSom);
			System.out.println(meuCachorro.getCorrer);
			
			
			
			
		}
	
	
}
