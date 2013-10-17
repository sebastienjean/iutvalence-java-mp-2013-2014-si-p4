package fr.iutvalence.java.mp.hanged;

// TODO (fix) this class is useless, it is not part of the model but of a particular HMI
public class Rules
{
    /**
     * This is the rules of the game which is printed at the begining of the game
     */
    private String rule;
    
    /**
     * This method print the rules of the game
     */
    public Rules() {
        System.out.println("Le but du jeu LE PENDU est de deviner un mot pris aléatoirement dans une liste de mots.\n\n"
                + "Les règles du jeu sont les suivantes :\n"
                + "   - Vous avez un score de 1 000 points au début de la partie !\n"
                + "   - Vous devez taper une lettre !\n"
                + "\t --> A chaque fois que la lettre ne se trouve pas dans le mot, vous perdez un certain nombre de points...!\n"
                + "\t     Et le pendu se dessine petit à petit ! Attention, vous n'avez le droit qu'à 9 erreurs ! Au-delà, vous"
                + "avez perdu la partie !\n\n"
                + "\t --> Si la lettre est bonne, elle s'affiche dans le mot caché !!!\n\n"
                + "La perte de point se fait comme suit :\n"
                + "\t 1 erreur --> - 10 points\n"
                + "\t 2 erreurs --> - 25 points\n"
                + "\t 3 erreurs --> - 50 points\n"
                + "\t 4 erreurs --> - 75 points\n"
                + "\t 5 erreurs --> - 100 points\n"
                + "\t 6 erreurs --> - 150 points\n"
                + "\t 7 erreurs --> - 200 points\n"
                + "\t 8 erreurs --> - 250 points\n"
                + "\t 9 erreurs --> - 500 points\n"
                + "\t 10 erreurs --> La partie est finie !\n");
    }
}





