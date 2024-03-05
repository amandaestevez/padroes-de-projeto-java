/**
 * Pacote base do projeto, contendo classes relacionadas ao padrão de projeto Singleton.
 */
package padroes-de-projeto-java;

/**
 * Classe que implementa o padrão "Singleton Eager".
 * 
 * A instância única da classe é criada imediatamente na declaração da variável estática `instancia`.
 * 
 * @author amandaestevez 
 */
public class SingletonEager {

    /**
     * Referência privada e estática para a instância única da classe.
     * 
     * A instância é criada imediatamente, assim que a classe é carregada pela JVM.
     */
	private static SingletonEager instancia = new SingletonEager();
	
	/**
	 * Construtor privado para evitar a instanciação direta da classe.
	 * 
	 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
	 */
	private SingletonEager() {
		super();
	}
	
	/**
	 * Método público estático que retorna a instância única da classe.
	 * 
	 * Como a instância já foi criada na declaração da variável `instancia`, este método apenas a retorna.
	 * 
	 * @return A instância única da classe SingletonEager.
	 */
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
