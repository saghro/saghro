/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie4.gereretudient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Etudient {
    private int id;
    private String nom;
    private List<Etudient> etudients= new ArrayList<Etudient>();

    public Etudient(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void addEtudient(Etudient e){
        etudients.add(e);
        System.out.println("etudient est bien ajouter...");
    }
    
    public void afficher(){    
        for (int i = 0; i < etudients.size(); i++) {
            System.out.println("code " +  etudients.get(i).getId() );
            System.out.println("nome " + etudients.get(i).getNom()  );
        }
    }
    public void removeEtudiant(int code ){
        for (int i = 0; i <etudients.size(); i++) {
            if(code == etudients.get(i).getId() ){
                etudients.remove(etudients.get(i));
             
            }
            else{
                System.out.println("l'etudiant n'exist pas ");
            }
                
            
        }
    }
    
    public void ReturnEtudiant (int code ){
         for (int i = 0; i <etudients.size(); i++) {
            if(code == etudients.get(i).getId() ){
               
                System.out.println("l'etudiant selectione de "+code+" est :" +(etudients.get(i)).getNom());
             
            }
            
            
        }
    }
}
