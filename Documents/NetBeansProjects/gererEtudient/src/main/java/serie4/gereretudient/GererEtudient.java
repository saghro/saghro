/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package serie4.gereretudient;

/**
 *
 * @author PC
 */
public class GererEtudient {

    public static void main(String[] args) {
        Etudient e1 = new Etudient(11, "tipo");
        Etudient e2 = new Etudient(22, "saad");
        e1.addEtudient(e1);
        e1.addEtudient(e2);
        e1.afficher();
        
        System.out.println("--------------------------------------------------");
        e1.ReturnEtudiant(11);
    }
}
