/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectointerfaz;

/**
 *
 * @author Alan (Escritorio)
 */
public interface IGestionArticulo extends IArticuloBasico {
    void modificarArticulo(int opcion);
    void agregarArticulo();
    void buscarArticulo();
    void mostrarArticulos();
}
