/**
 *@param
 * customerName describes the name of the customer
 * customerPhone gives the phone nr of the customer
 * customerAddress gives the address of the customer
 * squareFootage gives the square footage of customer's property

 * mods
 * AMC 10/18/2022 added function calculate() and need to be finished
 */







class Commercial(var propertyName: String,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage) {
/* ACMOB 10/18/2022 */
    fun calculate() {

    }
}

class Residential (var constantRate: String,
                   customerName: String,
                   customerPhone: String,
                   customerAddress: String,
                   squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage) {

    /* ACMOB 10/18/2022 */
    fun calculate() {

    }
}

