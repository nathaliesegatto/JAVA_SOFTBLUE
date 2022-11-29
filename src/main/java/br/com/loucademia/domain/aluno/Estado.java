package br.com.loucademia.domain.aluno;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO") // A JPA vai gerar o banco de dados - mapeia a classe Estado para uma tabela chamada "ESTADO". Se o nome não for definio usará o memso da classe.
public class Estado implements Serializable {
	
	@Id  //Na entidade estado, o identificador é a sigla
	@Column(name = "SIGLA", nullable = false, length = 2)  // informações sobre como essa coluna da sigla ficará no banco
	private String sigla;
	
	@Column(name = "NOME", nullable = false, length = 30)
	private String nome;
	
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Estado [sigla=" + sigla + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(sigla, other.sigla);
	}
	
	
}
