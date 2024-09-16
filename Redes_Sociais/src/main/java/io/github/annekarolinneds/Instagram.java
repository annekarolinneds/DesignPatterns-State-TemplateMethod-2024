package io.github.annekarolinneds;

public class Instagram  extends Meta{

    Instagram(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        System.out.println("Bem vindo(a) - Instagram");
        return true;
    }

    @Override
    public boolean sendMsg(String msg) {
        System.out.println("Post Feito - Instagram: " + msg);
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Até logo "+username+"!");
        System.out.println("Agradecemos sua visita, volte sempre! ");
    }
}
