public class PerfilAdapter extends Perfil{


    @Override
    public int getTipoUsuario() {
        return super.getTipoUsuario();
    }

    @Override
    public void setTipoUsuario(int tipoUsuario) {
        super.setTipoUsuario(tipoUsuario);
    }

    public void retornaValor(int tipoUsuario){

        if(tipoUsuario==1){
            System.out.println("Gratuito   BD:Paradox");
        }else{
            if(tipoUsuario==2){
                System.out.println("Basico   BD:Firebird");
            }else{
                if(tipoUsuario==3){
                    System.out.println("Ultimate   BD:MySql");
                }
            }
        }
    }
}
