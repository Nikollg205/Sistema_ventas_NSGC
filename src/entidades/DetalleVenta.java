/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author nikol
 */
public class DetalleVenta {
    private int id;
    private int ventaId; 
    private int articuloId;
    private String articuloCodigo; 
    private String ariculoNombre;
    private int articuloStock;
    private int cantidad;
    private double precio;
    private double descuento;
    private double subtotal;

    public DetalleVenta() {
    }

    public DetalleVenta(int id, int ventaId, int articuloId, String articuloCodigo, String ariculoNombre, int articuloStock, int cantidad, double precio, double descuento, double subtotal) {
        this.id = id;
        this.ventaId = ventaId;
        this.articuloId = articuloId;
        this.articuloCodigo = articuloCodigo;
        this.ariculoNombre = ariculoNombre;
        this.articuloStock = articuloStock;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.subtotal = subtotal;
    }

    public DetalleVenta(int articuloId, String articuloCodigo, String ariculoNombre, int articuloStock, int cantidad, double precio, double descuento, double subtotal) {
        this.articuloId = articuloId;
        this.articuloCodigo = articuloCodigo;
        this.ariculoNombre = ariculoNombre;
        this.articuloStock = articuloStock;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.subtotal = subtotal;
    }

    public DetalleVenta(int articuloId, int cantidad, double precio, double descuento) {
        this.articuloId = articuloId;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    public String getArticuloCodigo() {
        return articuloCodigo;
    }

    public void setArticuloCodigo(String articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

    public String getAriculoNombre() {
        return ariculoNombre;
    }

    public void setAriculoNombre(String ariculoNombre) {
        this.ariculoNombre = ariculoNombre;
    }

    public int getArticuloStock() {
        return articuloStock;
    }

    public void setArticuloStock(int articuloStock) {
        this.articuloStock = articuloStock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
    
}
