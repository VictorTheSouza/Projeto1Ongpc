
public class PessoaF�sica {
	
	private long CPF;
	private String Doa��o;
	private int QuanDoa��o;
	
	
	
	
	public PessoaF�sica(long cPF, String doa��o, int quanDoa��o) {
		CPF = cPF;
		Doa��o = doa��o;
		QuanDoa��o = quanDoa��o;
		
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public String getDoa��o() {
		return Doa��o;
	}
	public void setDoa��o(String doa��o) {
		Doa��o = doa��o;
	}
	public int getQuanDoa��o() {
		return QuanDoa��o;
	}
	public void setQuanDoa��o(int quanDoa��o) {
		QuanDoa��o = quanDoa��o;
	}
	
	public void Pessoaprint() {
		System.out.println("Esse � o CPF: " + this.CPF);
		System.out.println("A Doa��o feita: " + this.Doa��o);
		System.out.println("A quantidade de itens doados �: " + this.QuanDoa��o );
	}
	
	
	
	

}
