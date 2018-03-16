package br.com.proj.teste;
import br.com.proj.entidade.Pessoa;
import br.com.proj.entidade.PessoaFisica;
	
public class Teste {

	
	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("André");
		p1.setTelefone("16 8787 6565");
		p1.setIdade(35);
		p1.setSalario(1500);
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Bruna");
		p2.setTelefone("16 7474 8989");
		p2.setIdade(20);
		p2.setSalario(1000);
		
		//Teste de inclusão de consulta das informações:
		PessoaFisica pf = new PessoaFisica();
		
		p1.setSalario(pf.gerarAumento(p1));
		p2.setSalario(pf.gerarAumento(p2));
		
		pf.add(p1);
		pf.add(p2);
		
		
		
		for (Pessoa pessoaFisica : pf.getAll()) {
			
			System.out.println("Nome: "+ pessoaFisica.getNome());
			System.out.println("Telefone: "+ pessoaFisica.getTelefone());
			System.out.println("Idade: "+ pessoaFisica.getIdade());
			System.out.println("Salario: "+ pessoaFisica.getSalario());
			System.out.println("Cidade: "+ pessoaFisica.getCidade());
			System.out.println("Endereço: "+ pessoaFisica.getEndereco());
			System.out.println("Estado: "+ pessoaFisica.getEstado());
			System.out.println("Nome da Mãe: "+ pessoaFisica.getNomeMae());
			System.out.println("Nome do Pai: "+ pessoaFisica.getNomePai());
			
		}
		
		
	}
}
