/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.gt.resource;

import com.edu.gt.dtos.*;
import com.edu.gt.services.PasswordGeneratorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Jose
 */
@Path("/passwords")
public class GeneratePasswordResource {

    @Inject
    PasswordGeneratorService passwordGeneratorService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/new")
    public PasswordConfigResponseDto generateNewPassword(PasswordConfigRequestDto request){
        String newPassword = passwordGeneratorService.generatePassword(request);
        PasswordConfigResponseDto response = new PasswordConfigResponseDto();
        response.setResult(newPassword);
        return response;
    }

}
