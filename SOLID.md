# SOLID

## O que é um princípio

Um princípio possui regras, leis e aplicações. No mundo da programação, um princípio é entendido como uma regra que precisa ser entendida, pois servirá de base para aplicação em vários cenários.

## Origem do SOLID

SOLID é um princípio que contribui para o aproveitamento da orientação a objeto quando utilizada enquanto paradigma de um software.

# S - Single Responsibility Principle
_Príncipio da Responsabilidade Única_

Uma classe deve ter somente uma razão para ser alterada.
Uma classe deve ter apenas um objetivo, uma responsabilidade.

- Não ter métodos que não fazem parte da sua razão/significado
- Quebrar classe

# O - Open/Closed Principle
_Princípio Aberto/Fechado_

- Uma classe deve ser aberta para extensão e fechada para modificação.

- Pode ser aplicado através de herança ou interface

# L - Liskov Substitution Principle 
_Princípio da Segregação de Interfaces_

- Uma classe derivável pode, e deve, ser substituível por sua classe base
- Programação orientada à interface

# I - Interface Segregation Principle 
_Princípio da Segregação de Interfaces_

- Quebrar interfaces com muitos métodos em interfaces menores

# D - Dependency Inversion Principle
_Princípio da Inversão de Dependência_

- Os módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações e estas não devem depender de detalhes
    - Módulo de alto nível: regra de negócio, objetivo, abstrato (O QUE)
    - Módulo de baixo nível: tarefas internas, como CRUD, acesso ao banco de dados, autenticação (COMO)
