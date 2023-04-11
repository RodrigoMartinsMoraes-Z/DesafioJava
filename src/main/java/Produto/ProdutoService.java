package Produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	@Autowired
	private IProdutoRepository produtoRepository;

	public List<ProdutoEntity> listarProdutos() {
		return produtoRepository.findAll();
	}

	public ProdutoEntity criarProduto(ProdutoEntity produto) {
		return produtoRepository.save(produto);
	}

}
