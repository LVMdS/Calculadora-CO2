fun main() {
    // Constantes
    val fatorEmissao: Double = 0.475 // kg CO₂ por kWh

    // Entrada do usuário
    print("Digite o consumo de energia em kWh: ")
    val consumoEnergia = readLine()?.toDoubleOrNull()

    if (consumoEnergia != null) {
        // Cálculo da pegada de carbono
        val pegadaCarbono = consumoEnergia * fatorEmissao
        println("A pegada de carbono associada ao consumo de $consumoEnergia kWh de eletricidade é de $pegadaCarbono kg CO₂.")
    } else {
        println("Entrada inválida. Por favor, insira um número válido para o consumo de energia.")
    }
}
