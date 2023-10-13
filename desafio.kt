/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, var formacao: Formacao) {
    fun getNome() : Usuario {
        println( "\n\nNome do usúario: " + nome)
        return this
    } 
    
    fun getFormacao() : Usuario {
        formacao.conteudos.map { println( "\nConteúdo: " + it.nome.toString() + "\nCarga Horária: " + it.duracao.toString() + "\n") }
        return this
    }
    
    fun getAllData() : Usuario {
        for(i in 0 .. 10) {
			print("-----")
        }
        getNome()
        getFormacao()
        for(i in 0 .. 10) {
			print("-----")
        }
        return this
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        	inscritos.add(usuario);
        	println("\n *** MATRICULA REALIZADA COM SUCESSO!!! *** \n")
    }    
}

fun main() {
    
    var formacoes = mutableListOf<Formacao>()
    var conteudosEduc = mutableListOf<ConteudoEducacional>()
    var usuarios = mutableListOf<Usuario>()
    
	conteudosEduc.add(ConteudoEducacional("Design de software", 10, Nivel.INTERMEDIARIO))
	conteudosEduc.add(ConteudoEducacional("Gestão da informação", 40, Nivel.BASICO))
    conteudosEduc.add(ConteudoEducacional("Engenharia de software", 20, Nivel.DIFICIL))
    conteudosEduc.add(ConteudoEducacional("Design Gráfico", 180, Nivel.INTERMEDIARIO))
        
    val nomesUsers = arrayListOf("Juliano", "Andre", "Adriano")
    val conteudosUsers = arrayListOf(1, 4, 3)
    
    for(i in 0 .. (nomesUsers.size - 1)) {
        var conteudosOfUser = mutableListOf<ConteudoEducacional>()

        for (i in 0 .. (conteudosUsers.get(i) - 1)) {
            conteudosOfUser.add(conteudosEduc.get(i))
        }
        
        var nameOfUser = nomesUsers.get(i)
        
        val form = Formacao( nameOfUser, conteudosOfUser)
		formacoes.add(form)
    }
    
    for(i in 0 .. (formacoes.size - 1)) {

        var user = Usuario(formacoes.get(i).nome, formacoes.get(i))
		usuarios.add(user)
        usuarios[i].getAllData()
    	
        formacoes[i].matricular(usuarios[i])
    }
    
}
