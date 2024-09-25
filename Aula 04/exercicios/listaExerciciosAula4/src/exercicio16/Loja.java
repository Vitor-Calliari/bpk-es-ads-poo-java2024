package exercicio16;

public class Loja {

        private String nome;
        private String endereco;
        private String telefone;
        private boolean aberta;

        public Loja(String nome, String endereco, String telefone) {
            this.setNome(nome);
            this.setEndereco(endereco);
            this.setTelefone(telefone);
            this.aberta = false;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio.");
            }
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            if (endereco == null || endereco.isEmpty()) {
                throw new IllegalArgumentException("Endereço não pode ser vazio.");
            }
            this.endereco = endereco;
        }

        // Getter para o telefone (somente leitura)
        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void abrirLoja() {
            if (!aberta) {
                aberta = true;
                System.out.println("A loja foi aberta.");
            } else {
                System.out.println("A loja já está aberta.");
            }
        }

        public void fecharLoja() {
            if (aberta) {
                aberta = false;
                System.out.println("A loja foi fechada.");
            } else {
                System.out.println("A loja já está fechada.");
            }
        }

        public boolean isAberta() {
            return aberta;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("Loja está " + (aberta ? "aberta" : "fechada"));
        }
}

