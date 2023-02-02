package CONTROL;

public class controlUrl {
      public void open(){
        try {
                   
//abrir pdf usando o Runtime e executando no PROMPT comando CMD
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + "cmd /c " + "start chrome http://localhost:8080/PokerBankWeb/index.html");
        } catch (Exception e) {
        }
    }
}
