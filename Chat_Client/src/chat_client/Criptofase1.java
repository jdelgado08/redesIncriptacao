/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_client;

import java.math.BigInteger;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Marques
 */
public class Criptofase1 {
    
    private static String k;
    
    
    public static void setKey(String key){
        k = key;
    }
    
    
    public static String strxor(String a, String b){
        if(a.length() > b.length()){
            String result = "";
            byte[] stra = a.getBytes();
            byte[] strb = b.getBytes();
            
            for(int i=0;i<strb.length;i++){
                byte aux = (byte) (stra[i]^strb[i]);
                result += (char)aux;
            }
            
            return result;
        }else{
            int count = 0;
            String result = "";
            byte[] stra = a.getBytes();
            byte[] strb = b.getBytes();
            
            for(int i=0;i<strb.length;i++){
                byte aux = (byte) (stra[count]^strb[i]);
                result += (char)aux;
                
                if(count < a.length()-1) count++;
                else count = 0;
            }
            
            return result;
        }
        
    }
    
    
    public static String generateKey(){
        Random key = new Random();
        String strkey = String.valueOf(key.nextInt(1024)).toString();
        k = strkey;
        
        return strkey;
    }
    
    
    public static String encrypt(String key, String str){
              
        String aux = strxor(key, str);
        
        return toHex(aux);
    }
    
    
    public static String toHex(String s){
        return String.format("%040x", new BigInteger(1, s.getBytes()));
    }
    
    
    public static String Decrypt(String key, String msmHex){
        byte[] auxB = DatatypeConverter.parseHexBinary(msmHex);
        String result= new String(auxB);
        String aux = strxor(key, result);
        
        return aux;
    }
    
    
    public static String xorEncryption(String a,String b){
        String aux = "";
        byte[] elemA = DatatypeConverter.parseHexBinary(a);
        byte[] elemB = DatatypeConverter.parseHexBinary(b);
        int mark = 0;
        
        if(elemA.length > elemB.length) mark = elemB.length;
        else if(elemA.length < elemB.length) mark = elemA.length;
        else mark = elemA.length;
        
        for(int i=0;i < mark;i++){
            byte auxb = (byte) (elemA[i] ^ elemB[i]);
            aux += (char)auxb;
        }
        
        return aux;
    }
    
    
    
    public static String binToString(String bin){
        String aux = "";
        for(int i=0;i<bin.length();i+=8){
            int k = Integer.parseInt(bin.substring(i, i+8), 2);
            aux += (char) k;
        }
        
        return aux;
    }
    
}
