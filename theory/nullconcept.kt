fun main() {
    var number: Int? = 10
    println(number)
    
    number = null
    println(number)
}

/* While you should use nullable variables for variables that can carry null, you should use non-nullable variables for variables that can never carry null because the access of nullable variables requires more complex handling */
