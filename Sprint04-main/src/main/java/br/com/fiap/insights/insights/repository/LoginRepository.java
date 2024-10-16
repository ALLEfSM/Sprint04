package br.com.fiap.insights.insights.repository;

import br.com.fiap.insights.insights.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    List<Login> findByUsername(String username);
}
