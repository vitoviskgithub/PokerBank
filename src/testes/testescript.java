
package testes;

import javax.script.*;
import java.util.HashMap;
import java.util.Map;

public class testescript {


    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");

        try {
            engine.put("aParam", 5);
            engine.put("bParam", 10);
            engine.eval( "function ola(a, b) { return a + b; }" );
            engine.eval("print('Resultado: '+ ola(aParam, bParam) )");
            engine.eval("var s = ola(aParam, bParam)");

            // create the engine and have it load your javascript
            Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);

            for ( String attr : bind.keySet() ) {
                System.out.println( attr );
            }


            @SuppressWarnings("rawtypes")
            Map m = new HashMap();
            m.put("c", 10);
            engine.put("m", m);

            engine.eval("var x = m.get('c');");
            System.out.println("Max num: " + engine.get("x"));

        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}

