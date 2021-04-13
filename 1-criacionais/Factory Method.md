# Factory Method #01

![Objetivos](https://i.imgur.com/T3qq7xw.png "Objetivos")

### Problemas X Solução

**Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface?**

Extrair a lógica de criação dos objetos para um Factory Method.

**Como deixar o meu código desaclopado das classes concretas?**

Invocar o FM (Factory Method) para recever uma instância qualquer que implement uma determinada interface.

> "Um padrão que defini uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permit a uma classe deferir a instanciação para subclasses."
>
> > GOF

# Factory Method #02

- A forma de organizar as fábricas depende de como você deseja organizar as instâncias dos objetos.
- Na prática, é possível ter uma fábrica que cria vários objetos

![Exemplo](https://i.imgur.com/1OBfxuf.png "Exemplo")

1. Interface: monstro
2. Classes: monstros(m1, m2, m3)
3. Factories: levels (l1, l2) que são quem criam as instâncias, tendo contato apenas com a interface

# Factory Method #03

![Sem FM](https://i.imgur.com/6yeoo7X.png "Sem FM")
![UML](https://i.imgur.com/D2eYqSh.png "UML")

> Teoria + Prática + Tempo (paciência de aprender): o segredo do sucesso de todo bom programador

# Factory Method #04

Uma factory para cada tipo de produto (para cada um dos objetos)
![Exemplo com FM mais complexo](https://i.imgur.com/W94u9Tg.png "Exemplo com FM mais complexo")
![UML com FM](https://i.imgur.com/F0RJ49c.png "UML com FM")

# Factory Method #05

Simple Factory: recebe argumentos atráves de um método, criado numa única classe que encapsula toda a complexidade.
A interface foi removida e criada apenas uma única classe que representa a fábrica.
![Simple Factory](https://i.imgur.com/dlcd83k.png "Simple Factory")
![UML com Simple Factory](https://i.imgur.com/3JtdUh2.png "UML com Simple Factory")

Você pode ter uma fábrica que cria todos os objetos concretos ou ter uma fábrica pra cada objeto concreto
![Factory Method Half Simple](https://i.imgur.com/4ODP6Wi.png "Factory Method Half Simple")

> A espaço pra qualquer um dos padrões, tudo depende do negócio da sua aplicação. Qual desses formatos se encaixam melhor para a resolução do problema?

![Database Factory Method](https://i.imgur.com/XRmz2dR.png "Database Factory Method")
