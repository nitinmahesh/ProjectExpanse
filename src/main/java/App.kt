

fun main (args:Array<String>){
    println("Begin!")

    var x = 2
    val name = "Expanse"
    if (x > 2){
        println("Values is greater than 2.")
    } else if (x < 2){
        println("value is less than 2.")
    } else {
        println("Value is 2.")
    }

    x = x*10
    println("value of x is $x.")

//    $name = $name+"Project"

    println(name+"Project")
    for (i in 1..10){
        println("value of i is $i.")
    }

    while (x<30){
        println("value of x is $x.")
        x++
    }

    var x1: Short=6
    var x2: Byte=4
    var x3=10
    var y = x+1

    println("$x1 $x2 $x3 $y")

    var z: Long = x.toLong()
    println("$z")

    var xLong: Long = 42L
    var yFromLong = xLong.toInt()

    print("$xLong $yFromLong")

}