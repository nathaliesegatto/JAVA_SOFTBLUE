package br.com.loucademia.domain.acesso;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.loucademia.domain.aluno.Aluno;

@Entity
@Table(name = "ENTRADAS_SAIDAS")
public class Acesso implements Serializable {

	@Id //Na entidade ESTRADAS_SAIDAS, o identificador é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ID será gerado automaticamente | colunas do tipo "Identity" onde valores são incrementados de 1 em 1
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@ManyToOne // Relacionamento de acessos com aluno (muitos acessos para 1 aluno)
	@JoinColumn(name = "ALUNO_ID", nullable = false)
	private Aluno aluno;
	
	@Column(name = "ENTRADA", nullable = false)
	private LocalDateTime entrada;
	
	@Column(name = "SAIDA", nullable = false)
	private LocalDateTime saida;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public LocalDateTime getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}
	public LocalDateTime getSaida() {
		return saida;
	}
	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}
	@Override
	public String toString() {
		return "Acesso [id=" + id + ", aluno=" + aluno + ", entrada=" + entrada + ", saida=" + saida + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acesso other = (Acesso) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
