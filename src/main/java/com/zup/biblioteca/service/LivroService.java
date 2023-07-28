package com.zup.biblioteca.service;

import com.zup.biblioteca.model.LivroModel;
import com.zup.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public List<LivroModel> getAllLivros() {
        return livroRepository.findAll();
    }

    public LivroModel getLivroById(Long id) {
        return livroRepository.findById(id).orElseThrow();
    }

    public LivroModel createLivro(LivroModel livro) {
        return livroRepository.save(livro);
    }

    public LivroModel updateLivro(LivroModel livro) {
        return livroRepository.save(livro);
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
