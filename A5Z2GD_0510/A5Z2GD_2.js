$(document).ready(function()
    {
    $("#gomb1").click(function()
        {
        $("#terulet").append("Programtervező informatikus");
        });
    $("#gomb2").click(function()
        {
        $("#gomb2").prepend("<b>PTI</b>");
        });
    $("#gomb3").click(function()
        {
        $("body").append("<br><br><button>THE</button>");
        });
    $("#gomb4").click(function()
        {
        $("body").prepend("<h1>jQuery feladat</h1>","<br>Felveszem ide...<br><br>");
        });
    $("#gomb5").click(function()
        {
        $("h1").after("<h3>Animáció - ez lesz az alcím</h3>");
        });
    $("#gomb6").click(function()
        {
        $("form").before("<h2>ŰRLAP-A5Z2GD</h2>");
        });
    });