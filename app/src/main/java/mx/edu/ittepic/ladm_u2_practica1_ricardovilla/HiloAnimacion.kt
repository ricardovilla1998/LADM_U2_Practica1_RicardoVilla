package mx.edu.ittepic.ladm_u2_ejercicio5canvasanimado

import mx.edu.ittepic.ladm_u2_practica1_ricardovilla.MainActivity

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        sleep(3000)
        while(true){
            sleep(5)
            puntero.runOnUiThread {
                puntero.miLienzo!!.caenCopos()
                if(puntero.miLienzo!!.ultimoCopo.y >=puntero.miLienzo!!.height){
                    sleep(1000)
                    puntero.miLienzo!!.reiniciar()
                }
            }
        }
    }
}