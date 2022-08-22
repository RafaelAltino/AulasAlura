
nome = 'Rafael'
idade = 25
# print(f'Meu nome é {nome} e eu tenho {idade} anos')

def saudacao():
    nome = input('Qual o seu nome? ')
    print(f'Olá {nome}')

#saudacao()

def dizer_nome(nomedapessoa):
    if nomedapessoa == 'Rafael':
        print(f'{nomedapessoa}, que nome bonito!')
    else:
        print(f'{nomedapessoa}, que nome feio!')

# nome = input('Qual seu nome? ')
# dizer_nome(nome)


def verificar_idade():
    idade = input('Qual sua idade? ')
    idade = int(idade)
    if idade >= 18:
        print('Pode dirigir')
    else:
        print('Não pode dirigir')

verificar_idade()
