package org.ldv.sio;
import Adresse;

public class Client {
  private String nom;
  private String prenom;
  private Adresse domicile;
  private Adresse livraison;
  private Adresse livraison2;
  private AdresseEtendu etendu;

  public Client(String nom, String prenom, Adresse domicile) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison = domicile;
    this.livraison2 = domicile;
  }

  public Client(String nom, String prenom,Adresse domicile,Adresse livraison,Adresse livraison2) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison = livraison;
    this.livraison2 = livraison2;
  }

  public Client(String nom, String prenom,Adresse domicile,Adresse livraison,Adresse livraison2,AdresseEtendu etendu) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison = livraison;
    this.livraison2 = livraison2;
    this.etendu = etendu;
  }

  public Adresse getDomicile() {
    return domicile;
  }

  public Adresse getLivraison() {
    return livraison;
  }

  public Adresse getEtendu() {
    return etendu;
  }

  public Adresse getLivraison2() {
    return livraison2;
  }

  public void setLivraison(Adresse livraison) {
    this.livraison = livraison;
  }

  public void setLivraison2(Adresse livraison2) {
    this.livraison2 = livraison2;
  }

  public void setDomicile(Adresse domicile) {
    this.domicile = domicile;
  }

  public void setEtendu(Adresse etendu) {
    this.etendu = etendu;
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
            ", etendu = '" + etendu + '\'' + 
            '}';
  }
}
