package io.github.annekarolinneds;

public class Threads extends Meta{
    Threads(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        System.out.println("Bem vindo(a) - Threads");
        return true;
    }

    @Override
    public boolean sendMsg(String msg) {
        System.out.println("Post Feito - Threads: " + msg);
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Até logo "+username+"!");
        System.out.println("Agradecemos sua visita, volte sempre! ");
    }
}
