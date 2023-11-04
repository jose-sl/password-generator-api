/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.gt.dtos;

/**
 *
 * @author Jose
 */
public class PasswordConfigRequestDto {
    
    private int lenght;
    private boolean restrictMinDigits;
    private int minDigits;
    private boolean restrictMinUpperCaseLetters;
    private int minUpperCaseLetters;
    private boolean restrictMinLowerCaseLetters;
    private int minLowerCaseLetters;
    private boolean restrictMinNonAlphanumericCharacters;
    private int minNonAlphanumericCharacters;
    private int minLength;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isRestrictMinDigits() {
        return restrictMinDigits;
    }

    public void setRestrictMinDigits(boolean restrictMinDigits) {
        this.restrictMinDigits = restrictMinDigits;
    }

    public int getMinDigits() {
        return minDigits;
    }

    public void setMinDigits(int minDigits) {
        this.minDigits = minDigits;
    }

    public boolean isRestrictMinUpperCaseLetters() {
        return restrictMinUpperCaseLetters;
    }

    public void setRestrictMinUpperCaseLetters(boolean restrictMinUpperCaseLetters) {
        this.restrictMinUpperCaseLetters = restrictMinUpperCaseLetters;
    }

    public int getMinUpperCaseLetters() {
        return minUpperCaseLetters;
    }

    public void setMinUpperCaseLetters(int minUpperCaseLetters) {
        this.minUpperCaseLetters = minUpperCaseLetters;
    }

    public boolean isRestrictMinLowerCaseLetters() {
        return restrictMinLowerCaseLetters;
    }

    public void setRestrictMinLowerCaseLetters(boolean restrictMinLowerCaseLetters) {
        this.restrictMinLowerCaseLetters = restrictMinLowerCaseLetters;
    }

    public int getMinLowerCaseLetters() {
        return minLowerCaseLetters;
    }

    public void setMinLowerCaseLetters(int minLowerCaseLetters) {
        this.minLowerCaseLetters = minLowerCaseLetters;
    }

    public boolean isRestrictMinNonAlphanumericCharacters() {
        return restrictMinNonAlphanumericCharacters;
    }

    public void setRestrictMinNonAlphanumericCharacters(boolean restrictMinNonAlphanumericCharacters) {
        this.restrictMinNonAlphanumericCharacters = restrictMinNonAlphanumericCharacters;
    }

    public int getMinNonAlphanumericCharacters() {
        return minNonAlphanumericCharacters;
    }

    public void setMinNonAlphanumericCharacters(int minNonAlphanumericCharacters) {
        this.minNonAlphanumericCharacters = minNonAlphanumericCharacters;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    
}
