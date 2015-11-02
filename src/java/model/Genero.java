/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public enum Genero {
    COMEDIA {
        @Override
        public String toString() {
            return "COMEDIA";
        }
    
    },
    ACAO{
        @Override
        public String toString() {
            return "ACAO";
        }
    
    },FICCAO{
        @Override
        public String toString() {
            return "FICCAO";
        }
    
    },DRAMA{
        @Override
        public String toString() {
            return "DRAMA";
        }
    
    },DOCUMENTARIO{
        @Override
        public String toString() {
            return "DOCUMENTARIO";
        }
    
    };
}
