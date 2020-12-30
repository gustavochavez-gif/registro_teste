# language:pt
@CT001
Funcionalidade: Realizar o cadastro do usuario no sistema

  Esquema do Cenário: Validar se o sistema está cadastrando o usuario com sucesso;
    Dado o click no botão Bank Manager Login;
    E clicar no botão Add customer;
    E preencher todos os campos: <name> <sobrename> <PostCode>;
    E clicar no botão Adicionar;
    Então verificar se usuario foi cadastrado no sistema;

    Exemplos: 
      | name        | sobrename  | PostCode    |
      | "Gustavo m" | "chavez b" | "72120-025" |
