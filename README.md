
# Persistência de Dados com Room

App de simulação um e-commerce de produtos naturais

## 🔨 Funcionalidades do projeto

O projeto permite cadastrar, alterar e remover produtos com imagem, nome, descrição e valor. Os produtos salvos são apresentados em uma lista e podem ser visualizados ao realizar o clique.

- Inserindo

![inserindo produto](https://user-images.githubusercontent.com/8989346/133252744-e6201160-1d51-47c2-8192-d602be1bfd80.gif)


- Alterando

![alterando produto](https://user-images.githubusercontent.com/8989346/133252749-eecdb640-1a11-422b-99e2-57347b765918.gif)

- Removendo

![removendo produto](https://user-images.githubusercontent.com/8989346/133252742-90509b74-e6df-4a47-bc2f-0208a0977d92.gif)

## 🎯 Desafios

### Menu de popup

Menu de popup ao clicar e pressionar um item da lista de produtos.

![demonstração desafio popup](https://user-images.githubusercontent.com/8989346/143617874-c55ec2fb-fe56-4f0c-866c-af9bd3a1827b.gif)


### Ordenação de produtos

Menus de opções para ordenar produtos por nome, descrição ou valor. 

![demonstração do desafio de ordenação de produtos](https://user-images.githubusercontent.com/8989346/137913949-2bed58cc-c9c5-4444-a4a3-6e1fcf94938d.gif)


## ✔️ Técnicas e tecnologias utilizadas

- `Jetpack Room`: lib para persistência de dados em banco de dados interno com SQLite
- `Entidade`: definição da tabela que será criada no banco de dados
- `DAO`: definição dos comportamentos com o banco de dados
  - **comportamentos definidos**: inserção, alteração, remoção e consultas de todos os registros e com filtro
- `Database`: configuração para criar a conexão com o banco de dados
- `conversor de tipo`: converter um tipo complexo para um tipo compatível com o SQLite
- `Menu de opções`: menu para editar e remover
- `Extras`: técnica para enviar e receber informações entre Activities
- `inicialização lateinit e lazy`: técnicas para criar propriedades em Activities que não podem ser inicializadas na construção da Activity

## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

Open an Existing Project (ou alguma opção similar)
Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
Por fim clique em OK
O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆
