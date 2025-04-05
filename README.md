API REST com:
✔ Spring Boot
✔ Spring Data JPA
✔ Banco de dados H2
✔ Consultas personalizadas
✔ Lombok e Lazy/Eager Loading
✔ Logs de SQL no console

Proposta do projeto realizado: 
Crie uma nova entidade chamada Pessoa com os seguintes atributos:
• id: identificador único do produto (tipo Long)
• nome: nome do produto (tipo String)
• salario: preço do produto (tipo Double)
• Crie um repositório Spring Data JPA chamado PessoaRepository que estende a interface
JpaRepository.
• Este repositório deve ter:
• Um método de consulta que retorne todos as pessoas com salário maior do que um determinado valor. Este
método deve receber um parâmetro do tipo Double chamado salário e retornar uma lista de pessoas com
salário maior do que o valor informado.
• Um método de consulta que retorne todos as pessoas com salário menor ou igual do que um determinado
valor. Este método deve receber um parâmetro do tipo Double chamado salário e retornar uma lista de
pessoas em que o salário seja menor ou igual ao valor informado.
• Um método de consulta que retorne todos as pessoas que começam com um determinado nome. Este
método deve receber um parâmetro do tipo String chamado nome e retornar uma lista de pessoas em que o
nome começa com o nome informado.
• Crie um exemplo com 6 pessoas demonstrando que esses métodos funcionam. Pode ser no
próprio console.
