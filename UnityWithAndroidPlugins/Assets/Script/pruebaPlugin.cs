using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class pruebaPlugin : MonoBehaviour
{

    private AndroidJavaObject androidJO;

    public string nombre, contrasena;
    public int puntuacion;
    public bool nuevoUsuario;


    // Start is called before the first frame update
    void Start()
    {
        androidJO = new AndroidJavaObject("com.example.unitylibrarytest.UnityGetData");

        androidJO.Call("PluginPost", nombre, contrasena, puntuacion, nuevoUsuario);
    }

}
