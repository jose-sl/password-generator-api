/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.gt.services;

import com.edu.gt.dtos.PasswordConfigRequestDto;
import com.edu.gt.interfaces.PasswordGeneratorInterface;
import jakarta.enterprise.context.ApplicationScoped;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jose
 */

@ApplicationScoped
public class PasswordGeneratorService implements PasswordGeneratorInterface{

    private static char[] LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char[] UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static char[] NUMBERS = "0123456789".toCharArray();
    private static char[] ALPHANUMERICS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    private static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    private static Random rdm = new SecureRandom();

    
    @Override
    public String generatePassword(PasswordConfigRequestDto request) {
        
        // Validacion de campo RestricMinDigits si es false se generala contraseña solo por tamaño
        if (!request.isRestrictMinDigits()){
            
            // Validamos que la longitud sea mayor o igual a 8 caracteres
            if (request.getLenght() > 7 ){
                
                // Se seleccionan caracteres base: minuscula, mayuscula, numero y caracter
                StringBuilder psw = (new StringBuilder())
                        .append(LOWER_CASE_LETTERS[rdm.nextInt(LOWER_CASE_LETTERS.length)])
                        .append(UPPER_CASE_LETTERS[rdm.nextInt(UPPER_CASE_LETTERS.length)])
                        .append(NUMBERS[rdm.nextInt(NUMBERS.length)])
                        .append(ALPHANUMERICS[rdm.nextInt(ALPHANUMERICS.length)]);
                
                // Se rellena de caracteres el resto de la cadena
                for (int i = 4; i < request.getLenght(); i++) {
                    psw.append(ALL_CHARS[rdm.nextInt(ALL_CHARS.length)]);
                }
                
                System.out.println("La contraseña sin ordenar: ".concat(psw.toString()));
                
                // Se mueven de posicion los caracteres
                return shufflePassword(psw);
            }else{
                return "La longitud solicitada debe ser al menos de 8 caracteres";
            }            
        }// Se genera la contraseña con las políticas especificadas en el request
        else{
            
            // Se formara la contraseña segun los mínimos solicitados
            StringBuilder psw = new StringBuilder();
            
            // Se valida si requiere minDigits
            if (request.isRestrictMinDigits())
            for (int i = 0; i < request.getMinDigits(); i++) {
                psw.append(NUMBERS[rdm.nextInt(NUMBERS.length)]);
            }
            
            // Se valida si requiere minUppserCaseLetters
            if (request.isRestrictMinUpperCaseLetters())
            for (int i = 0; i < request.getMinUpperCaseLetters(); i++) {
                psw.append(UPPER_CASE_LETTERS[rdm.nextInt(UPPER_CASE_LETTERS.length)]);
            }
            
            // Se valida si requiere minLowerCaseLetters
            if (request.isRestrictMinLowerCaseLetters())
            for (int i = 0; i < request.getMinLowerCaseLetters(); i++) {
                psw.append(LOWER_CASE_LETTERS[rdm.nextInt(LOWER_CASE_LETTERS.length)]);
            }
            
            // Se valida si requiere minNonAlphanumericCharacters
            if (request.isRestrictMinNonAlphanumericCharacters())
            for (int i = 0; i < request.getMinNonAlphanumericCharacters(); i++) {
                psw.append(ALPHANUMERICS[rdm.nextInt(ALPHANUMERICS.length)]);
            }
            
            for (int i = psw.toString().length(); i < request.getMinLength(); i++) {
                    psw.append(ALL_CHARS[rdm.nextInt(ALL_CHARS.length)]);
                }
            
            System.out.println("La contraseña sin ordenar: ".concat(psw.toString()));
            
            return shufflePassword(psw);
        }
    }  

    @Override
    public String shufflePassword(StringBuilder password) {
        List<String> characters = Arrays.asList(password.toString().split(""));
        Collections.shuffle(characters);
        String finalPsw = "";
        for (String character : characters){
                finalPsw += character;
        }
        return finalPsw;
    }
}
