
package Model;


public class Tutor extends Usuario {
    
    private int cod_tutor;

    public Tutor(int cod_tutor, String nome, String email, String telefone, String endereco, String cpf, String senha, String tipo_usuario) {
        super(nome, email, telefone, endereco, cpf, senha, tipo_usuario);
        this.cod_tutor = cod_tutor;
    }

    public int getCod_tutor() {
        return cod_tutor;
    }

    public void setCod_tutor(int cod_tutor) {
        this.cod_tutor = cod_tutor;
    }
}