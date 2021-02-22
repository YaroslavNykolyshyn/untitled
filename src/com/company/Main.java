package com.company;


public class Main {
    public static void main(String[] args) {
        Воїн1 воїн2 = new Воїн1(100,70);
        Воїн1 воїн3 = new Воїн1(150,111);
        Воїн1 воїн4 = new Воїн1(145,79);
        int Butva_2_ptotu_3= воїн2.hp- воїн3.domage;
        int Butva_3_ptotu_2= воїн3.hp- воїн2.domage;
        int Butva_4_ptotu_2= воїн4.hp- воїн2.domage;
        int Butva_2_ptotu_4= Butva_2_ptotu_3- воїн4.domage;
        int Butva_3_ptotu_4= Butva_3_ptotu_2- воїн4.domage;
        int Butva_4_ptotu_3= Butva_4_ptotu_2 - воїн3.domage;



        System.out.println("Zdorovya voyina 2=>" + Butva_2_ptotu_3 );
        System.out.println("Zdorovya voyina 3=>" + Butva_3_ptotu_2 );
        System.out.println("Zdorovya voyina 4=>" + Butva_4_ptotu_2 );
        System.out.println("Zdorovya voyina 2=>" + Butva_2_ptotu_4 );
        System.out.println("Zdorovya voyina 3=>" + Butva_3_ptotu_4 );
        System.out.println("Zdorovya voyina 4=>" + Butva_4_ptotu_3 );


        if (Butva_2_ptotu_3<=0){
            System.out.println("Voyin2 pomer& ");
        }
        else {
            System.out.println("Voyin2 zhiviy " );
        }
        if (воїн4.hp<=0){
            System.out.println("Voyin4 pomer");
        }
        else {
            System.out.println("Voyin4 zhiviy");
        }
        if (воїн3.hp<=0){
            System.out.println("Voyin3 pomer");
        }
        else {
            System.out.println("Voyin3 zhiviy");
        }




    }

}
