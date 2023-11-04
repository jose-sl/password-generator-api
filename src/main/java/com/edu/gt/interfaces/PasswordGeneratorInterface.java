/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.gt.interfaces;

import com.edu.gt.dtos.PasswordConfigRequestDto;

/**
 *
 * @author Jose
 */
public interface PasswordGeneratorInterface {
    
    public String generatePassword(PasswordConfigRequestDto request);
    
    public String shufflePassword(StringBuilder password);
    
}
