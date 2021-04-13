# O que é Padrão de Projeto?

Problemas X Soluções propostas por Christopher Alexander (Arquiteto), livro "Uma Linguagem de Padrões".

> "Cada padrão descreve um problema que ocorre frequentemente em seu ambiente, e então descreve o cerne da solução para aquele problema, de um modo tal que você pode usar esta solução milhões de vezes, sem nunca fazer a mesma coisa repetida."
>
> > Christopher Alexander

- Não fique completamente engessado a implementação mais recomendada nos livros, exemplos "Factory Method" and "Simple Factory"
- Nem tudo é padrão
- Tenha cuidado ao uso excessivo de padrões
- Cuidado com o "over engineering" ou mesmo o "over patterned"

# Sugestão de Livros

- Head First Design Patterns
- Padrões de Projeto

![0](https://i.imgur.com/IVpNjxd.png)
![1](https://i.imgur.com/78llHPe.png)
![2](https://i.imgur.com/iO3cZPX.png)

# Entendendo os Diagramas

![Entendendo os Diagramas](https://i.imgur.com/oplINfN.png "Entendendo os Diagramas")

> Atenção a formatação e as cores no diagrama no exemplo acima.

- Abstração: classe abstrata (não é possível instâncias a mesma). Pode também ser uma interface.
- A seta da Classe para a Abstração (ponta com a seta branca): indica que a Classe implementa uma interface ou herda da mesma.
- Classes: possuem atributos que podem ser públicos ou privados.
- Métodos: podem ser públicas ou privadas, abstratos ou estáticos (ambos com o respectivo tipo).
- Seta tracejada numa única direção: quer dizer que a classe é utilizada pela origem da mesma.
- Seta reta com um losango na origem: atenção aos conceitos de composição e agregação.


