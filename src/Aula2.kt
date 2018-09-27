import javax.swing.JOptionPane

fun main(args: Array<String>) {
    var name = JOptionPane.showInputDialog("Qual seu nome?")
    var balance = JOptionPane.showInputDialog("Informe seu saldo").toDouble()

    do {
        var action = JOptionPane.showInputDialog("O que você gostaria de fazer? \n1 - Sacar\n2 - Ver saldo\n3 - Depositar\n4 - Sair").toInt()
        when (action) {
            1 -> {
                var cash_out = JOptionPane.showInputDialog("Informe o valor").toDouble()
                if (cash_out > balance) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente!")
                } else {
                    balance -= cash_out
                }
            }
            2 -> {
                JOptionPane.showMessageDialog(null, "Cliente: $name\nSaldo R$: $balance")
            }
            3 -> {
                var cash = JOptionPane.showInputDialog("Informe o valor do depósito").toDouble()
                balance += cash
                JOptionPane.showMessageDialog(null, "Seu novo saldo é: R$ $balance")
            }
            4 -> {
                JOptionPane.showMessageDialog(null, "Obrigado por usar nossos serviços!")
            }
        }
    } while (action != 4)
}