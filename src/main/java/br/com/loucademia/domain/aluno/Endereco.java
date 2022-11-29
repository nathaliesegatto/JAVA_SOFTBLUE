 package br.com.loucademia.domain.aluno;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

@Embeddable // Endereço não é uma entidade porque não tem ID, vai compartilhar ID com classe "Aluno"
public class Endereco implements Serializable {
	
	@Column(name = "RUA", nullable = false, length = 128)
	private String Rua;
	
	@Column(name = "NUMERO", nullable = true, length = 6)
	private Integer numero;
	
	@Column(name = "COMPLEMENTO", nullable = true, length = 32)
	private String complemento;
	
	@Column(name = "CIDADE", nullable = false, length = 64)
	private String cidade;
	
	@ManyToOne // Relacionamento de endereço com estado (muitos endereços para 1 estado)
	@JoinColumn(name = "ESTADO_ID", nullable = false)
	private Estado estado = new Estado();
	
	@Column(name = "CEP", nullable = false, length = 8)
	private Integer cep;
	
	
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco [Rua=" + Rua + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade
				+ ", estado=" + estado + ", cep=" + cep + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Rua, cep, cidade, complemento, estado, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(Rua, other.Rua) && Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(estado, other.estado)
				&& Objects.equals(numero, other.numero);
	}
	
	
}
