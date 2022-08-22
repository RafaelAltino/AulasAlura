idades = [60, 28, 15, 50]

print(idades[:3])

def verificar_idades(pessoas):
    for idade in idades:
        if idade >= 18:
            print(f'{idade} anos, pode dirigir')
        else:
            print(f'{idade} anos, jovem demais para dirigir')

verificar_idades(idades)

permissoes = []
ages = [20, 14, 40]

def direcao(idades, permissoes):
    for idade in idades:
        if idade >= 18:
            permissoes.append(True)
        else:
            permissoes.append(False)

direcao(ages, permissoes)

for perm in permissoes:
    print(perm)