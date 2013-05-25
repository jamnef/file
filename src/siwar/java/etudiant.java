
package siwar.java;

/**
 *
 * @author Eleve
 */
public class etudiant {
 
 public  int ID;
 public int Age;
 public String Nom;
 public String Prenom;
 etudiant()
 {
     
 }
 etudiant(int ident,int ane,String name,String surname)
 {
  ID=ident;
  Age=ane;
  Nom= name;
 Prenom= surname;
 }
 etudiant(etudiant e)
 {
  ID=e.ID;
  Age=e.Age;
  Nom= e.Nom;
 Prenom= e.Prenom;
 }
 public float calculMoy(float noteds,float noteexamen)
 {
  float moy;
  moy= (noteds*20/100)+(noteexamen*80/100);
  return moy;
 }
 public int calculAge(int anneNais) 
 {
  int anne=2013;
  Age=anne-anneNais;
  return Age;
 }
 public void presentation()
 { 
     System.out.println("l'identifiant est "+ID);
     System.out.println("le Nom est "+Nom);
     System.out.println("le prenom est "+Prenom);
     System.out.println("l'age est "+Age);
      
 }
            
    

public static void main(String [] args)
{
etudiant e1=new etudiant();
e1.ID=123;
e1.Nom="zeineb";
e1.Prenom="gharbi";
e1.Age=23;
etudiant e2= new etudiant(1, 2013,"sami","guizeni");
etudiant e3= new etudiant(e1);
System.out.println("************ presentation e1" );
e1.presentation();
System.out.println("************ presentation e2" );
e2.presentation();
System.out.println("************ presentation e3" );
e3.presentation();
etudiant e4=e3;
System.out.println("comparaison des variables");
System.out.println(e1==e2);
System.out.println(e1==e3);
System.out.println(e4==e3);

}
}