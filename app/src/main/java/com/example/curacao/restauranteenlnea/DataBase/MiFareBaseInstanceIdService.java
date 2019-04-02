//Esta clase se encarga de enviar los mensajes
//Implementa la clase que se ejecuta cuando nos asignan un token
package com.example.curacao.restauranteenlnea.DataBase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MiFareBaseInstanceIdService extends FirebaseInstanceIdService {
    public static final String TAG = "Publicidad";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //Se accede al token
        String token = FirebaseInstanceId.getInstance().getToken();

        //Mostrar en consola la acción
        Log.d(TAG, "Token " + token);
    }
}

