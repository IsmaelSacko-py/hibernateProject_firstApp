package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Produits {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "libelle")
    private String libelle;
    @Basic
    @Column(name = "quantite")
    private int quantite;
    @Basic
    @Column(name = "prix")
    private int prix;
    @Basic
    @Column(name = "idCategorie")
    private int idCategorie;
    @ManyToOne
    @JoinColumn(name = "idCategorie", referencedColumnName = "id", nullable = false)
    private Categories categoriesByIdCategorie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produits produits = (Produits) o;
        return id == produits.id && quantite == produits.quantite && prix == produits.prix && idCategorie == produits.idCategorie && Objects.equals(libelle, produits.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, quantite, prix, idCategorie);
    }

    public Categories getCategoriesByIdCategorie() {
        return categoriesByIdCategorie;
    }

    public void setCategoriesByIdCategorie(Categories categoriesByIdCategorie) {
        this.categoriesByIdCategorie = categoriesByIdCategorie;
    }
}
