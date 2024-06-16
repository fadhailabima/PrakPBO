/*
 *  File    : Animal.java
 *  NIM     : 24060121140172
 *  Nama    : Fadhail A Bima
 */

public abstract class Animal {
    
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
