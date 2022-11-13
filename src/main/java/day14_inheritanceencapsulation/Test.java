package day14_inheritanceencapsulation;

public class Test {

    private double genislik;
    private double yukseklik;
    private double ekranBuyukluk;  //bu alti madde data dir
    private int maxSes=30;
    private int ses=12;
    private boolean guc;

    public Test(double genislik,double yukseklik,double ekranBuyuklugu){  //consturcter olusturdum

        this.genislik=genislik;
        this.yukseklik=yukseklik;
        this.ekranBuyukluk=ekranBuyukluk;

    }

    public double kanalDegistirme(int kanal){
        switch (kanal){
            case 1:  //bu kanalllar
            return 34.75;

            case 2:
                return 45.23;

            case 3:
                return 50.89;
        }
        return 0;  //bu
    }
    public void gucDugmesi(){
        this.guc=!guc;                //aciksa kapat kapaliysa ac
    }

    public int sesAzaltma(){
        if(0<ses){     //ses pozitifse azaltir
            ses--;
        }
        return ses;

    }
    public  int sesArtirma(){  //maxses den kucukse
       if( maxSes>ses){
           ses++;
       }
       return ses;
    }

}
