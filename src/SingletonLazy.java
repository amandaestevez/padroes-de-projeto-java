/**
 * Pacote base do projeto, contendo classes relacionadas ao padrão de projeto Singleton.
 */
package one.digitalinnovation.gof.singleton;

/**
 * Classe que implementa o padrão "Lazy Singleton".
 * 
 * A instância única da classe é criada somente quando o método "getInstancia" é chamado pela primeira vez.
 * 
 */
public class SingletonLazy {

    /**
     * Referência privada para a instância única da classe.
     * 
     * Inicialmente nula, pois a instanciação é adiada (lazy).
     */
	private static SingletonLazy instancia;
	
	/**
	 * Construtor privado para evitar a instanciação direta da classe.
	 * 
	 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
	 */
	private SingletonLazy() {
		super();
	}
	
	/**
	 * Método público estático que retorna a instância única da classe.
	 * 
	 * Se a instância ainda não foi criada (`instancia == null`), o método a cria utilizando o construtor privado.
	 * 
	 * Em qualquer caso, o método retorna a instância existente.
	 * 
	 * @return A instância única da classe SingletonLazy.
	 */
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
