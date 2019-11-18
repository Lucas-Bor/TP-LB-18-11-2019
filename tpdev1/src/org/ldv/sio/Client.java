package org.ldv.sio;

public class Client {
  private String nom;
  private String prenom;
  private Adresse domicile;
  private Adresse[] livraison = new Adresse[10];
  private Adresse[] livraison2 = new Adresse[10];

  public Client(String nom, String prenom, Adresse domicile) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison[0] = domicile;
    this.livraison2[0] = domicile;
  }

  public Client(String nom, String prenom, Adresse domicile,Adresse livraison) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison[0] = domicile;
  }

  public Client(String nom, String prenom,Adresse domicile,Adresse livraison,Adresse livraison2) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison[0] = livraison;
    this.livraison2[0] = livraison2;
  }

  public Adresse getDomicile() {

    return domicile;
  }

  public Adresse getLivraison(int i) { 

    return livraison[i]; }

  public void setLivraison(Adresse livraison, int i ) { 

    this.livraison[i] = livraison; }

  public Adresse getLivraison2(int i) {

    return livraison2[i];
  }

  public void setLivraison2(Adresse livraison2, int i ) { 

    this.livraison2[i] = livraison2; }

  public void setDomicile(Adresse domicile) {

    this.domicile = domicile;
  }

  public String getNom() {

    return nom;
  }

  public void setNom(String nom) {

    this.nom = nom;
  }

  public String getPrenom() {

    return prenom;
  }

  public void setPrenom(String prenom) {

    this.prenom = prenom;
  }

  @Override
  public String toString() {
    return "Client {" +
            "nom = '" + nom + '\'' +
            ", prenom = '" + prenom + '\'' + 
            ", domicile = '" + domicile + '\'' + 
            ", livraison = '" + livraison + '\'' + 
            ", livraison2 = '" + livraison2 + '\'' + 
            '}';
  }
}
