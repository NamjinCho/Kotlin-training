/**
 * Created by NamjinCho on 2017-07-14.
 */
data class Node(var index:Int,var value:Int,var next:Node?,var previous:Node?)
class Stack<T>{

    var idx:Int = -1
    var datas:ArrayList<T> = ArrayList()
    var size:Int=0

    fun pop():T?
    {
        if(idx==-1)
            return null

        size--
        var data:T = datas.get(idx)
        datas.removeAt(idx)
        idx--
        return data

        //return result;
    }
    fun push(data:T){
        idx++
        datas.add(data)
        size++
    }
    fun isEmpty():Boolean{
        var result:Boolean=false
        if(size==0)
            result=true
        return result
    }
    fun hasNext():Boolean{
        var result:Boolean = true
        if(idx==-1)
            result= false
        return result
    }
}