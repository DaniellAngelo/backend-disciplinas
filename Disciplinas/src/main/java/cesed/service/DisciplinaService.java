package cesed.service;

import cesed.entity.Disciplina;
import cesed.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public Disciplina salvar(Disciplina disciplina) {
        return repository.save(disciplina);
    }

    public List<Disciplina> listar() {
        return repository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}

