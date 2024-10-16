package br.com.fiap.insights.insights.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="LOGIN")
public class Login  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="login_id")
    private Long id;

    @NotBlank
    @Size(min=3)
    @Column(name="username")
    private String username;

    @NotBlank
    @Column(name="password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
}
