package ifrn.pds.emprestimo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pds.testes.conta.ContaBancaria;

class EmprestimoTeste {

	@Test
	public void deveSimularValorDasParcelas() {
		Emprestimo emp = new Emprestimo(4000);
		try {
			emp.parcelas(4000);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao depositar: " + e.getMessage());
		}
	}

}
