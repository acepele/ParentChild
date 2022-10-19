fun main(args: Array<String>) {

    print("Enter if you have a commercial or residential property: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

    val person1 = Commercial("ABC", "Jack")
    person1.calculate()

    val person2 = Residential("5%", "Christiano")
    person2.calculate()

}