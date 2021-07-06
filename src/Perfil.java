public class Perfil {

    private int tipoUsuario;

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }




    public static void main(String[] args) {


        PerfilAdapter user1 = new PerfilAdapter();

        user1.retornaValor(3);
    }
}
