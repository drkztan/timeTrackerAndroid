package com.example.joans.timetracker;

/**
 * Interface que implementen aquelles classes que necessiten actualitzar
 * periòdicament el seu contingut mitjançant el mecanisme que proporciona un
 * objecte de classe {@link Actualitzador} derivada de {@link Handler}.
 * <p>
 * El que fa aquesta interface és exigir que les classes que la implementen
 * tinguin un mètode <code>updateTimeInformation</code>.
 *
 * @author joans
 * @version 24 gener 2012
 */
@SuppressWarnings("ALL")
public interface Actualitzable {

    /**
     * Conté el codi que updateTimeInformation el contingut de la interfase d'usuari que es
     * es mostra per part de la Activity que implementa aquesta interface.
     */
    void update();
}
