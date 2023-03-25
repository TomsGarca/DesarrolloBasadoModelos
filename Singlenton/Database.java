public class Database {

    private boolean Conection;
    private static Database bad;


    private Database(){
        Conection = false;
    }

    static Database getInstance(){
        if(bad == null){
            if(bad == null){
                bad = new Database();
                System.out.println("BD creada");
            }
        }
        return bad;
    }

    public boolean theConection(){
    return Conection;
    }

    public void notConection(){
        if(!theConection()){
            Conection = true;
            System.out.println("La BD esta conectada");
        }
        else{
            System.out.println("La BD ya se encuentra conectada");

        }
    }

    public void deleteConection(){
        if(theConection()){
            Conection = false;
            System.out.println("La BD esta desconectada");
        }
        else{
          
            System.out.println("La BD ya se encuentra desconectada");

        }
        
    }
}
