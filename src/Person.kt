/**
 * Created by NamjinCho on 2017-07-12.
 */
class Person (firstName:String?,lastName:String?){
    private var firstName:String?
    private var lastName:String?
    private var age:Int=0
    constructor(age : Int) :this(null,null) {
        this.age = age
    }

    init {
        this.firstName = firstName
        this.lastName = lastName
        if(firstName!=null)
            println("Created Person Object name is $firstName $lastName")
    }
    public fun getFirstName():String?
    {
        return this.firstName
    }
    public fun getLastName():String?{
        return this.lastName
    }
    public fun getAge():Int{
        return this.age
    }
    public fun setFirstName(firstName:String){
        this.firstName = firstName
    }
    public fun setLastName(lastName:String){
        this.lastName = lastName
    }
    public fun setAge(age : Int){
        this.age = age
    }
}