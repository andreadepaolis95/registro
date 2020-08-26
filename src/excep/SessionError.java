package excep;

public class SessionError extends Exception{

     private final String message = "Something gone wrong, Try to login again :)";
     private final String link = "index.jsp";

     public SessionError(){
         super();
     }

     public String backToLogin(){
         return this.link;
     }

     @Override
    public String getMessage(){
         return this.message;
     }
}
