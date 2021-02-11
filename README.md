# AndroidPluginsOnUnity

Esto es un codigo para aprender como instalar plugins de android en unity

Para que sirve?
  Si quieres alguna interaccion entre unity y android, como por ejemplo que active una actividad de android cuando pulsamos un boton en unity necesitas usar un plugin de android
  
 Que recomiendo para entender bien como hacerlo? 
 
  https://www.youtube.com/watch?v=EElBAGkjPt4&ab_channel=RyanZehm
  
  Es bastante largo pero a mi me funciono este
 
Codigo que estaria guay tener a mano:

  En el glade de la libreria de android, arriba de dependences pero dentro de la clave
  
    afterEvaluate{
        assembleDebug.finalizedBy(exportJar)
    }
  
  Debajo de dependences (las partes donde hay una ruta son distintas en cada PC)

    task exportJar(type: Copy){
        from('build/intermediates/aar_main_jar/debug/classes.jar')
        into('../../../AndroidPluginsOnUnity/UnityWithAndroidPlugins/Assets/Plugins/Android')
        rename('classes.jar', 'PruebaPlugin.jar')
    }

    task deleteOldJar(type: Delete){
        delete '../../../AndroidPluginsOnUnity/UnityWithAndroidPlugins/Assets/Plugins/Android/PruebaPlugin.jar'
    }
    exportJar.dependsOn(deleteOldJar)
    
  El codigo de unity:
    
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
    
    
 
  NOTA:
    Durante el proceso hubo dos fallos grandes, el primero es que habia una clase que me duplicaba las clases, pero con facil solucion buscandola y borrandola
    Otro fallo fue que usaba en algun punto un metodo deprecated llamado android.enableR8, lo solucione añadiendo en el glade de la libreria (no confundir con el glade normal) android.enableD8=true, aunque se podria haber arreglado con android.enableR8=false si no me equivoco
