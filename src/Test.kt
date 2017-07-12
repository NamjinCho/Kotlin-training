/**
 * Created by NamjinCho on 2017-07-11.
 */

import javafx.beans.binding.When
import java.util.*;

fun main(args: Array<String>) {
    print("Hello World!\n");
    var a =1
    var str = "a is $a" // 이렇게 표현 가능함

    a = 2
    var s2 = "${str.replace("is","was")},but a is $a"
    print("$s2\n")
    a = 3
    var b = 4

    print("a 와 b 의 최댓값은 ${max(a,b)}\n") // 함수 값은 ${함수} 이렇게 스트링 안에 넣을수 있어서 편함
    // 변수 타입 뒤에? 붙이면 null 값이 올 수있음
    var str3 = "1"
    var str4 = "4"
    var str5 = "5"

    print("multiply sucess ${stringToIntMultiply(str3,str4)}\n")
    println("multiply fail ${stringToIntMultiply(str4,str5)}")
    var t1:Long =1
    var t2:String ="2"
    var t3:Long = 3
    var t4:Double = 4.4
    var t5 ="Hello"
    print("when Test : ${whenTest(t1)}\n${whenTest(t2)}\n${whenTest(t3)}\n${whenTest(t4)}\n${whenTest(t5)}\n")
    print("")
    //Any type 도 있음


}
fun max(a:Int,b:Int):Int{
    if(a>b)
        return a
    else
        return b
}
fun max2(a:Int,b:Int) = if(a>b) a else b

fun stringToIntMultiply(str1:String,str2:String):Int?{ // null값이 올 수 있음
    var x1:Int? = parseInt(str1)
    var x2:Int? = parseInt(str2)

    if(x1!=null && x2!=null)
        return x1*x2
    else
        return null
}

fun whenTest(obj:Any):String=
        when(obj){
            1 -> "One" // 숫자는 아마도 자동으로 Int 형으로 받는듯
            "Hello" -> "Greeting"
            is Long -> "Variable is Long"
            !is String -> "Not a String"
            else -> "Unknown"
        }
fun parseInt(str:String):Int?{
    return str.toInt()
}