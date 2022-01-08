# Mājasdarbs

* Katras funkcionalitātes testu rakstīt savā klasē
```
Tests → LoginPageTests
Tests → CheckoutTests
utt.
```
* Katrai lapai vai sadaļai uztaisīt savu page object
* Funkcijas pēc iespējas apvienot Pageobject klasē, piemēram, kā `sauceLabsLoginPage.login("","asdasdasda");`

## Login
Jānotestē mājas lapa https://www.saucedemo.com/
1. Pārbaudīt login lapu
2. Pareizs login(pārbaudīt, ka lietotājs ir ielogojies)
3. Nepareizs login
        - Nav username
        - Nav password
        - Abi lauki tukši
        - Add to cart


> :warning: **Pirms testiem, kur jāpārbauda funckionalitāte ar addToCart,checkout vienmēr jānospiež RESET APP STATE**

## Add items to cart and checkout
1. Pievienot divas lietas groziņam
2. Pārbaudīt, ka grozā ir 2 lietas
        - gan ar ikonu, kur rakstīts 2
        - gan dodoties uz your cart lapu
3. Nospiest checkout
4. Ievadīt vārdu,uzvārdu,zipkodu
5. Nospiest finish
6. Pārbaudīt, ka order ir veiksmīgi apstiprināts
   7.Pārbaudīt tekstu "Thank you for your order"


