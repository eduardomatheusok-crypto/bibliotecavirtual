package bibliotecavirtual;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sistemaslivros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    // todos os métodos da aplicação, post, map, put, delete
    // get - pegar dados  / lista
    // post - criar dados / cadastro
    // put - atualizar dados / atualizar e leitura
    // delete - deletar dados / deletar

    @GetMapping
    public List<LivroModel> listarLivro() {
        return livroService.listarLivro();
    }

    @PostMapping
    public LivroModel cadastrarLivro(@RequestBody LivroModel livro) {
        return livroService.cadastrarLivro(livro);
    }

    @PutMapping("/{id}/lido")
    public LivroModel leituraLivro(@PathVariable Long id) {
        return livroService.leituraLivro(id);
    }

    @PutMapping("/{id}")
    public LivroModel atualizarLivro(@PathVariable Long id, @RequestBody LivroModel atualizarDados) {
    return  livroService.atualizarLivro(atualizarDados,id);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
    }

}
