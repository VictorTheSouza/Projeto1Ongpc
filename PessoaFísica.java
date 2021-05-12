
public class PessoaFísica {
	
	private long CPF;
	private String Doação;
	private int QuanDoação;
	
	
	
	
	public PessoaFísica(long cPF, String doação, int quanDoação) {
		CPF = cPF;
		Doação = doação;
		QuanDoação = quanDoação;
		
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public String getDoação() {
		return Doação;
	}
	public void setDoação(String doação) {
		Doação = doação;
	}
	public int getQuanDoação() {
		return QuanDoação;
	}
	public void setQuanDoação(int quanDoação) {
		QuanDoação = quanDoação;
	}
	
	public void Pessoaprint() {
		System.out.println("Esse é o CPF: " + this.CPF);
		System.out.println("A Doação feita: " + this.Doação);
		System.out.println("A quantidade de itens doados é: " + this.QuanDoação );
	}
	
	
	
	

}
