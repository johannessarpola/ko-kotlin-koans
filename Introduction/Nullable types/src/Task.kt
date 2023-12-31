fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    if(message != null && client?.personalInfo?.email != null) {
        val email = client?.personalInfo?.email
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
