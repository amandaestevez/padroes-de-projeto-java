/**
 * Classe que implementa o padrão Singleton "Lazy Holder".
 * 
 * A instância única da classe é criada somente quando o método `getInstancia` é chamado pela primeira vez.
 * 
 * Esta implementação utiliza a técnica "Holder" para garantir a inicialização lazy da instância.
 * 
 * @author amandaestevez
*/

public class SingletonLazyHolder {
/**
* Classe interna estática aninhada que encapsula a instância única da classe SingletonLazyHolder.
* A classe interna é estática para garantir que a instância seja criada apenas uma vez, 
* mesmo que a classe externa seja instanciada várias vezes.
*/

    private static class InstanceHolder {
		/** A instância única da classe SingletonLazyHolder. 
		 * É inicializada apenas quando a classe interna InstanceHolder é carregada pela JVM.
		 */
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	/**
	 * Construtor privado para evitar a instanciação direta da classe.
	 * 
	 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
	 */
	private SingletonLazyHolder() {
		super();
	}
	
	/**
	 * Método público estático que retorna a instância única da classe.
	 * 
	 * Se a instância ainda não foi criada (`instancia == null`), o método a cria utilizando a classe interna InstanceHolder.
	 * 
	 * Em qualquer caso, o método retorna a instância existente.
	 * 
	 * retorna A instância única da classe SingletonLazyHolder.
	 */
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
