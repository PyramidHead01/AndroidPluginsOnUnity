using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class pruebaPlugin : MonoBehaviour
{

    private AndroidJavaObject androidJO;

    // Start is called before the first frame update
    void Start()
    {
        androidJO = new AndroidJavaObject("com.example.unitylibrarytest.UnityGetData");

        androidJO.Call("GetVariable", "Juan", "Pae", 43);
    }

}
