fun main(){
    printName( "effence")
    var result = recall(7,2)
    println(result)
    var sum = getSum(3,7,9,5,)
    println(sum)
    printFact( "nature")
}
fun printName(name: String){
    println("Hello" + " " + name)
}
fun recall(num1:Int, num2:Int):Int{
    var modulus = num2%num1
    return modulus
}
fun getSum(a:Int, b:Int,c:Int,d:Int):Int{
    var sum = a + b + c + d
    return sum
}
fun printFact(fact:String){
    println("I love" + " "+ fact)
}




