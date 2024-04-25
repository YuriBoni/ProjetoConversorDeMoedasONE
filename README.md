# ProjetoConversorDeMoedasONE

Breve descrição: Primeiro projeto com interação de API em java.

# Objetivos:

Treinar o uso da linguagem java e leitura via API.

Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

# Classes:

Principal.Principal : Tem objetivo de rodar o código que será exposto no console, executando as outras classes de maneira encapsulada( do jeito que consegui rs ).

Modulo.Menu : Apenas armazena as duas opções de Menu a serem mostradas. Uma de primeiro uso com Boas vindas e outra de repetição.
Modulo.LeitorApi : Classe do tipo record, apenas para fazer a leitura dos campos que me interessam na API.

Modulo.Moeda : ( Acho que deveria ter escrito ela no plural "Moedas" rs ) Essa classe recebe os dados da leitorApi.

Api.Convector: Classe responsavel por fazer a conexão com a API e mostrar a conversão que ja vem da API de acordo com a opção selecionada no Menu.

# Considerações finais: 

O projeto está funcional, mas tem algumas limitações específicas que não consegui tratar , por exemplo: valores na casa os bilhões, não são aceitos na api. Mas considero um ótimo exercicio para iniciantes como eu. Espero que gostem do meu projeto e seguiremos mais a frente com ONE.
