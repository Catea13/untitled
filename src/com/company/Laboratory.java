package com.company;

import java.util.ArrayList;

 public class Laboratory <T> {


        //Cream  generic datele
        public T corpus;
        public T nr_aud;
        public T locuri;


        //Cream constructor
        public Laboratory(T corpus, T nr_aud, T locuri) {
            this.corpus = corpus;
            this.nr_aud = nr_aud;
            this.locuri = locuri;
        }

        @Override
        public String toString() {
            return "Laboratory{" +
                    "corpus=" + corpus +
                    ", nr_aud=" + nr_aud +
                    ", locuri=" + locuri +
                    '}';
        }

     public T getCorpus() {
         return corpus;
     }

     public void setCorpus(T corpus) {
         this.corpus = corpus;
     }

     public T getNr_aud() {
         return nr_aud;
     }

     public void setNr_aud(T nr_aud) {
         this.nr_aud = nr_aud;
     }

     public T getLocuri() {
         return locuri;
     }

     public void setLocuri(T locuri) {
         this.locuri = locuri;
     }

     public static void main(String[] args) {


            //cream lista (cu operatia add)
            ArrayList<Laboratory> labaratory = new ArrayList<Laboratory>();
            labaratory.add(new Laboratory(1, "444", 77));
            labaratory.add(new Laboratory("2", 488, 7));
            labaratory.add(new Laboratory(3, "499", "18"));
            labaratory.add(new Laboratory("4", 255, "16"));
            labaratory.add(new Laboratory("1", "300", 12));

            // afiseaza  toate elementele
          for(Laboratory lab:labaratory)
              System.out.println(lab);
          //Afiseaza primul element
            for(int i=0;i<labaratory.size();i++);
         System.out.println(labaratory.get(0));

        }

    }



