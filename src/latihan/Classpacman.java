package gamepacman;

public class Classpacman {

    private int x=1, y=1,pindah,score;
 
    public void setXkanan() {
        x++;//update array
        pindah--;//update sisa pindah
    }

    public void setYturun() {
        y++;
        pindah--;
    }

    public void setXkiri() {
        x--;
        pindah--;
    }

    public void setYnaik() {
        y--;
        pindah--;
    }

    public int X() {
        return x;
    }

    public int Y() {
        return y;
    }
    public int getPindah(){
        return pindah;
    }
    public void setPindah(int p){
        pindah = p;
    }
    public void setScore(){
        score++;
    }
    public int getScore(){
        return score;
    }
}
