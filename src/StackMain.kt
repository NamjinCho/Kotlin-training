/**
 * Created by NamjinCho on 2017-07-14.
 */
fun main(args: Array<String>) {
    var stack:Stack<Node> = Stack()
    var arr:Array<Int> = arrayOf(7,8,10,5,3,6,5,4,15,22,31)

    var length:Int = arr.size

    for(x in 0..length-1)
    {
        var node:Node = Node(x,arr[x],null,null)
        stack.push(node)
    }
    if(stack.size==length)
        println("Push Sucess!")

    while(stack.hasNext()){
        var node:Node? =stack.pop()
        print("pop :${node?.value} \n")
    }


}