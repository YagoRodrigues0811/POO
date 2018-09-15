
public class Testes {
	public static void main(String[] args) {
		EstudanteADS estAds = new EstudanteADS();
		EstudanteComex estComex = new EstudanteComex();
		EstudanteMaster estMaster = new EstudanteMaster();
		
		CampeonatoDeBasqueteFatec camp = new CampeonatoDeBasqueteFatec(); 
		camp.inscricao(estMaster);
		
		InterFatec inter = new InterFatec();
		inter.inscricao(estAds);
				
	}

}
