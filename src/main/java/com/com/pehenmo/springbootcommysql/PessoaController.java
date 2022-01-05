package com.com.pehenmo.springbootcommysql;

import com.com.pehenmo.springbootcommysql.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/pessoa")
public class PessoaController {

    @RequestMapping(value = "/nome-completo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa getNomePessoa(){
        Pessoa pessoa = new Pessoa(Integer.valueOf("1"),"Pedro", "pedro@gmail.com");
        return pessoa;
    }
}
