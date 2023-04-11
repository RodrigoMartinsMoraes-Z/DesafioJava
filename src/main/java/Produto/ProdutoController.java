package Produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<ProdutoEntity> listarProdutos() {
		return produtoService.listarProdutos();
	}

	@PostMapping
	public ProdutoEntity criarProduto(@RequestBody ProdutoEntity produto) {
		return produtoService.criarProduto(produto);
	}

}
