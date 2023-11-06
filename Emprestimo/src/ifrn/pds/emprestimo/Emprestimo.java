package ifrn.pds.emprestimo;

public class Emprestimo {

	private int valorEmprestado;
		
	public Emprestimo(int valorEmprestado) {
		this.valorEmprestado = valorEmprestado;
	}

	public int getValorEmprestado() {
		return valorEmprestado;
	}

	public void setValorEmprestado(int valorEmprestado) {
		this.valorEmprestado = valorEmprestado;
	}
	
	public double parcelas(int valorEmprestado) {
		double valorParcela = 0;
		if(3000 <= valorEmprestado && valorEmprestado <= 8000) {
			valorParcela = valorEmprestado / 12;
		} else if(8000 < valorEmprestado && valorEmprestado <= 25000){
			valorParcela = valorEmprestado / 36;
		}else if(25000 < valorEmprestado && valorEmprestado <= 50000){
			valorParcela = valorEmprestado / 60;
		}else if(50000 < valorEmprestado && valorEmprestado <= 150000){
			valorParcela = valorEmprestado / 120;
		}else {
			throw new IllegalArgumentException("Não existe emprestimos para esse valor");
		}
		return valorParcela;
		
	}
}