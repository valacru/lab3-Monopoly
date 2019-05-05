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
1.1. @BeforeEach : PlayerTest
1.2. @ParameterizedTest : CupTest
1.3. @RepeatedTest : PlayerTest

2. Nous comptabilisons un minimum de 5 assertions différentes : (exemples)
2.1. assertEquals : PlayerTest
2.2. assertNotEquals : PlayerTest
2.3. assertTrue : PlayerTest
2.4. assertFalse : DieTest, CupTest
2.5. assertNotNull : MonopolyGameTest, BoardTest
2.6. assertSame : IncomeTaxeSquareTest
2.7. assertIterableEquals : BoardTest
