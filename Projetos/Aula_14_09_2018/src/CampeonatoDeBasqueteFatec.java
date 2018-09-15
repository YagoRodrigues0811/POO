
public class CampeonatoDeBasqueteFatec {
	
	public void inscricao(Cestinha c){
		c.arremessaNoGarrafao();
		c.arremessaDaLinhaDeTres();
		//
		c.drible();
		c.passe();
	}
	
	public static void main(String[] args) {
		EstudanteADS estAds =new EstudanteADS();
		EstudanteComex estComex = new EstudanteComex();
		EstudanteMaster estMaster = new EstudanteMaster();
		
		CampeonatoDeBasqueteFatec camp = new CampeonatoDeBasqueteFatec();
		camp.inscricao(estMaster);
	}
}
