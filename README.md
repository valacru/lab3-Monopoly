# lab3-Monopoly
### Élèves : Crüll Loris, Lagier Elodie, Valvona Guillaume


Pour ce laboratoire nous avons tenté de reproduire ce que nous avons appris lors des laboratoires précédents, à savoir : 
1. Créer les tests avant d'implémenter les méthodes.
2. Se positionner sur une branche correspondante pour ne pas perdre notre travail.
3. Créer des issues pour organiser notre travail.
4. Ne jamais merge une pull request avant que Travis ne la valide.

Pour initialiser le board, nous avons pris le board de base du jeu pour placer les squares spéciales. 
Nous partons du principe que les joueurs peuvent avoir le même prénom, mais pas la même pièce.

1. Nous avons utilisé au moins une fois : (exemples)
a. @BeforeEach : PlayerTest
b. @ParameterizedTest : CupTest
c. @RepeatedTest : PlayerTest

2. Nous comptabilisons un minimum de 5 assertions différentes : (exemples)
a. assertEquals : PlayerTest
b. assertNotEquals : PlayerTest
c. assertTrue : PlayerTest
d. assertFalse : DieTest, CupTest
e. assertNotNull : MonopolyGameTest, BoardTest
f. assertSame : IncomeTaxeSquareTest
g. assertIterableEquals : BoardTest
