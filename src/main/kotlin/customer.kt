/**
 *
 * Class Customer
 * @author Aljeda Cepele
 * date: 10/18/2022
 *
 * @param
 * customerName describes the name of the customer
 * customerPhone gives the phone nr of the customer
 * customerAddress gives the address of the customer
 *
 */






open class Customer (customerName: String,
                     customerPhone: String,
                     customerAddress: String,
                     squareFootage: Double) {

    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }


    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
    }
