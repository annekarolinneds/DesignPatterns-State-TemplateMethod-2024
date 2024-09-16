package io.github.annekarolinneds;

public abstract class Meta {
    public String username;
    public String password;

    public boolean post (String msg){
        //1 - Login na ede sociall
        //2 - Publicação da msg
        //3 - Logout
        if(login(this.username,this.password)){
            boolean result = sendMsg(msg);
            logout();
            return result;
        }
        return false;
    }

    public abstract boolean login(String username, String password);
    public abstract boolean sendMsg(String msg);
    public abstract void logout();

}
