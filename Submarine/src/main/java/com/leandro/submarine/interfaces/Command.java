package com.leandro.submarine.interfaces;

public interface Command<T> {

    /**
     * This method returns the character corresponding to this command. Possible values are
     * <ul>
     * <li><b>'L'</b> - Turn Left</li>
     * <li><b>'R'</b> - Turn Right</li>
     * <li><b>'M'</b> - Move to current pointing direction</li>
     * <li><b>'U'</b> - Go Up</li>
     * <li><b>'D'</b> - Go Down</li>
     * </ul>
     * 
     * @return Character
     */
//    public Character getValue();

    /**
     * This method executes the current command into a position, and returns the changed position
     * 
     * @param position
     * @return Position
     */
    public T execute(T t);

}
