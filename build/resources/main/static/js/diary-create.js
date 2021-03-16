$(function(){

    if(!$("#input-chk-prvt").is("checked")){
        console.log("요기기");
       $("div.add-members").show();
        $(this).val("N");
    }else{
    console.log("요기기22");
           $("div.add-members").hide();
    }
});