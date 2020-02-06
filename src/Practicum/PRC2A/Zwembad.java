package Practicum.PRC2A;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;
    private Double inhoud;

    public Zwembad (Double width, Double length, Double depth){breedte = width;lengte = length;diepte = depth;}
    public Double getBreedte() {return breedte;}
    public Double getLengte() {return lengte;}
    public Double getDiepte() {return diepte;}


    public void setBreedte(Double nwWidth){ breedte = nwWidth; }
    public void setLengte(Double nwLength){ lengte = nwLength; }
    public void setDiepte(Double nwDepth){ diepte = nwDepth; }

    public double inhoud() {
        inhoud=breedte*lengte*diepte;
        {return inhoud;}
    }

    public String toString(){String x = "Dit zwembad is " + breedte + " meter breed, "+ lengte +" meter lang, en "+ diepte +" meter diep";return x;}
}