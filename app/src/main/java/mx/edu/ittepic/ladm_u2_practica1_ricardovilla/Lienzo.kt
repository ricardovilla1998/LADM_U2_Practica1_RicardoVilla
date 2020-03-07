package mx.edu.ittepic.ladm_u2_practica1_ricardovilla

import android.view.View
import android.R.attr.y
import android.R.attr.x
import android.graphics.*
import android.graphics.Path.FillType
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import mx.edu.ittepic.ladm_u2_ejercicio5canvasanimado.FiguraGeometrica


class Lienzo (p:MainActivity) : View(p){
    var puntero = p
    var contador = 0
    val arreglo:Array<FiguraGeometrica> = Array(20,{ FiguraGeometrica((0..680).random()+5, (-1000..0).random(), 10) })
    val arregloEstrellas:Array<FiguraGeometrica> = Array(100,{ FiguraGeometrica(0, 10, 3) })
    var ultimoCopo = FiguraGeometrica((0..680).random(), -1100, 10)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        //RESOLUCIÓN DE 720 * 1080
        var p = Paint()
        var dis = 0
        var alt = 50
        var cont = 0

        //FONDO
        p.color = Color.rgb(12, 92, 133)
        c.drawRect(0f, 0f, 720f, 1280f, p)

        //ESTRELLAS

            (0..99).forEach {
                arregloEstrellas[it].x = dis.toFloat()
                arregloEstrellas[it].y = alt.toFloat()
                p.style = Paint.Style.FILL
                p.color = Color.YELLOW
                arregloEstrellas[it].pintar(c, p)
                dis += 100
                cont++
                if(cont == 9 ){
                    cont=0
                    alt+=80
                    dis = 0
                }

            }





        //NIEVE
        p.color = Color.WHITE
        c.drawRect(0f, 1100f, 720f, 720f, p)

        //CASA
        p.style = Paint.Style.FILL
        p.color = Color.rgb(202, 149, 104)
        c.drawRect(320f, 580f, 580f, 780f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawRect(320f, 580f, 580f, 780f, p)

        //p.strokeWidth = 10f



        //CHIMENEA
        p.style = Paint.Style.FILL
        p.color = Color.GRAY
        c.drawRect(550f, 420f, 600f, 600f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawRect(550f, 420f, 600f, 600f, p)

        //HUMO
        p.style = Paint.Style.FILL
        p.color = Color.LTGRAY
        c.drawCircle(580f, 400f, 15f, p)
        c.drawCircle(590f, 390f, 15f, p)
        c.drawCircle(600f, 380f, 15f, p)
        c.drawCircle(610f, 370f, 15f, p)



        //TRIANGULO
        var path = Path();
        path.moveTo(260f, 600f)
        path.lineTo(640f, 600f)
        path.lineTo(450f, 420f)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(116, 58, 9)
        c.drawPath(path, p)
        path.lineTo(255f, 600f)
        path.lineTo(640f, 600f)
        path.lineTo(450f, 420f)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f





        //CONTORNO
        p.color = Color.BLACK
        c.drawPath(path, p);


        //PUERTA
        p.style = Paint.Style.FILL
        p.color = Color.rgb(116, 58, 9)
        c.drawRect(420f, 680f, 480f, 780f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawRect(420f, 680f, 480f, 780f, p)

        //VENTANA
        p.style = Paint.Style.FILL
        p.color = Color.rgb(174, 242, 249)
        c.drawCircle(370f, 660f, 30f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(370f, 660f, 30f, p)

        //TRONCO
        p.style = Paint.Style.FILL
        p.color = Color.rgb(116, 58, 9)
        c.drawRect(100f, 650f, 130f, 780f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawRect(100f, 650f, 130f, 780f, p)

        //HOJAS
        p.style = Paint.Style.FILL
        p.color = Color.rgb(27, 164, 15)
        c.drawCircle(112f, 650f, 60f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(112f, 650f, 60f, p)

        p.style = Paint.Style.FILL
        p.color = Color.rgb(27, 164, 15)
        c.drawCircle(112f, 590f, 60f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(112f, 590f, 60f, p)




        //LUNA
        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        c.drawCircle(700f, 60f, 80f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(700f, 60f, 80f, p)


        //NUBES
        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        c.drawCircle(90f, 180f, 50f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(90f, 180f, 50f, p)

        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        c.drawCircle(140f,140f,50f,p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(140f,140f,50f,p)

        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        c.drawCircle(140f,190f,50f,p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(140f,190f,50f,p)

        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        c.drawCircle(190f, 170f, 50f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(190f, 170f, 50f, p)

        //COPOS

        (0..19).forEach {
            p.style = Paint.Style.FILL
            p.color = Color.WHITE
            arreglo[it].pintar(c, p)
            p.style = Paint.Style.STROKE
            p.color = Color.BLACK
            p.strokeWidth = 5f
            arreglo[it].pintar(c, p)
        }
        p.style = Paint.Style.FILL
        p.color = Color.WHITE
        ultimoCopo.pintar(c, p)
        p.style = Paint.Style.STROKE
        p.color = Color.BLACK
        p.strokeWidth = 5f
        ultimoCopo.pintar(c, p)






    }

    fun caenCopos() {
          arreglo[contador].y+=5
            contador++
            if(contador==20){
                ultimoCopo.y+=5
                contador=0

            }

            invalidate()

    }

    fun reiniciar(){
        (0..19).forEach {

            arreglo[it].x = (0..680).random().toFloat()
            arreglo[it].y = (-1000..0).random().toFloat()
        }
       ultimoCopo.y = -1100f
    }
}