// Importações das classes SingletonEager, SingletonLazy e SingletonLazyHolder para fazer o teste
import SingletonEager;
import SingletonLazy;
import SingletonLazyHolder;

package padroes-de-projeto-java;

/**
 * @author amandaestevez
 * 
 * Classe de teste para demonstrar o uso dos diferentes tipos de Singleton.
 * 
 */
public class Test {
    /**
     * A linha abaixo linha declara o método main como o ponto de entrada do programa. 
     * Ele é acessível publicamente, pertence à classe e não retorna nenhum valor. 
     * O String[] args permite o recebimento de argumentos de linha de comando.
     */

    public static void main(String[] args) {

        // Testando Singleton Lazy

        /**
         * Obtém a instância única do Singleton Lazy e a imprime no console.
         * 
         * Como o Singleton Lazy é inicializado preguiçosamente (lazy), a instância
         * será criada na primeira chamada ao método `getInstancia` criado dentro da classe Singleton Lazy.
         */
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy); // Imprime a referência da instância Lazy

        /**
         * Tenta obter a instância do Singleton Lazy novamente, mas como ela já 
         * foi criada anteriormente, o mesmo objeto será retornado.
         */
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy); // Imprime a referência (provavelmente a mesma) da instância Lazy

        // Testando Singleton Eager

        /**
         * Obtém a instância única do Singleton Eager e a imprime no console.
         * 
         * Como o Singleton Eager é inicializado imediatamente, a instância já 
         * estará criada na primeira chamada ao método `getInstancia`.
         */

        /**
         * O uso de 'SingletonEager eager' à esquerda do sinal de atribuição indica 
         * que a variável 'eager' é do tipo 'SingletonEager'
         */
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager); // Imprime a referência da instância Eager

        /**
         * Tenta obter a instância do Singleton Eager novamente, mas como ela já 
         * foi criada anteriormente, o mesmo objeto será retornado.
         */
        eager = SingletonEager.getInstancia();
        System.out.println(eager); // Imprime a referência (provavelmente a mesma) da instância Eager

        // Testando Singleton Lazy Holder

        /**
         * Obtém a instância única do Singleton Lazy Holder e a imprime no console.
         * 
         * Como o Singleton Lazy Holder utiliza a técnica "Holder" para 
         * inicialização lazy, a instância será criada na primeira chamada ao 
         * método `getInstancia` da classe interna `InstanceHolder`.
         */
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder); // Imprime a referência da instância LazyHolder

        /**
         * Tenta obter a instância do Singleton Lazy Holder novamente, mas como ela já 
         * foi criada anteriormente, o mesmo objeto será retornado.
         */
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder); // Imprime a referência (provavelmente a mesma) da instância LazyHolder
    }
}
