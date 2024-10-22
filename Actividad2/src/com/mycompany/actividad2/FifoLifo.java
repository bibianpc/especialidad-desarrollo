package com.mycompany.actividad2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FifoLifo {
    public static void main(String[] args){
        Queue<String> colaFIFO = new LinkedList<>();
        colaFIFO.offer("Elemento1");
        colaFIFO.offer("Elemento2");
        colaFIFO.offer("Elemento3");
        String primeroEnColaFIFO = colaFIFO.poll();
        System.out.println("Cola (FIFO): Primer elemento desencolado: " + primeroEnColaFIFO);

        Deque<String> pilaLIFO = new LinkedList<>();
        pilaLIFO.addFirst("Elemento1");
        pilaLIFO.addFirst("Elemento2");
        pilaLIFO.addFirst("Elemento3");
        String primeroEnPilaLIFO = pilaLIFO.removeFirst();
        System.out.println("Pila LIFO: Primer elemento desapilado: " + primeroEnColaFIFO);
     }


}
