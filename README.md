# java-security-jwt

## Criação de cadastro (Sign up)
Este endpoint deverá receber um usuário com os seguintes campos: nome, e-mail, senha e uma lista de objetos telefone. Seguem os modelos:
```
{
  "nome": "string",
  "email": "string",
  "senha": "senha",
  "telefones": [
    {
      "numero": "123456789",
      "ddd": "11"
    }
  ]
}
```
## Usar status codes de acordo
* Em caso de sucesso irá retornar um usuário mais os campos:
* id: id do usuário (pode ser o próprio gerado pelo banco, porém seria interessante se fosse um GUID)
* data_criacao: data da criação do usuário
* data_atualizacao: data da última atualização do usuário
* ultimo_login: data do último login (no caso da criação, será a mesma que a criação)
* token: token de acesso da API (pode ser um GUID ou um JWT)
* Caso o e-mail já exista, deverá retornar erro com a mensagem "E-mail já existente".
* O token deverá ser persistido junto com o usuário

## Requisitos
* Persitência de dados

## Requisitos desejáveis
* JWT como token
* Testes unitários
* Criptogafia não reversível (hash) na senha e no token
