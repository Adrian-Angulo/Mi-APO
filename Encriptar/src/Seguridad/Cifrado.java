/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seguridad;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.ResourceBundle;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author sistemas
 */
public class Cifrado {
    
    private ResourceBundle env;
    private String claveSecreta;

    public Cifrado() {
        this.env = ResourceBundle.getBundle("jdbc");
        this.claveSecreta = env.getString("clavesecreta");
    }
      
    private SecretKeySpec crearClave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        
        byte[] claveEncriptar = clave.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        
        claveEncriptar = sha.digest(claveEncriptar);
        claveEncriptar = Arrays.copyOf(claveEncriptar,16);
        
        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptar, "AES");
        
        return secretKey;
        
    }
    
    public String encriptar(String datos) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        SecretKeySpec secretKey = this.crearClave(this.claveSecreta);
        
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        byte[] datosEncriptar = datos.getBytes("UTF-8");
        byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);
        
        return encriptado;
        
    }
    public String desencriptar(String datos) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        SecretKeySpec secretKey = this.crearClave(this.claveSecreta);
        
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        
        byte[] datosDesencriptar = Base64.getDecoder().decode(datos);
        byte[] bytesDesencriptados = cipher.doFinal(datosDesencriptar);
        String encriptado = new String(bytesDesencriptados);
        
        return encriptado;
        
    }
}
