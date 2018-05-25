import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Ficha> fic= new ArrayList <Ficha>();
    ArrayList<Atributo> atribut= new ArrayList <Atributo>();
    
    Ficha f = new Ficha ();
    Atributo at = new Atributo();
    
    f.setCategoria();
    f.setnomeJogador();
    
    Scanner entrada = new Scanner(System.in);
    for(i=0;i<fic.size;i++){
      fic.add(f);
    }
    
    String classe = entrada.next(); 
    int maxhp=entrada.nexInt();
    int meleedmg=entrada.nexInt();
    int hp=entrada.nexInt();
    int xp=entrada.nexInt();
    int level=entrada.nexInt();
        
    for(Atributo atrib : atribut){
    atrib.setClasse(classe);
    atrib.setMaxhp(maxhp);
    atrib.setMeleedmg(meleedmg);
    atrib.setHp(hp);
    atrib.setXp(xp);
    atrib.setLevel(level);
    }
  }
}
