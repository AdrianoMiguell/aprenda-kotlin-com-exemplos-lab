/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
   
    var cont = arrayOf("Contabilidade", "Matematica", "Engenharia de software")
    print(cont[0])
    
    var formacoes = mutableListOf<Formacao>()
    var conteudosEduc = mutableListOf<ConteudoEducacional>()
    var usuarios = mutableListOf<Usuario>()
    
	conteudosEduc.add(ConteudoEducacional("Design de software", 10))
	conteudosEduc.add(ConteudoEducacional("Gestão da informação", 40))
    conteudosEduc.add(ConteudoEducacional("Engenharia de software", 20))
    conteudosEduc.add(ConteudoEducacional("Design Gráfico", 180))
    
    println(conteudosEduc)
    
    val contJuliano = listOf(conteudosEduc.get(1), conteudosEduc.get(2))
    val formJuliano = Formacao("Juliano", contJuliano)
	val contAndre = listOf(conteudosEduc.get(0), conteudosEduc.get(2))
    val formAndre = Formacao("Andre", contAndre)

    val userJuliano = Usuario()
    println(formJuliano.nome)
    println(formJuliano.conteudos[0].nome)
    formacoes.add(formJuliano)
    formacoes.add(formAndre)
    
    print(formacoes)
    
//     println(formJuliano)
    
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

