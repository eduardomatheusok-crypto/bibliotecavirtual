package bibliotecavirtual;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    public final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    // cadastrar, listar, alterar dados, deletar, lido

    public LivroModel cadastrarLivro(LivroModel livro) {
        return repository.save(livro);
    }

    public List<LivroModel> listarLivro() {
        return repository.findAll();
    }

    public LivroModel leituraLivro(Long id) {
        LivroModel livro = repository.findById(id).orElseThrow();
        livro.setLido(true);
        return repository.save(livro);
    }

    public LivroModel atualizarLivro(LivroModel atualizarDados, Long id) {
        LivroModel livro = repository.findById(id).orElseThrow();

        livro.setTitulo(atualizarDados.getTitulo());
        livro.setAno(atualizarDados.getAno());
        livro.setAutor(atualizarDados.getAutor());
        livro.setLido(atualizarDados.isLido()); //para lombok getter é is

        return  repository.save(livro);
    }

    public void deletarLivro(Long id) {
        repository.deleteById(id);
    }
}
