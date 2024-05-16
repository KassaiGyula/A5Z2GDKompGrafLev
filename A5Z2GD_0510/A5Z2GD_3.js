$(document).ready(function()
    {
    $("#btn").click(function()
        {
        a = $("#a").val();
        b = $("#b").val();

        if($("#mult").prop("checked"))
            {
            $("#result").html(a*b);
            }
        if($("#div").prop("checked"))
            {
            $("#result").html(a/b);
            }
        if($("#add").prop("checked"))
            {
            $("#result").html(Number(a)+Number(b));
            }
        if($("#sub").prop("checked"))
            {
            $("#result").html(a-b);
            }
        });
    });