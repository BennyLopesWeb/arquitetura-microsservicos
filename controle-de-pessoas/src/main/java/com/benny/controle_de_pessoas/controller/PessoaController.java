
package com.benny.controle_de_pessoas.controller;

import com.benny.controle_de_pessoas.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lopes
 */

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @GetMapping
    public List<Pessoa> obterTodos() {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();

        p1.setNome("João");
        p1.setEmail("joao@gmail.com");
        p1.setTelefone("48 9 99047789");
        pessoas.add(p1);

        Pessoa p2 = new Pessoa();

        p2.setNome("Pedro");
        p2.setEmail("pedro@gmail.com");
        p2.setTelefone("48 9 88545121");
        pessoas.add(p2);

        return pessoas;
    }

}
