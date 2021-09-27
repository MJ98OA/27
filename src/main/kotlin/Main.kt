import javax.print.attribute.IntegerSyntax

fun main(){

    //bucle repeat
    //it en este caso sera cada uno de los valores que va tomando en la ejecucion
    //se le puede dar un numbre al it
    var p=0;
    var v=0;
    println("Introduce el numero de pisos: ")
    p= readLine()!!.toInt()
    println("Introduce el numero de ventanas: ")
    v= readLine()!!.toInt()
    print(crearRascacielos(p,v))

    


}
fun crearRascacielos(numeroPisos:Int, numeroVentanas:Int){
    repeat(numeroPisos){position ->
        print("|")
        repeat(numeroVentanas){position ->
            print("_▋_")
        }
        println("|")
    }

}