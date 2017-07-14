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
    var x:Int = 0
    var n:Int = 4
    for(x in 1..n)
        print("num : $x \n")
    println("final : $x")
    print("")
    //Any type 도 있음
    var furit = listOf("apple","orange","pineapple","banana","avocado")
    //filter 된 얘들만 남고, 남은 애들을 소팅함.
    furit.filter{it.startsWith("a")}.sortedBy{it}.map{it.toUpperCase()}.forEach{println(it)}
    var numbers = ArrayList<Int>()

    for(x in 1..10)
        numbers.add(x)
    numbers.filter{it < 5}.sortedByDescending {it}.forEach{println("ArrayList Sorted By Desc $it")}
    var byteV = 0b1000_1000
    var intV:Int = byteV
    println("type Casting : $intV")

    var c : Char = '5'
    if(c in '1'..'5')
        println("1 .. 5 value is ${c.toInt() - 48}")
    if( !(c in '1'..'3'))
        println("1 .. 3 value is ${c.toDouble().toInt() - 48.toDouble().toInt()}")
    var arrays = Array(10,{i -> i.toInt()})

    for(x in 0..9)
        arrays[x] = x
    var arrayCopy:Array<Int> = arrays.filter{it >3 }.sortedBy{it}.toTypedArray()
    // 저장하지 않으면 저장 안됌.
    for(x in 0..(arrayCopy.size-1))
        print("copied : ${arrayCopy[x]}")

    for(x in 0..(arrays.size-1))
    println("\noriginal : ${arrays.get(x)}")

    var rawString = """"안녕하세요"
"반가워요"
"꺄아아악"
"""
    print(rawString)
    x = 77
    var res = when(x){
        in 90..100 -> "A"
        in 80..99 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
    println(res)

    var person:Person = Person("Namjin","Cho")
    person.setAge(25)
    println("I create ${person.getFirstName()} ${person.getLastName()} and age is ${person.getAge()}")
    var person2:Person = Person(26)
    person2.setFirstName("Chiyoon")
    person2.setLastName("Song")
    println("I create ${person2.getFirstName()} ${person2.getLastName()} and age is ${person2.getAge()}")

    var aa:AA = AA(1)
    var bb:BB = BB(2)
    aa.print()
    bb.print()
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
            is Double -> "Double"
            is String -> "String"
            else -> "Unknown"
        }
fun parseInt(str:String):Int?{
    return str.toInt()
}

open class AA(x:Int){
    init {
        println("AA is Created ${x}")
    }
    open fun print(){
        print("printed in AA")
    }
}
class BB(x:Int) : AA(x){
    var str:String="AA"
        get()
        {
            return field
        }

    init{
        println("BB is created ${x}")
    }
    override fun print()
    {
        print("printed in BB")
    }
}
