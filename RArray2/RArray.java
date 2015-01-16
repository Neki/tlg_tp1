
public class RArray {

    private Object[] tab;
    private int taille;

    public RArray(int capacite) {
	if(capacite>0) {
	    tab = new Object[capacite];
	    taille = 0;
	}
    }

    public void clear() {
	taille = 0;
    }

    public boolean contains(Object e) {
	for(int i=0;i<taille;i++) {
	    if(tab[i].equals(e)) {
		return true;
	    }
	}
	return false;
    }

    public int nbOcc(Object e) {
	int nb = 0;
	for(int i=0;i<taille;i++) {
	    if(tab[i].equals(e)) {
		nb++;
	    }
	}
	return nb;
    }

    public int index(Object e) {
	for(int i=0;i<taille;i++) {
	    if(tab[i].equals(e)) {
		return i;
	    }
	}
	return -1;
    }

    private void resize(int capacite) {
	if(capacite > tab.length) {
	    Object[] tab2 = new Object[capacite];
	    for(int i=0;i<taille;i++) {
		tab2[i] = tab[i];
	    }
	    this.tab = tab2;
	}
    }

    public void add(Object e) {

	if(taille >= tab.length) {
	    resize(taille*2);
	}
	tab[taille] = e;
	taille += 1;

    }

    public Object replace(Object e,int indice) {
	if(indice>=0 && indice<taille) {
	    Object s = tab[indice];
	    tab[indice] = e;
	    return s;
	}
	else {
	    return null;
	}
    }

    public Object removeInd(int indice) {
	if(0<=indice && indice<taille) {
	    Object res = tab[indice];
	    for(int i = indice; i<taille; i++) {
		tab[i] = tab[i+1];
	    }
	    taille = taille - 1;
	    return res;
	} else {
	    return null;
	}
    }

    public boolean remove(Object e) {
	int i = 0;
	int j = 0;
	while(i+j < taille) {
	    if(tab[i+j].equals(e)) {
		j++;
	    } else {
		tab[i] = tab[i+j];
		i++;
	    }
	}
	int newtaille = i;
	while(i<taille) {
	    tab[i] = null;
	    i++;
	}
	taille = newtaille;
	return true;
    }	

}
