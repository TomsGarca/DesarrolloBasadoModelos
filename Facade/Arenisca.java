import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arenisca extends PaqueteDecoracion{
    @Override
    void darAcabado() {
        System.out.println("Material lajado!");
    }

    boolean solicitudAcabado(){

        String answer = respuestaUsuario();
        if(answer.toLowerCase().startsWith("s")){
            return true;
        }else {
            return false;
        }
    }
    private String respuestaUsuario(){
        String answer = null;
        System.out.println("¿Quieres darle acabado de lajado al material? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
