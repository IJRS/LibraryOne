package mx.sicar.libsuma;

import android.util.Log;

/**
 * Created by israel on 8/13/18.
 */

public class Suma {

    public Suma() {
        // Required empty public constructor
    }
    public int sumarNumero(int numA, int numB){
        int res = numA + numB;
        return  res;
    }

    public int prueba(){

        return 10;
    }

    public void mensaje(){
        Log.e("EL mensaje es ", "Que esta genial");
    }
}

