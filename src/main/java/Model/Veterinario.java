
package Model;


public class Veterinario extends Usuario {
    
    private String crm;

    public Veterinario(String nome, String cpf, String senha, String tipo_usuario) {
        super(nome, cpf, senha, tipo_usuario);
    }
    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    
}
