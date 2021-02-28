package br.com.cwi.reset.exemploreset;

import org.springframework.web.bind.annotation.*;

@RestController
    public class NomeController {
        private static String nome = "Joseane";

        @GetMapping("/nome")
        public String nome() {
            return nome;
        }

        @PutMapping("/{nome}")
        public String mudarNome(@PathVariable("nome") String novoNome) {
            this.nome = novoNome;
            return this.nome;
        }

        @DeleteMapping("/nome")
        public void deletaNome() {
            this.nome = null;

        }
    }

