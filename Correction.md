# Correction (8,75/10)

## Dockerfile (4/4)
Nickel !

## Commentaire dockerfile (2/3)
- Tu ne justifies pas pourquoi tu utilises ce tag d'image. Il faut expliquer pourquoi tu utilises cette image et pas une autre (pourquoi cette version de JAVA, pourquoi une slim et pas une autre, pourquoi une basée sur ubuntu et pas alpine par exemple ?)
- En ce qui concerne le commentaire pour l'instruction CMD, ça n'autorise pas le lancement du jeu. Ça lance le jeu au moment où tu build l'image.

## README (2,75/3)
Très bien, il juste faut que tu mets les commandes dans des blocs de code pour que ce soit plus lisible et non en titre. Les titres doivent permettre de savoir ce que tu vas faire dans la section qui suit.
