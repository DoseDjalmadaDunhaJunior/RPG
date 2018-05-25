package com.company;

public class Atributo {
    //para iniciar tudo zerado
   

public Atributo() {
        classe = null;
        maxhp=0;
        meleedmg=0;
        hp=0;
        xp=0;
        level=0;
   
    }
     public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
    public void setMaxhp(int maxhp) {
        this.maxhp=maxhp;
    }

    public int getMaxhp() {
        return maxhp;
    }
    public void setMeleedmg(int meleedmg) {
        this.meleedmg=meleedmg;
    }

    public int getMeleedmg() {
        return meleedmg;
    }
    public void setHp(int hp) {
        this.hp=hp;
    }

    public int getHp() {
        return hp;
    }
    public void setXp(int xp) {
        this.xp=xp;
    }

    public int getXp() {
        return xp;
    }
    public void setLevel(int level) {
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    private String classe;
    private  int maxhp;
    private  int meleedmg;
    private  int level;
    private  int hp;
    private  int xp;
}
