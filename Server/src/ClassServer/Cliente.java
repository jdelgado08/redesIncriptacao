/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassServer;

/**
 *
 * @author Marques
 */
public class Cliente {
    String nome;
    int id_cliente;
    String ip_cliente;
    String msm;
    
    
    public Cliente(){
        nome = "";
        id_cliente = 0;
        ip_cliente = "0.0.0.0";
        msm = "";
    }
    
    public Cliente(String nome, int id_cliente, String ip_cliente, String msm){
        this.nome = nome;
        this.id_cliente = id_cliente;
        this.ip_cliente = ip_cliente;
        this.msm = msm;
    }

    /**
     * @return the nome
     */
    public String getCliente() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setCliente(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the ip_cliente
     */
    public String getIp_cliente() {
        return ip_cliente;
    }

    /**
     * @param ip_cliente the ip_cliente to set
     */
    public void setIp_cliente(String ip_cliente) {
        this.ip_cliente = ip_cliente;
    }

    /**
     * @return the msm
     */
    public String getMsm() {
        return msm;
    }

    /**
     * @param msm the msm to set
     */
    public void setMsm(String msm) {
        this.msm = msm;
    }
    
}
