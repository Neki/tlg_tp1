
public class TestRArray {

    // Objectif de test : creation d'un RArray vide de capacite n strictement positive
    // Resultat attendu : RArray vide de capacite n cree
    public static void testInitVide() {
	RArray a = new RArray(10);
    }

    // Objectif : vider un RArray de taille non nulle
    // Résultat : RArray de taille nulle
    public static void testClear() {
        RArray a = new RArray(10);
        a.add("string");
        a.clear();
    }

    // Objectif : vérifier qu'un RArray contient un élément précédemment ajouté
    // Résultat : le RArray contient l'élement
    public static void testContains() {
        RArray a = new RArray(10);
        String s = "string";
        a.add(s);
        a.contains(s);
    }

    // Objectif : vérifier qu'un RArray vide ne contient pas d'élément
    // Résultat : le RArray ne contient pas l'élement
    public static void testEmptyNotContains() {
        RArray a = new RArray(10);
        String s = "string";
        a.contains(s);
    }

    // Objectif : vérifier qu'un RArray non vide ne contient pas d'élément non ajouté
    // Résultat : le RArray ne contient pas l'élement
    public static void testNotContains() {
        RArray a = new RArray(10);
        String s = "string";
        a.contains(s);
    }

    // Objectif : un tableau vide ne contient aucun élément
    // Résultat : le nombre d'élements dans un tableau vide est 0
    public static void testEmptyNbOcc() {
        RArray a = new RArray(10);
        a.nbOcc("string");
    }

    // Objectif : tester le nombre d'élements dans un tableau non vide
    // Résultat : le nombre d'élements dans un tableau est égal au nombre de fois où il a été ajouté
    public static void testNbOcc() {
        RArray a = new RArray(10);
        String s = "string";
        a.add(s);
        a.add("toto");
        a.nbOcc(s);
    }

    // Objectif : vérifier l'index d'un élément ajouté
    // Résultat : l'index d'un élément ajouté en deuxième est 2
    public static void testIndex() {
        RArray a = new RArray(10);
        String s = "string";
        a.add("toto");
        a.add(s);
        a.index(s);
    }

    // Objectif : vérifier l'index d'un élément qui n'appartient pas au tableau
    // Résultat : l'index d'un élément qui n'appartient pas au tableau est -1
    public static void testIndexNotInArray() {
        RArray a = new RArray(10);
        String s = "string";
        a.add("toto");
        a.add("tata");
        a.index(s);
    }

    // Objectif : tester le comportement de l'ajout d'un élément
    // Résultat : l'élément est ajouté à la fin et la taille est augmentée de 1
    public static void testAdd() {
        RArray a = new RArray(3);
        a.add("toto");
    }

    // Objectif : tester le redimensionnement après ajout
    // Résultat : les éléments sont ajoutés à la fin et le tableau est
    // redimensionné lorsqu'il n'y a plus de place
    public static void testAddAndResize() {
        RArray a = new RArray(1);
        a.add("toto");
        a.add("tata");
        a.add("titi");
    }

    // Objectif : tester le remplacement d'un élément à un index donné (valide)
    // Résultat : après remplacement, le nouvel élément se trouve à l'index 0
    public static void testReplace() {
        RArray a = new RArray(10);
        a.add("toto");
        a.add("tata");
        a.replace("titi", 0);
    }

    // Objectif : tester le comportement de replace() lorsqu'un index invalide est passé en paramètre
    // Résultat : replace renvoie null
    public static void testReplaceOutOfBounds() {
        RArray a = new RArray(10);
        a.add("toto");
        a.add("tata");
        a.replace("titi", 20);
    }


    // Objectif : tester le comportement de removeInd() lorsqu'un index invalide est passé en paramètre
    // Résultat : removeInd renvoie null
    public static void testRemoveInd() {
        RArray a = new RArray(10);
        a.add("toto");
        a.add("tata");
        a.add("titi");
        a.removeInd(1);
    }

    // Objectif : tester la suppression d'un élément à un indice donné
    // Résultat : l'élement à l'index 1 a été supprimé du tableau et les éléments d'indice supérieur ont été décalés d'un indice
    public static void testRemoveIndOutOfBounds() {
        RArray a = new RArray(10);
        a.add("toto");
        a.add("tata");
        a.add("titi");
        a.removeInd(20);
    }

    // Objectif : tester la suppression d'un élément appartenant au tableau
    // Résultat : toutes les occurences de l'objet ont été supprimées, les autres éléments sont toujours présents, et remove renvoie vrai
    public static void testRemove() {
        RArray a = new RArray(10);
        a.add("titi");
        a.add("toto");
        a.remove("titi");
    }

    // Objectif : tester la suppression d'un élément n'appartenant pas au tableau
    // Résultat : le tableau n'a pas été modifié et la méthode renvoie faux
    public static void testRemoveNonExistant() {
        RArray a = new RArray(10);
        a.add("toto");
        a.remove("titi");
    }

    public static void main(String[] args) {
        testInitVide();
        testClear();
        testContains();
        testNotContains();
        testEmptyNotContains();
        testEmptyNbOcc();
        testNbOcc();
        testIndex();
        testIndexNotInArray();
        testAdd();
        testAddAndResize();
        testReplace();
        testReplaceOutOfBounds();
        testRemoveInd();
	testRemoveIndOutOfBounds();
        testRemove();
        testRemoveNonExistant();
    }

}
