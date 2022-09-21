import pyautogui
from time import sleep

#1 - clicar e digitar meu ususário
pyautogui.click(1279,542,duration=0.5)
pyautogui.write('Arthur')
#2 - clicar e digitar minha senha
pyautogui.click(1279,568,duration=0.5)
pyautogui.write('1234')
#3 - clicar em "Entrar"
pyautogui.click(1181,598,duration=0.5)
#4 - Extrair cada produto
with open('produtos.txt', 'r') as arquivo:
    for linha in arquivo:
        produto = linha.split(",")[0]
        quantidade = linha.split(",")[1]
        preco = linha.split(",")[2]
#   1 - clicar e digitar produto
    pyautogui.click(990,527,duration=0.5)
    pyautogui.write(produto)
#   2 - clicar e digitar quantidade
    pyautogui.click(989,556,duration=0.5)
    pyautogui.write(quantidade)
#   3 - clicar e digitar preco
    pyautogui.click(989,580,duration=0.5)
    pyautogui.write(preco)
#   4 - clicar em registrar
    pyautogui.click(909,734,duration=0.5)
    sleep(0.5)