/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function mostrarSenha() {
    var senha = document.getElementById("senha");
    var confirme = document.getElementById("confirme");
    
    if (senha.type == "password") {
        senha.type = "text";
        
    } else {
        senha.type = "password";
        
    }
}


