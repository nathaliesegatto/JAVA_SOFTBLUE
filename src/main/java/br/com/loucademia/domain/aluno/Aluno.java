package br.com.loucademia.domain.aluno;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Sexo {
		Masculino, Feminino;
	}
	
	public enum Situacao {
		Ativo, Inativo, Pendente;
	}
	
	@Id
	@Column(name = "ID", nullable = false, length = 8)
	private String matricula;
	
	@Column(name = "NOME", nullable = false, length = 64)
	private String nome;
	
	@Enumerated  // Quando não defino nada, usa números (ordinal) >>> @Enumerated(EnumType.ORDINAL) - 0-Masculino / 1-Feminino
	@Column(name = "SEXO", nullable = false, length = 1)
	private Sexo sexo;
	
	@Column(name = "RG", nullable = false, length = 10)
	private Integer rg;
	
	@Column(name = "NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;
	
	@Enumerated // Quando não defino nada, usa números (ordinal) >>> @Enumerated(EnumType.ORDINAL) - 0-Ativo / 1-Inativo / 2-Pendente
	@Column (name = "SITUACAO", nullable = false, length = 1)
	private Situacao situacao;
	
	@Column (name = "EMAIL", nullable = true, length = 64)
	private String email;
	
	@Embedded // A JPA entende que o endereço faz parte da entidade aluno, vão compartilhar o mesmo ID
	private Endereco endereco = new Endereco();
	
	@Embedded // A JPA entende que o telefone faz parte da entidade aluno, vão compartilhar o mesmo ID
	private Telefone telefone = new Telefone();
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", rg=" + rg
				+ ", dataNascimento=" + dataNascimento + ", situacao=" + situacao + ", email=" + email + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
}
