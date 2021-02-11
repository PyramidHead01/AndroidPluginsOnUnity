package com.example.unitylibrarytest;

import android.util.Log;

public class UnityGetData {

    /*
    private static Cliente cliente;
    private String servidor ="http://192.168.0.73:8000";
    private RequestQueue queue;
    private Cliente(Context context) {
        this.queue = Volley.newRequestQueue(context);
    }
     */

    public void PluginPost(String nombre, String contrasena, int puntuacion, boolean tipo){

        //Log.d("Informacion general", "El nombre es " + nombre + " con contraseña " + contrasena + " y " + puntuacion + "puntos");

        if(tipo)
            NuevoUsuario(nombre, contrasena, puntuacion);
        else
            NuevaPuntuacion(nombre, contrasena, puntuacion);
    }

    public void NuevoUsuario(String nombre, String contrasena, int puntuacion){

        /*
        JSONObject cuerpoPeticion = generarJson(nombre, contrasena, puntuacion, true);
        JsonObjectRequest nuevousuario = new JsonObjectRequest(
                Request.Method.POST,
                url + "/usuario",
                cuerpoPeticion,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("PETICION POST", "Completada con exito");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        Log.d("PETICION POST", "FATAL ERROR");
                    }
                }
        );
        this.queue.add(nuevousuario); */

    }

    public void NuevaPuntuacion(String nombre, String contrasena, int puntuacion){

        /*
        JSONObject cuerpoPeticion = generarJson(nombre, contrasena, puntuacion, false);
        JsonObjectRequest nuevapuntuacion = new JsonObjectRequest(
                Request.Method.POST,
                url + "/usuario/"+nombre,
                cuerpoPeticion,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("PETICION POST", "Completada con exito");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        Log.d("PETICION POST", "FATAL ERROR");
                    }
                }
        );
        this.queue.add(nuevapuntuacion); */
    }

    /*
        private JSONObject generarJson(String nombre, String contrasena, int puntuacion, boolean tipo) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("usuario", nombre);
            if(tipo)
                jsonObject.put("contrasena", contrasena);
            jsonObject.put("puntuacion", puntuacion);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
     */

}
