$(document).ready(function()
    {
    $("#start").click(function()
        {
        $("div").animate({left:'300px', width:'300px'}, 1000)
                .animate({top:'100px', height:'+=50px', fontSize: '30pt'}, 2000)
                .animate({left:'0px', opacity:'0.4'}, 1000)
                .animate({top:'0px', width:'150px', height:'50px', opacity:'1'}, 1000);
        });
    $("#eltuntet").click(function()
        {
        $("#p1").hide(2000);
        $("#p2").hide(2000, function()
            {
            $("#p3").hide(2000, function()
                {
                alert('A bekezdések elrejtése....');
                });
            });
        });
    $("#gomb").click(function()
        {
        $("div").slideUp(2000)
                .slideDown(2000)
                .animate({left:'300px', width:'300px'},1000);
        });
    });