## JOGO GOURMET

Criação do jogo usado o estrutura de dados em arvores.

Conceito de estrutra de dados -> é a forma como pensamos em guardar as informações e ter acesso a elas. 

Neste jogo foi usado arvore binaria que tem a raiz e duas ramificações... Direita e esquerda.

Sempre que receberes um novo valor, este será a raiz. 

Temos 4 classes que são:
`Node` - Que é a classe que terá o valor do tipo String, Esquerda e direita do mesmo tipo da classe.
`ArvoreBinaria` - Terá as funcionou principais como o metodo adicionar como o modificador publico que será visivel na outra classe. Ela permite adicionar novo valor e entro do metodo adicionar tem recursividade para facilitar a inserção de novos valores. 

Por exemplo quando adiciona, verifica se o primeiro node(pai) é null e criar esse novo node e adiciona ele como pai e dois vai seguindo se tem esscolha ou não... Se tem escolha é direita se não é o node da esquerda. É o mesmo que listas ligadas... a unica diferença é que só vai pra esquerda e direita.
`Jogo` - A classe que permite executar o jogo.

No metodo `inicializarOJogoComQuestao` o jogo começa com os pratos padrao como "Massa", "Lasanha", "Bolo" como passa foi preenchido primeiro é a raiz ou pai. Sempre o jogo começar será o primeiro. Isso vali funcionar da seguinte forma.

		Massa
		  |
Escolheu SIM	  | Escolheu NAO
LASANHA 	    BOLO
	|		|
SIM	| NAO     SIM  |  NAO
		ACERTO	| PERGUNTA O PRATO
ACERTO | PERGUNTA O PRATO

INICIA O JOGO NOVAMENTE
