/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var myVar=setInterval(function () {myTimer()}, 1000);
//var counter = 0;
function myTimer() {
    var date = new Date();
    document.getElementById("demo").innerHTML = date.toUTCString();
    document.getElementById("two").innerHTML = date.toISOString();
    document.getElementById("three").innerHTML = "My cats breath smells like catfood";
}



