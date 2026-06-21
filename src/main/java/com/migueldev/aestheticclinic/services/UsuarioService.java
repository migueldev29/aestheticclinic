package com.migueldev.aestheticclinic.services;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.migueldev.aestheticclinic.models.Usuario;
import com.migueldev.aestheticclinic.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }
    
    @Transactional
    public Usuario create(Usuario obj){
        obj.setId(null); // Garantir que o ID seja nulo para criação
        obj.setDataCadastro(LocalDateTime.now());
        obj.setAtivo(true);
        return usuarioRepository.save(obj);
    }

    @Transactional
    public Usuario update(Usuario obj){
        Usuario existingUsuario = findById(obj.getId());
        existingUsuario.setNome(obj.getNome());
        existingUsuario.setEmail(obj.getEmail());
        existingUsuario.setCpf(obj.getCpf());
        existingUsuario.setTelefone(obj.getTelefone());
        existingUsuario.setEndereco(obj.getEndereco());
        return usuarioRepository.save(existingUsuario);
    }

    @Transactional
    public void disable(Long id) {
        Usuario existingUsuario = findById(id);
        existingUsuario.setAtivo(false); // Desativa o usuário em vez de deletar
        usuarioRepository.save(existingUsuario);
    }

    public Usuario fromDTO(Usuario objDto) {
        return new Usuario(
            objDto.getId(),
            objDto.getNome(),
            objDto.getCpf(),
            objDto.getDataNascimento(),
            objDto.getSexo(),
            objDto.getTelefone(),
            objDto.getEmail(),
            objDto.getEndereco(),
            objDto.getDataCadastro(),
            objDto.getAtivo()
        );
    }
}
