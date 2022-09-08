/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author PHOTON
 */
public class Ex01PhotonTuason {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String book1 = "When Breath Becomes Air";
        int publishdate1 = 2016;
        float rating1 = 4.38f;   
        
        String book2 = "Last Night at the Telegraph Club";
        int publishdate2 = 2021;
        float rating2 = 4.27f;  
        
        String book3 = "The Three Cornered World";
        int publishdate3 = 1906;
        float rating3 = 3.81f;
        
        
        System.out.printf("Book Name: %s%nYear of Publishing: %d%nGoodreads "
                + "Rating: %.2f", book1, publishdate1, rating1);
        System.out.printf("%n%nBook Name: %s%nYear of Publishing: %d%nGoodreads "
                + "Rating: %.2f", book2, publishdate2, rating2);
        System.out.printf("%n%nBook Name: %s%nYear of Publishing: %d%nGoodreads "
                + "Rating: %.2f", book3, publishdate3, rating3);
        
        System.out.printf("%n%nLast Night at the Telegraph Club and When Breath"
                + " Becomes air were published in the same year: " + (publishdate1
                        == publishdate2));
        System.out.printf("%nWhen Breath Becomes air has a higher goodreads rating"
                + " than The Three Cornered World: " + (rating1 > rating2));
        System.out.printf("%nThe Three Cornered World was published earlier than"
                + " Last Night at the Telegraph Club: " + (publishdate3 < publishdate2));
    }
    
}
