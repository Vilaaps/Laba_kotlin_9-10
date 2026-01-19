package src.src.payment

sealed class PaymentResult {
    data class Success(val id: String)
}