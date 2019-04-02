//Esta clase hereda de FirebaseMessagingService e implementa el método que
//se ejecuta cuando se recibe un mensaje onMessageReceived a donde llegan los mensajes
//que nos envian
package com.example.curacao.restauranteenlnea.DataBase;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MiFareBaseMessagingService extends FirebaseMessagingService {

    public static final String TAG = "Noticias";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        //Mostrar en consola la accion que se realiza
        String from = remoteMessage.getFrom();
        Log.d(TAG, "Mensaje recibido de: " + from);

        //Accede al contenido de la notificacion
        //Se hace la validacion para que no sea nulo
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Notificacion" + remoteMessage.getNotification().getBody());
        }
    }
}
