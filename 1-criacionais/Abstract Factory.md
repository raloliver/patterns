# Abstract Factory #01

**Problema**: como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? **Abstract Factory**
Solução: **extrair a lógica de criação dos objetos para um Abstract Factory**

**Problema**: como garantir que um conjunto de objetos relacionados (ou dependentes) possam ser criados mantendo o contexto único? **Abstract Factory**
Solução: **criar uma implementação do Abstract Factory para cada contexto. Garantindo que todos os objetos estejam relacionados.**

![Abstract Factory (solução)](https://m0w0rg.dm.files.1drv.com/y4mAZblKLzA9JVJoEzn_xmf87qRL2Wvl5d46t8tgH2N6k1TSW3uZZSv68ITyJnK7JS8qzaN7iZipnJKacw7OBjluFa6wBb8u0G7jnsFc80P0MaQHe5_601zx_ntqTArkul8TtrX0fSMXWllSyiy_MvJ9RHmBWyl3mZajGwtxYSpsiFUyyiM4RKYoBOof1zrFbXEwkxbz8g-di2uocnZUnn3xA/Abstract%20Factory%20-%20Solu%C3%A7%C3%A3o.png?psid=1 "Abstract Factory (solução)")

> Abstract Factory: prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. 
>
> > GOF

De certa forma existe uma DI no pattern AF (em boa parte dos casos, os patterns se complementam).

![Abstract Factory (diagrama de classes)](https://nkw0rg.dm.files.1drv.com/y4mquao695-7022kssRHLGWxSUIl8-f5dof02lwPX2WiEf1AQqvbDPVU5XrJDyekbx3V9fSg4xL4hWszwrY0bXaa6HDHWo7hkGQGvIxumvPFInN9_CLBth1XswCg-ayN3thoNEwSsY54JC1YLvRDDhEgHJ-b2z4CXBbvIDKo9ex3ygvn8cJww1P4EJucx5vlM677qq4cpOkMOhSgCN8zXbByg/Abstract%20Factory%20-%20Diagrama%20de%20Classe.png?psid=1 "Abstract Factory (diagrama de classes)")

![Abstract Factory - Diagrama de Classe (details)](https://nuw0rg.dm.files.1drv.com/y4mjY44N2LgnCxEG3k0xstFlyrJwvS7wA23RCX_IWJp7sN04oWUVUWEeuQ2xsjyg9CCuWVckzy9kIGdWcy5VG2j_H0H0fiO0Y_NKWqXckDeZjMb-y8njiEKXgivvvwq_mZpQf98POQxp6DWb2sZsrBIa-64TKFB0c6_B7oZGv3PQeOXTeLIHTZ4xI_i7opqT-HU9Xkkx7Puw2V4RtOmB_rbAA/Abstract%20Factory%20-%20Diagrama%20de%20Classe%20%28details%29.png?psid=1 "Abstract Factory - Diagrama de Classe (details)")

![Abstract Factory (IPhone Example)](https://mew0rg.dm.files.1drv.com/y4mxEMFpQYmdjytp-ztmpCQL3Vf5K--aMs2nG67y7y8eD33oH5zksfIz4J3bAH17xJsFkHSjKtSRscKauWg8zL-Z3vTfaCNmsGRwDc_NAM8HvHPcBfHj-i1S5nQ2Tt1ykXPMsiHq977NP0p3af6BUVNpSm56BCdofbA5wjvo-d512N-_JAxvX7NGc8cEhgin9p-2En6Pts4dSyc-qXgWV9mLg/Abstract%20Factory%20%28IPhone%20Example%29.png?psid=1 "Abstract Factory (IPhone Example)")


**Ao imaginar "família de objetos" você vai lembrar de Abstract Factory.**