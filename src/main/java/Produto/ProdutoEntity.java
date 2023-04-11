package Produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProdutoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String Descricao;

	@Column(nullable = false)
	private Date Cadastro;

	@Column(nullable = false)
	private Date Validade;

	@Column(nullable = false)
	private Double Preco;

	@Column(nullable = false)
	private boolean Ativo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getCadastro() {
		return Cadastro;
	}

	public void setCadastro(Date cadastro) {
		Cadastro = cadastro;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public Date getValidade() {
		return Validade;
	}

	public void setValidade(Date validade) {
		Validade = validade;
	}

	public boolean isAtivo() {
		return Ativo;
	}

	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

}
