// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
    return customers.partition { customer ->
        val del: Int = customer.orders.count { it.isDelivered }
        val undel: Int = customer.orders.size - del
        undel > del
    }.first.toSet()
}
